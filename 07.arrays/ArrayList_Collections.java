/*
 ArrayList - is a part of collection framework and is present in java.util.package
- it provides us with dynamic arrays in java (helpful in program where lots of manipulation in 
the array is needed eg. add, remove)

Collections - is a framework that provides an architecture to store and manipulate the group
of objects.
- can achieve all the operations that you perform on a data such as searching, sorting, insertion,
manipulation and deletion.
- Java Collections means a single unit of objects

Java Object - is a member/instance of a java class
- (Objects are created at runtime from templates/classes)
 */
package arrays;

//importing Libraries
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Collections {
    public static void main(String[] args){
        /* Declaring an ArrayList variable and calling the ArrayList constructor to 
        instatiate an ArrayList object and assign it to the variable */
        ArrayList myList = new ArrayList();
        
        //Inserting elements
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");
        myList.add("E");
        
        //Displaying the Elements
        System.out.println("Before Reverse Order: " + myList);
        //Reversing
        Collections.reverse(myList);
        System.out.println("After Reverse Order: " + myList);
    }
}
