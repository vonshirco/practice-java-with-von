/*
Illustrates adding, removing and printing a list
Demonstration of  a LinkedList
 */
package collections;

//Importing Libraries
import java.util.LinkedList;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args){
        LinkedList<String> staff = new LinkedList<String>();
        staff.addLast("Diana");
        staff.addLast("Harry");
        staff.addLast("Romeo");
        staff.addLast("Tom");
        
        // | in the comments indicates the iterator position
        ListIterator<String> iterator = staff.listIterator(); // |DHRT
        iterator.next(); //D|HRT
        iterator.next(); //DH|RT
        
        //Adding more elements after second element
        iterator.add("Juliet"); //DHJ|RT
        iterator.add("Nina"); //DHJN|RT
        
        iterator.next(); //DHJNR|T
        
        //Remove last traversed element
        iterator.remove(); //DHJN|T
        
        //Printing all elements
        System.out.println(staff);
        System.out.println("----------------------------------");
        System.out.println("Expected: [Diana, Harry, Juliet, Nina, Tom]");
        
    }
}
