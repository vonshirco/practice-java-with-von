
package udsm.controlanditeration;

public class unlabeledBreak {
    public static void main(String[] args) {
        //Declaring Variable
        int var;
        for(var=0; var<5; var++)
        {
            System.out.println("Var is: " + var);
            if(var==3)
                //Breaking the loop
                break;
        }
    }
}
