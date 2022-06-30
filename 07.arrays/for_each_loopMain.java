
package arrays;

public class for_each_loopMain {
    public static void main(String[] args){
        //Declaring and Initializing the array
        int[] age = {12, 4, 5, 2, 5};
        
        //Looping through to access the array
        System.out.println("Using for-each Loop:");
        for(int a : age){
            System.out.println(a);
        }
    }
}

/*for-each loop syntax

for(data_type variable : array/collection){
    //Body of for-each loop
}

eg..
for(int a : age){
    System.out.println(a);
}

*/
