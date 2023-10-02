package LAB5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myWindow extends JFrame{
    private int Click1 = 0;
    private int Click2 = 0;
    private ActionListener ButtonsListener;
    private JPanel panel1;
    private JPanel panel2;
    private JButton button1;
    private JButton button2;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private String label_text1, label_text2, label_text3;
    private class TASK1ButtonsListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if(command.equals("Milan")){
                label2.setText("Last Scorer: Milan");
                Click1+=1;
                if(Click1 > Click2){label3.setText("Winner: Milan");}
            } else if (command.equals("Madrid")) {
                label2.setText("Last Scorer: Madrid");
                Click2+=1;
                if(Click2 > Click1){label3.setText("Winner: Madrid");}
            }
            label1.setText(String.format("Result: %d X %d", Click1, Click2));
        }
    }
    public myWindow(){
        ButtonsListener = new TASK1ButtonsListener();
        panel1 = new JPanel();
        panel2 = new JPanel();
        setSize(300, 100);
        panel1.setPreferredSize(new Dimension(300, 50));
        panel2.setPreferredSize(new Dimension(300, 50));
        button1 = new JButton("AC Milan");
        button1.setActionCommand("Milan");
        button1.addActionListener(ButtonsListener);
        button2 = new JButton("Real Madrid");
        button2.setActionCommand("Madrid");
        button2.addActionListener(ButtonsListener);
        label_text1 = String.format("Result: %d X %d", Click1, Click2);
        label_text2 = "Last Scorer: N/A";
        label_text3 = "Winner: DRAW";
        label1 = new JLabel(label_text1, JLabel.CENTER);
        label2 = new JLabel(label_text2, JLabel.CENTER);
        label3 = new JLabel(label_text3, JLabel.CENTER);
        panel1.add(button1);
        panel1.add(button2);
        panel2.add(label1);
        panel2.add(label2);
        panel2.add(label3);
        getContentPane().add(BorderLayout.SOUTH,panel1);
        getContentPane().add(BorderLayout.NORTH,panel2);
        pack();
    }
}
