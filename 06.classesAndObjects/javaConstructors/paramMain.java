/*
 Constructors can also take parameters which is used to initialize attributes
 */
package javaconstructors;

//Creating the paramMain
public class paramMain {
    int x; //Creating a class attribute
    
    //Creating a class constructor for the paramMain class
    public paramMain(int y){ //passing the parameter y
        x = y; //Setting initial value
    }
    
    //Creating the main method
    public static void main(String[] args){
        //Creating an object of class paramMain (for calling the constructor)
        paramMain myObj = new paramMain(10); //passing the argument
        
        //Displaying the value
        int theValue =  myObj.x;
        
        System.out.println(theValue);
    }
}
