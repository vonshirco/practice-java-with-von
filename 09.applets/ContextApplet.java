//Contains Bugs - Program does not run

//Applet Communication
 
package applets;

//Importing Libraries
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class ContextApplet extends Applet implements ActionListener {
    Button b;
    //Initializing an applet
    public void init(){
        b = new Button("Click");
        b.setBounds(50,50,50,50);
        
        add(b);
        
        b.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        AppletContext ctx = getAppletContext(); //java.applet.AppletContext class provides the facility of communucation between applets.
        Applet a = ctx.getApplet("app2"); //The getApplet() method returns thee object of Applet app2
        a.setBackground(Color.yellow);
    }
}

/*
<applet code="ContextApplet.class" width="150" height="150" name="app1"></applet>
<applet code="First.class" width="150" height="150" name="app2"></applet>
*/
