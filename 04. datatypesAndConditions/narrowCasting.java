/*
 Narrow Casting - refers to converting a large data type to a smaller data type (Manually by Specifying to the Original data type)
double>float>long>int>char>short>byte
 */
package udsm.datatypesandconditions;

public class narrowCasting {
    public static void main(String[] args){
        double myDouble = 9.78; //Original data type
        int myInt = (int)myDouble; //Narrow Casting
        
        System.out.println(myDouble);
        System.out.println(myInt);
    }
}
