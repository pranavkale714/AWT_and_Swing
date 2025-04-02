package Awt_demo;

import java.awt.*;    

//extending Frame class to our class AWTExample1  
public class AWTExample2 extends Frame {    

// initializing using constructor  
AWTExample2() {  
	
	
	// frame size 300 width and 300 height    
	   setSize(300,300);  
	   
	// now frame will be visible, by default it is not visible    
	   setVisible(true); 
	   
	// setting the title of Frame  
	   setTitle("This is our basic AWT example");  
	   
	// creating a button   
	   Button b = new Button("Click Me!!");  
	   
	// adding button into frame    
	   add(b);  

	// setting button position on screen  
	   b.setBounds(30,100,80,30);  

	// no layout manager   
	   setLayout(null);   	   
	 
}    

//main method  
public static void main(String args[]) {   

//creating instance of Frame class   
AWTExample2 f = new AWTExample2();    

}  

}    
