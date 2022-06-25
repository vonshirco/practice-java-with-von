
package applets;

//Importing Libraries
import java.applet.Applet;
import java.awt.Graphics;

public class First extends Applet {
    public void paint(Graphics g){
        g.drawString("Welcome", 150, 150); //width, height
    }
}

/*
<applet code="First.class" width="300" height="300">
</applet>
*/
