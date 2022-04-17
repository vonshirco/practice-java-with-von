/*
Program to get the absolute value of a number
 */
package udsm.datatypesandconditions;

//Importing Scanner Library
import java.util.Scanner; 

public class Quiz6b {
    public static void main(String[] args) {
        //Creating a Scanner object
        Scanner myObj = new Scanner(System.in);
        
        //Input from user
        System.out.println("Enter any number: ");
        double num = myObj.nextDouble(); //Read user input
        
        //Checking Condition(If number is negative or positive)
        if(num < 0){ //if num is negative change it to positive
            System.out.println("The Absolute Value is: " + (-1*num)); //
        }else{ //If num is positive
            System.out.println("The Absolute Value is: " + num);
        }
    }
}
