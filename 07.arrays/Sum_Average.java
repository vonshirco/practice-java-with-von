
package arrays;

public class Sum_Average {
   public static void main(String[] args){
       //Declaring and Initializing the array
       int numbers[] = {2,-9,0,5,12,-25,22,9,8,12};
       
       //Declaring variable used
       int sum = 0;
       Double average;
       
       //Finding the sum of elements by looping through the array
       for(int num : numbers){
           sum += num; //same as sum = sum + num;
       }
       
       //Total number of elements
       int arrayLength = numbers.length;
       
       //Finding the average
       average = ((double)sum/(double)arrayLength);
       
       //Displaying the results
       System.out.println("Sum: " +sum);
       System.out.println("Average: " +average);
   } 
}
        
