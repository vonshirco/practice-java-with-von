//Painting in Applet
/*We can perfom painting operation in applet by the
mouseDragged() method of MouseMotionListener.
*/
package applets;

//Importing Libraries
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class MouseDrag extends Applet implements MouseMotionListener {
    //Initializing an Applet
    public void init(){
        addMouseMotionListener(this);
        setBackground(Color.red);
        /*The Java MouseMotionListener is notified whenever you move or drag the mouse
          It is notified against MouseEvent
        */
    }
    
    public void mouseDragged(MouseEvent me){
        Graphics g = getGraphics(); //The getGraphics() method of component class returns the object of Graphics.
        g.setColor(Color.white);
        g.fillOval(me.getX(), me.getY(), 5, 5); 
        /* getX() and getY() method of MouseEvent is used to get the current
        x-axis and y-axis respectively*/
    }
    
    public void mouseMoved(MouseEvent me){}
    
}

/*<applet code="MouseDrag.class" width="300" height="300">
</applet>*/
