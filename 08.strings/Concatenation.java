/*
 Concating strings form a new string  ie. the combination of multiple strings
The two ways:
By + operator
By concat() method
 */
package strings;

public class Concatenation {
    public static void main(String[] args){
        //By + operator
        String s = "Sachin" + " Tendulkar";
        System.out.println(s); //Sachin Tendulkar
        
        //with numbers
        String n = 50 + 30 + "Sachin" + 40 + 40;
        System.out.println(n);
    }
}
