/*
 Java Program to Calculate Simple Interest
 */
package udsm.labs;

/**
 *
 * @author von
 */
public class simpleInterest {
    public static void main(String[] args){
        //Declaring Variables
        double p,r,t;
        
        //Assigning values to variables
        p = 10000; r = 5; t = 5;
        
        //Calculating the Simple Interest
        double sI = (p*r*t)/100;
        
        System.out.println("The Simple Interest is " + sI);
    }
}
