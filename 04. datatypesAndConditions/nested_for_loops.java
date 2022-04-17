
package udsm.datatypesandconditions;

public class nested_for_loops {
   public static void main(String[] args){
       //Print square that visualizes divisor
       int n = Integer.parseInt(args[0]); //Converts String arguments to number (If given string is not a number it will throw exception)
       
       for(int i=1; i<=n; i++){
           //Print the ith line.
           for(int j=1; j<=n; j++){
               //Print the jth element in the ith line
               if((i%j==0) || (j%i==0))
                   System.out.print("*");
               else
                   System.out.print(" ");
           }
           System.out.println(i);
       }
   } 
}
