package Awt_demo;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWT_Action_Listner_4 implements ActionListener {
	Label name;
    Label password, msg;
    TextField tfname;
    TextField tfpwd;
    Button submit, cancel;
    
    public AWT_Action_Listner_4() {
    	
    	Frame f = new Frame();
        name = new Label("Name:");
        password = new Label("Password:");
        msg = new Label();
        tfname = new TextField();
        tfpwd = new TextField();
        submit = new Button("Submit");
        cancel = new Button("Cancel");
        
        

    
        submit.addActionListener(this);
        cancel.addActionListener(this);
        
        name.setBounds(150, 100, 80, 40);
        tfname.setBounds(250, 100, 220, 30);
        msg.setBounds(150, 250, 300, 30);
        password.setBounds(150, 150, 100, 40);
        tfpwd.setBounds(250, 150, 220, 30);
        submit.setBounds(250, 200, 80, 40);
        cancel.setBounds(360, 200, 80, 40);
        
        tfpwd.setEchoChar('*');
     
        f.add(name);
        f.add(tfname);
        f.add(msg);
        f.add(password);
        f.add(tfpwd);
        f.add(submit);
        f.add(cancel);
        
        f.setLayout(null);
        f.setSize(500, 300); // Increased window size to fit all components
        f.setVisible(true);

    }
	public static void main(String[] args) {
		AWT_Action_Listner_4 obj = new AWT_Action_Listner_4();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		  if (e.getSource() == submit) {
	            String name = tfname.getText();
	            String pwd = tfpwd.getText();
	            if (name.equals("Pranav") && pwd.equals("Admin")) {
	                msg.setText("Welcome " + name);
	            } else {
	                msg.setText("Invalid user credentials. Please try again...");
	            }
	        } else if (e.getSource() == cancel) {
	            tfname.setText(null);
	            tfpwd.setText(null);
	            msg.setText(""); // Clear the message when cancel is pressed
	        }
		
		
	}

}
