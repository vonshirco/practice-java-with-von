/*
Comparing two given Strings on the basis of content and reference
- in authentication (by equalsTo())
- in sorting (by compareTo())
- in reference matching (by == operator)
etc.
 */
package strings;

public class Comparison {
    public static void main(String[] args){
        //equals() or public boolean equals(Object another){}
        // - compares this string to the specified object.
        
        String s1 = "Sachin";
        String s2 = "Sachin";
        String s3 = new String("Sachin");
        String s4 = "Saurav";
        
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equals(s3)); //true
        System.out.println(s1.equals(s4)); //false
        
        //equalsIgnoreCase() or public boolean equalsIgnorecase(String another)
        System.out.println("--equalsIgnoreCase() method--");
        
        String c1 = "Sachin";
        String c2 = "SACHIN";
        
        System.out.println(c1.equals(c2)); //false
        System.out.println(c1.equalsIgnoreCase(c2)); //true
    }
}
