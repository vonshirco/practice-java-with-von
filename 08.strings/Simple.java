
package strings;

public class Simple {
    public static void main(String[] args){
        /*
            In Java String objects are immutable, immutable simply means unmodifiable or unchangeable
           Once String object is created its data or state cant be changed but a new string object is created
        */
        
        String s = "Sachin";
        s.concat(" Tendulkar"); //concat() method appends the string at the end
        
        System.out.println(s); //Will print Sachanin because String are immutable objects(unchanged)
        
        //But if we explicitely assign it to the reference variable, it will refer to "Sachin Tendulkar"
        System.out.println("--Assigning the Concatenated String to a reference Variable--");
        s = s.concat(" Tendulkar");
        System.out.println(s);
    }
}
