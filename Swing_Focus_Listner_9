package Awt_demo;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.*;

public class Swing_Focus_Listner_9 extends JFrame implements FocusListener {
    JLabel nameLabel, emailLabel, msg1, msg2;
    JTextField nameField, emailField;

    Swing_Focus_Listner_9() {
        // Initializing components
        nameLabel = new JLabel("Name:");
        nameField = new JTextField(15);

        emailLabel = new JLabel("Email:");
        emailField = new JTextField(15);

        msg1 = new JLabel();
        msg2 = new JLabel();

        // Setting layout
        setLayout(new GridLayout(4, 2, 10, 10));

        // Adding components
        add(nameLabel);
        add(nameField);
        add(emailLabel);
        add(emailField);
        add(msg1);
        add(msg2);

        // Adding focus listeners
        nameField.addFocusListener(this);
        emailField.addFocusListener(this);

        // Setting window properties
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Swing_Focus_Listner_9();
    }

    @Override
    public void focusGained(FocusEvent e) {
        if (e.getSource() == nameField) {
            msg1.setText("Enter your name.");
        } else if (e.getSource() == emailField) {
            msg2.setText("Enter your email.");
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (e.getSource() == emailField) {
            msg1.setText("Name: " + nameField.getText());
            msg2.setText("Email: " + emailField.getText());
        }
        if (e.getSource() == nameField) {
            msg1.setText("Name: " + nameField.getText());
            msg2.setText("Email: " + emailField.getText());
        }
    }
}
