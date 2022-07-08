/*
 Converting numbers to Strings (3 ways)
String s = "" + thenum
 */
package strings;

public class Numbers_2Strings {
   public static void main(String[] args){
       String s = "" + 1+2+3;
       
       System.out.println(s); //123 - converts
       System.out.println("" + 1+2+3); //123 - converts
       System.out.println("" + (1+2+3)); //6 - does not convert
       
       //Or
       System.out.println(Integer.toString(123)); //"123" - converts
       System.out.println(Double.toString(3.14)); //"3.14" - converts
       
       //Or
       System.out.println(String.valueOf(123)); //"123"
       
   } 
}
