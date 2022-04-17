/*
 Wide Casting - refers to converting a smaller data type to larger data type(occurs automatically)
byte>short>char>int>long>float>double
 */
package udsm.datatypesandconditions;

public class wideCasting {
   public static void main(String[] args){
       int myInt = 9; //Original datatype
       double myDouble = myInt; //wide casting from int to double
       
       System.out.println(myInt);
       System.out.println(myDouble);
   } 
}
