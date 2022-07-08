/*
The == Operator compares references not values
 */
package strings;

public class Comparison2_operator {
    public static void main(String[] args){
        String s1 = "Sachin";
        String s2 = "Sachin";
        String s3 = new String("Sachin");
        
        System.out.println(s1 == s2); //true (because both refers to the same instance)
        System.out.println(s1 == s3); //false (because s3 refers to instance created in non-pool) / not from on reference
        
    }
}
