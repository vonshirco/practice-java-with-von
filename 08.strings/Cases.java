/*
public String toUpperCase() - converts all characters in a string to upper case
public String toLowerCase() - converts all characters in a string to lower case
 */
package strings;

public class Cases {
    public static void main(String[] args){
        String s = "Sachin";
        System.out.println(s.toUpperCase()); //SACHIN
        System.out.println(s.toLowerCase()); //sachin
        
        System.out.println(s); //Sachin - no change to original, because reference was not changed
    }
}
