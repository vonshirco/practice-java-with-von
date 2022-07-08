/*
startsWith() and endsWith()
public boolean startsWith(String prefix) - tests if this string start with the specified prefix
public boolean endsWith(String suffix) - tests if this string ends with the specified suffix
 */
package strings;

public class Start_End {
   public static void main(String[] args){
       String s = "Sachin";
       System.out.println(s.startsWith("Sa")); //true
       System.out.println(s.endsWith("n")); //true
   } 
}
