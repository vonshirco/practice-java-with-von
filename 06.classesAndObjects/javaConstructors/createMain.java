/*
A constructor in Java is a special method that is used to initialize objects.
The constructor is called when an object of a class is created.
It can be used to set initial values for object attributes
 */
package javaconstructors;

//Creating the createMain class
public class createMain {
    int x; //Creating a class attribute
    
    //Creating a class constructor for the createMain class
    public createMain(){
        x = 5; //Setting the initial values for the class attribute x
    }
    
    //The main method
    public static void main(String[] args){
        //Creating an object of class createMain (This will call the constructor)
        createMain myObj = new createMain();
        
        //Displaying the value
        System.out.println(myObj.x);
    }
}

/*
Note:
The constructor name must match the class name and it cannot have a return type (like void)
Also constructor is called when object is created.
*/
