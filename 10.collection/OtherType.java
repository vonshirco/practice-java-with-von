
package collections;

//Importing Libraries
import java.util.ArrayList;
public class OtherType {
    public static void main(String[] args) {
        //Creating an Arraylist
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        
        //Adding Items
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        
        //Displaying Elements
        for(int i : myNumbers){
            System.out.println(i);
        }
        
        /* Sorting - Another useful class in the java.util package is the 
        Collections class which include the sort() method for sorting lists 
        alphabetically or numerically */
    }
}
