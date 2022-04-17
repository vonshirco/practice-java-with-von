
package udsm.controlanditeration;

public class nestedIfExample {
    public static void main(String[] args){
        //Defining two varibles
        int age = 20;
        int weight = 80;
        //Applying condition on age and weight
        if(age>=18){
            if(weight>50){
                System.out.println("You are eligible to donate blood");
            }
        }
    }
}
