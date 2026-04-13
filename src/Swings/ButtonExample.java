package Swings;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ButtonExample {

    JLabel l1;

    ButtonExample() {

        JFrame f = new JFrame("Button Example");

        l1 = new JLabel();
        l1.setBounds(50, 30, 600, 80);
        l1.setFont(new Font("Lucida Calligraphy", Font.BOLD, 24));

        JButton b1 = new JButton("India");
        JButton b2 = new JButton("Sri Lanka");

        b1.setBounds(80, 150, 120, 50);
        b2.setBounds(220, 150, 120, 50);

        // Button 1 Action
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l1.setText("India is pressed");
            }
        });

        // Button 2 Action
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l1.setText("Sri Lanka is pressed");
            }
        });

        // Add components
        f.add(b1);
        f.add(b2);
        f.add(l1);

        f.setSize(450, 300); // increased size
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ButtonExample();
    }
}