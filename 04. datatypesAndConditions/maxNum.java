
package udsm.datatypesandconditions;

import java.util.Scanner; //Import java library
public class maxNum {
    public static void main(String[] args){
        //Creating Scanner Object
        Scanner numObj = new Scanner(System.in);
        
        //First number from the user
        System.out.println("Enter the First number: ");
        double num1 = numObj.nextDouble();
        
        //Second number from the user
        System.out.println("Enter the second number: ");
        double num2 = numObj.nextDouble();
        
        //Third number from the user
        System.out.println("Enter the third number: ");
        double num3 = numObj.nextDouble();
        
        //Condition for the Largest number
        if(num1>num2 && num1>num3){
            System.out.println("The Largest number is "+num1);
        }else if(num2>num3){
            System.out.println("The Largest number is "+num2);
        }else{
            System.out.println("The Largest number is "+num3);
        }
    }
}
