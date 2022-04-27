/*
 Write a static method eq() that takes two int arrays as arguments and returns true if the 
arrays have the same length and all corresponding pairs of elements are equal, and false otherwise
 */
package udsm.labs;

public class arrayEquals {
    //Static Method
    public static boolean eq(int[]a, int[]b){
        //Checking array length
        if(a.length != b.length)
            return false;
        //Checking if corresponding elements are equal
        for(int i=0; i<a.length; i++){
            if(a[i] != b[i])
                return false;
        }
        
        //all elements must be equal
        return true;
    }
     //Main Method (Entry point of any Java Program
    public static void main(String[] args){
        //Arrays declaration and definition
        int[] a = {3,1,4,1,5};
        int[] b = {3,1,4,1,};
        int[] c = {3,1,4,1,5};
        int[] d = {2,7,1,8,2};
        
        //Displaying the results or output
        System.out.println(eq(a,a));
        System.out.println(eq(a,b));
        System.out.println(eq(a,c));
        System.out.println(eq(a,d));
        
    }
}
