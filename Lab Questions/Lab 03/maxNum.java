/*
 Write a static method max3() that takes three int arguments and returns the value of 
the largest one.
 */
package udsm.labs;

import java.util.Scanner; //Importing Scanner Library

public class maxNum {
    
    //Static method max3()
    /*In Java, a static method is a method that belongs to a class rather than 
    an instance of a class. The method is accessible to every instance of a class, 
    but methods defined in an instance are only able to be accessed by that object 
    of a class*/
    
    public static double max3(double num1, double num2, double num3){
        double max = Math.max(num1,num2);
        max = Math.max(max, num3); 
        return max;
    }
    
    public static void main(String[] args){
        //Creating a Scanner Object
        Scanner myObj = new Scanner(System.in);
        
        //Accepting numbers from the user
        System.out.println("Enter the first number: ");
        double numb1 = myObj.nextDouble();
        
        System.out.println("Enter the second number: ");
        double numb2 = myObj.nextDouble();
        
        System.out.println("Enter the third number: ");
        double numb3 = myObj.nextDouble();
        
        //Calling the Static method
        double maxValue = maxNum.max3(numb1, numb2, numb3);
        System.out.println("The Largest number is " + maxValue); 
    }
}