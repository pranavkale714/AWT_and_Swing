package Awt_demo; // Ensure a single package declaration

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Swing_6 implements ActionListener {
    JTextField tfemail;
    JTextField tfcopy;

    public static void main(String[] args) {
    	Swing_6 obj = new Swing_6();
        JFrame jf = new JFrame("Swing Demo");

        JLabel email = new JLabel("Email:");
        JLabel Password = new JLabel("Password:");
        obj.tfemail = new JTextField();
        obj.tfcopy = new JTextField();
        JButton loginbtn = new JButton("Submit");

        // Set bounds properly
        email.setBounds(50, 50, 130, 30);
        Password.setBounds(50, 100, 130, 30);
        obj.tfemail.setBounds(120, 50, 160, 30);
        obj.tfcopy.setBounds(120, 100, 160, 30);
        loginbtn.setBounds(120, 150, 90, 30);

        // Add ActionListener
        loginbtn.addActionListener(obj);

        // Add components to frame
        jf.add(email);
        jf.add(Password);
        jf.add(obj.tfemail);
        jf.add(obj.tfcopy);
        jf.add(loginbtn);

        // Set frame properties
        jf.setSize(400, 300);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tfcopy.setText(tfemail.getText());
    }
}
