/*
 compareTo() method compares values and returns and int which tells the values compared 
less than, equals or greater than.
Supposed s1 and s2 two string variables, if
s1 == s2 : 0
s1 > s2  : positive value (1)
s1 < s2  : negative value (-1)
 */
package strings;

public class Comparison3_compareTo {
    public static void main(String[] args){
        String s1 = "Sachin";
        String s2 = "Sachin";
        String s3 = "Ratan";

        System.out.println(s1.compareTo(s2)); //0
        System.out.println(s1.compareTo(s3)); //1 (because s1 > s3)
        System.out.println(s3.compareTo(s1)); //-1 (because s3 < s1)
    }   
}
