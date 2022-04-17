/*
Ternary operator can be used to perform the task of if...else statement
if condition is true the result of ? is returned, but if the condition is false the result : is returned
 */
package udsm.controlanditeration;

public class ifElseTernaryExample {
    public static void main(String[] args){
        //Defining a variables
        int num = 13;
        //Using ternary operator
        String output = (num%2 == 0)? "Even number":"Odd number";
        System.out.println(output);
    }
}
