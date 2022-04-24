/*Write a java program to display the value of x on the computer screen where 
 x = 46/6 + 5 % 7*/

package udsm.classesandobjects;
 //Class
class valueClass{
    //Defining Method
    public double equation(){
        return (46/6) + (5%7);
    }
}

public class valueX {
    public static void main(String[] args){
        //Creaning an Object
        valueClass myValue = new valueClass();
        
        //Calling method
        double x = myValue.equation();
        
        //Displaying the output/Value of x
        System.out.println("The value of x is "+x);
    }
}
