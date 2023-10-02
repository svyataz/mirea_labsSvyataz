package LAB5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class TASK1 {

    public static void main(String[] args){
        myWindow MyWindow = new myWindow();
        MyWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyWindow.setVisible(true);
        MyWindow.setResizable(false);
    }
}

