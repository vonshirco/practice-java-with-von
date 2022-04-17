
package udsm.datatypesandconditions;

public class Quiz9_if_else {
  public static void main(String[] args){
      //Declaring and Assigning Variables
      int a = 3;
      //Conditions
      if(a<=10 && a>0){
          System.out.println("Number is valid");
          if(a<5)
              System.out.println("From 1 to 5");
          else
              System.out.println("From 5 to 10");
      }else{
          System.out.println("Number is not valid");
      }
  } 
}
