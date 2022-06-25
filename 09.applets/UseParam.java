/*Contains Bugs - program did not run*/

//Parameter in Applet

package applets;

//Importing Libraries
import java.applet.Applet;
import java.awt.Graphics;

public class UseParam extends Applet {
    public void paint(Graphics g){
        String str = getParameter("msg"); 
        /*The getParameter() method is used to get any information from the HTML file as a parameter */
        g.drawString(str,50,50);
    }
}

/*
<applet code="UseParam.class" width="300" height="300">
<param name="msg" value="Welcome to applet">
</applet>
*/