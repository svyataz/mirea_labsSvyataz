package LAB22;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CAlculatorView{
    JFrame f;
    static double a=0,b=0,result=0;
    JTextField t;
    JButton buttons[];

    public JButton[] getButtons() {
        return buttons;
    }

    public JTextField getT() {
        return t;
    }

    public void printCalculator(ActionListener ButtonListener) {
        f = new JFrame("Calculator");
        t = new JTextField();
        t.setBounds(30, 40, 280, 30);
        String[] Lables = new String[]{"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"};
        buttons = new JButton[16];

        for (int i = 0; i < 16; i++) {
            buttons[i] = new JButton(Lables[i]);
            buttons[i].addActionListener(ButtonListener);
        }
        buttons[0].setBounds(40, 100, 50, 40);
        buttons[1].setBounds(110, 100, 50, 40);
        buttons[2].setBounds(180, 100, 50, 40);
        buttons[3].setBounds(250, 100, 50, 40);
        buttons[4].setBounds(40, 170, 50, 40);
        buttons[5].setBounds(110, 170, 50, 40);
        buttons[6].setBounds(180, 170, 50, 40);
        buttons[7].setBounds(250, 170, 50, 40);
        buttons[8].setBounds(40, 240, 50, 40);
        buttons[9].setBounds(110, 240, 50, 40);
        buttons[10].setBounds(180, 240, 50, 40);
        buttons[11].setBounds(250, 240, 50, 40);
        buttons[13].setBounds(40, 310, 50, 40);
        buttons[12].setBounds(110, 310, 50, 40);
        buttons[14].setBounds(180, 310, 50, 40);
        buttons[15].setBounds(250, 310, 50, 40);
        f.add(t);
        for (int i = 0; i < 16; i++) {
            f.add(buttons[i]);
        }
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(350, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
    }
}
