
package collections;

    import java.util.*;
    public class ArrayList {
    public static void main(String[] args) {
     //Creating an ArrayList object
    
    ArrayList<String> cars = new ArrayList<String>();
    
    //Adding items
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Mazda");
    cars.add("Mazda");
    
    //Display the collection/ArrayList
    System.out.println(cars);
        
    //Set an Item (Substite)
    cars.set(0, "Opel");
    
    //Display the collection/ArrayList
    System.out.println(cars);
    
    //To access an elements in the ArrayList
    System.out.println(cars.get(2));
    
    
    //remove an item in the specified element
    cars.remove(1);
    
   //Display the collection/ArrayList
    System.out.println("cars");
    
   //To access an elements in the ArrayList
    System.out.println(cars.size());
    
    //Looping through the elements of an ArrayList
    for(int i = 0; i < cars.size(); i++){
        System.out.println(cars.get(i));
    }
    
    //Using for-each loop
    for(String i : cars){
        System.out.println(i);
    }
    
   //remove all
    cars.clear();
    
    }
   
}
