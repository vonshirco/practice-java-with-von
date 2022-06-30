//Declaring Arrays

package arrays;

public class testArray {
    public static void main(String args[]){
        //Declaring an array a and allocating memory
        int a[] = new int[5]; //The reference variable a is set to a new array object that can hold 5 integers
        
        //Initializing the array
        a[0] = 10;
        a[1] = 20;
        a[2] = 70;
        a[3] = 40;
        a[4] = 40;
        
        //Looping to access the array and it's elements and displaying them
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}

/*
Other Examples of array declaration:

float[] prices = new float[500];

boolean[] flags;
flags = new boolean[20];

char[] codes = new char[1750];

Also Note: An array is an  object
We use the length attribute such as a.length or x.length or any according to the array name
to get the length of an array.
*/