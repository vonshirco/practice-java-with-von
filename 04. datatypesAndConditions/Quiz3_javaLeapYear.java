
package udsm.datatypesandconditions;

/*
 Leap Year is a year which is divisible by 4z
 */
import java.util.Scanner; // Importing Scanner Library
public class Quiz3_javaLeapYear {
    public static void main(String[] args){
        //Creating a scanner Object
        Scanner yearValue = new Scanner(System.in);
        //Getting input from user
        System.out.println("Enter a Year: ");
        int year = yearValue.nextInt(); //Read user input
        
        boolean isLeapYear;
        isLeapYear = (year % 4 == 0); 
        isLeapYear = isLeapYear && (year % 100 != 0);
        isLeapYear = isLeapYear || (year % 400 == 0);
        
        System.out.println(isLeapYear);
        
    }
}
