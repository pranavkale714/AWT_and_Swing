package Awt_demo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Swing_Action_Listner_7 implements ActionListener{
	
	JTextField tfemail;
	JTextField tfemailcopy;
	JLabel email;
	JButton loginbtn;
	
	public Swing_Action_Listner_7(){
		JFrame jf=new JFrame();
		email=new JLabel("Email");
		tfemail=new JTextField();
		tfemailcopy=new JTextField();
		loginbtn=new JButton("Login");
		
		email.setBounds(200,200,120,30);
		tfemail.setBounds(300,200,160,30);
		tfemailcopy.setBounds(500,200,160,30);
		loginbtn.setBounds(450,250,90,30);
           
		jf.add(loginbtn);
		jf.add(tfemail);
		jf.add(tfemailcopy);
		jf.add(email);
		
		
		loginbtn.addActionListener(this);
		
		jf.setSize(900,900);
		jf.setLayout(null);
		jf.setVisible(true);
		
}
public static void main(String[]args)
    {
	Swing_Action_Listner_7 obj=new Swing_Action_Listner_7();
	}



	
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	tfemailcopy.setText(tfemail.getText());
	
}
}
