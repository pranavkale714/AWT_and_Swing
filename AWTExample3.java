package Awt_demo;

    // importing Java AWT class  
    import java.awt.*;    
      
    // class AWTExample3 directly creates instance of Frame class  
    class AWTExample3 {    
      
       // initializing using constructor  
       AWTExample3() {  
      
       // creating a Frame  
          Frame f = new Frame(); 
          
       // frame size 300 width and 300 height    
          f.setSize(400,300);  
      
       // creating a Label  
          Label l = new Label("Employee id:");   
        
       // creating a Button  
          Button b = new Button("Submit");  
      
       // creating a TextField  
          TextField t = new TextField();  
      
       // setting position of above components in the frame  
          l.setBounds(20, 80, 80, 30);  
          t.setBounds(20, 100, 80, 30);  
          b.setBounds(100, 100, 80, 30);  
      
       // adding components into frame    
          f.add(b);  
          f.add(l);  
          f.add(t);  
      
       // setting the title of frame  
          f.setTitle("Employee info");
       
          // no layout  
          f.setLayout(null);    
 
       // setting visibility of frame  
          f.setVisible(true);  
          

          
              
    }    
      
    // main method  
    public static void main(String args[]) {   
      
    // creating instance of Frame class   
    AWTExample3 awt_obj = new AWTExample3();    
      
    }  
      
    }    
