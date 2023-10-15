package LAB12;


import javax.swing.*;
import java.awt.*;
import java.util.Random;
public class TASK3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Случайные фигуры");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 720);
        frame.setLayout(new GridLayout(4,5));
        JPanel[] panels = new JPanel[20];
        for (int i = 0; i < 20; i++){
            panels[i] = new JPanel(){
                @Override
                protected void paintComponent(Graphics g) {
                    Random random = new Random();
                    int widthOrRadius = random.nextInt(50);
                    int height = random.nextInt(50);
                    if (random.nextBoolean()) {
                        Shape rect = new Rectangle(0, 0, widthOrRadius, height);
                        rect.draw(g);
                    } else {
                        Shape circle = new Circle(0, 0, widthOrRadius);
                        circle.draw(g);
                    }
                }
            };
            frame.add(panels[i]);
        }
        frame.setVisible(true);
    }
}