/*Bugs - image does not display*/

package applets;

import java.awt.*;
import java.applet.*;

public class DisplayImage extends Applet {
    Image picture;
    
    //Initializing the Applet
    public void init(){
        picture = getImage(getCodeBase(), "pic.png");
    }
    
    public void paint(Graphics g){
        /*The drawImage() method of Graphics class is used to display the image
        The 4th argument of the drawImage() method is the ImageObserver object.
        The component class implements ImageObserver interface
        *So the current class object would also be treated as the ImageObserver
        *because the Applet class indirectlt extends the component class.
        */
        g.drawImage(picture, 30, 30, this);
    }
}
/*
<applets code="DiplayImage.class" width="300" height="300">
</applets>
*/