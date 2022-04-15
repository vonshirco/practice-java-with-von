/*
 A Program for for taking in the principle, rate and time from the user calculating the Simple Interest
and check the size of the Interest.
 */
package udsm.labs;

/**
 * @author von
 */
//Importing the Scanner Library
import java.util.Scanner;
public class simpleInterest2 {
    public static void main(String[] args){
        //Creating a Scanner Object
        Scanner sI = new Scanner(System.in);
        
        //Principle from the user
        System.out.println("Enter the Principle: ");
        double p = sI.nextDouble(); //Read user input
        
        //Rate from the user
        System.out.println("Enter the Rate: ");
        double r = sI.nextDouble(); //Read the user input
        
        //Time from the user
        System.out.println("Enter the Time: ");
        double t = sI.nextDouble(); //Read the user input
        
        //Calculating the Simple Interest
        double simpleInterest = (p*r*t)/100;
        
       //Checking Conditions
       if(simpleInterest > 10){
           System.out.println("UNACCEPTABLE RATE");
       }else{
           System.out.println("The Simple Interest is " + simpleInterest);
       } 
    }
}
