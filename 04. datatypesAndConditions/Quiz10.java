
package udsm.datatypesandconditions;

public class Quiz10 {
   public static void main(String[] args){
       //Declaring and Assigning Variables
       int a = 5 ;
       boolean val = false;
       //Condtions
       if(val)
           System.out.println("Val is false so it won't execute");
       else if(a<0)
           System.out.println("A is a negative value");
       else if(a>0)
           System.out.println("A is a positive value");
       else
           System.out.println("A is equal to zero");
   } 
}
