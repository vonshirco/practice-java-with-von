
package arrays;

public class testArray1 {
  public static void main(String args[]){
      //An array can be initialized while it is being created/declared
      int a[] = {33,3,4,5};
      
      //Looping to access the array and displaying the elements
      for(int i=0; i<a.length; i++){
          System.out.println(a[i]);
      }
  }  
}

/*
Initialization can either be
int[] x or 
int x[]

Other examples of how array can be initialized while it is being created
int []x = {1,2,3,4};
char []c = {'a', 'b', 'c', 'd'};
*/