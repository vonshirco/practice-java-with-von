
package arrays;


public class loopingMain {
    public static void main(String[] args){
        //Declaring and initializing an array
        int age[] = {12, 4, 5, 2, 5};
        
        //Looping through the array to access the array and its elements
        System.out.println("Accessing Elements of the Array:");
        for(int i=0; i<age.length; i++){
            System.out.println("Element " +(i+1)+ ": " + age[i]);
        }
        
        /*
        //Or Exact ouput as the previous loop:
        for(int i=0; i<age.length; i++){
            if(i == 0){
                System.out.println("First Element: " + age[0]);
            }
            if(i == 1){
                System.out.println("Second Element: " + age[1]);
            }
            if(i == 2){
                System.out.println("Third Element: " + age[2]);
            }
            if(i == 3){
                System.out.println("Fourth Element: " + age[3]);
            }
            if(i == 4){
                System.out.println("Firth Element: " + age[4]);
            }
        }
        */
    }
}
