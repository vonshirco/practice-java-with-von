package applets;

//Importing Libraries
import java.applet.*;
import java.awt.*;
/*<applet code="LoginApplet.class" width="400" height="400"></applet>*/

public class LoginApplets extends Applet {
 
    public void init(){
        Label l1 = new Label("Username");
        TextField t1 = new TextField(20);
            
        add(l1);
        add(t1);
        
        Label l2 = new Label("Password");
        TextField t2 = new TextField(20);
        
        add(l2);
        add(t2);
        
        Button b = new Button("Login");
        add(b);
    }
}
