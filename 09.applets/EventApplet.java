/*Contains Bugs, program does not run*/
package applets;

//Importing Libraries
import java.applet.Applet;
import java.awt.TextField;
import java.awt.event.ActionListener;

public class EventApplet extends Applet implements ActionListener {
    Button b;
    TextField tf;
    
    //Initializing an Applet
    public void init (){
        tf = new TextField();
        tf.setBounds(30,40,150,20);
        
        b = new Button("Click");
        b.setBounds(80,150,60,50);
        
        add(b);
        add(tf);
        
        b.addActionListener(this);
        /*An ActionListener is a callback mechanism.
          Whenever a control it is added to fires an ActionEvent,
          the actionPerformed() method will be invoked.
        */
        
        setLayout(null); //Absolute positioning.
    }
    
    public void actionPerformed(ActionEvent e){
        tf.setText("Welcome");
    }
    
}
  
/*
<applet code="EventApplet.class" width="300" height="300">
</applet>
*/
