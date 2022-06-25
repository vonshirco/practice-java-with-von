/*
 You can use as many parameters as you want
 */
package javaconstructors;

//Creating the parametersMain class
public class parametersMain {
    //Class attributes
    int modelYear;
    String modelName;
    
    //Creating a class constructor for the parametersMain
    public parametersMain(int year, String name){
        modelYear = year; //Setting initial values
        modelName = name;
    }
    
    //The main method
    public static void main(String[] args){
        //Creating an object of class parametersMain (for calling the constructor)
        parametersMain myCarObj = new parametersMain(1969, "Toyota");
        
        //Displaying
        System.out.println("My car name is " + myCarObj.modelName + " of year " + myCarObj.modelYear);
   
    }
}
