
package udsm.controlanditeration;

public class unlabeledContinue {
    public static void main(String[] args) {
        for(int var1=0; var1<5; var1++)
        {
            for(int var2=0; var2<5; var2++)
            {
                if(var2==2)
                    continue;
                    System.out.println("var1: " + var1 + ",var2: " + var2);
            }
        }
    }
}
