
package arrays;

public class ArrayDemo {
    public static void main(String[] args){
        //Declaring an array and allocating memory
        int x[] = new int[5];
        
        //Loop to assign the values to the array
        for(int i=0; i<x.length; i++){
            x[i] = i+2;
        }
        
        //Loop to print the values of an array
        //System.out.println("The Elements are:");
        for(int i=0; i<x.length; i++){
            System.out.print("Element " +(i+1)+ " is: ");
            System.out.println(x[i]);
        }
    }
}
