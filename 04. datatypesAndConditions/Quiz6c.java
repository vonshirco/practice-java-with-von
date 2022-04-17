/*
 A java program that takes values of lenght and width of a rectangle from user and check if it is square
or not.
 */
package udsm.datatypesandconditions;

//Importing the Scanner Library
import java.util.Scanner;
public class Quiz6c {
   public static void main(String[] args){
       //Creating a Scanner Object
       Scanner myObj = new Scanner(System.in);
       
       //Length from the user
       System.out.println("Enter the length: ");
       double l = myObj.nextDouble();//Read user input
       
       //Width from the user
       System.out.println("Enter the Width: ");
       double w = myObj.nextDouble(); //Read user input
       
       //Checking if it's a square or not
       if(l==w){
           System.out.println("This is a Square");
       }else{
           System.out.println("This is a Rectangle");
       }
   }
          
}
