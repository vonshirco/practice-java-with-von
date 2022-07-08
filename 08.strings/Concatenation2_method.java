/*
 concat() method concatenates the specified string to the end of current string
syntax: public String concat(String another){} 
 */
package strings;

public class Concatenation2_method {
    public static void main(String[] args){
        String s1 = "Sachin";
        String s2 = " Tendulkar";
        
        String s3 = s1.concat(s2);
        
        System.out.println(s3); //Sachin Tendulkar
    }
}
