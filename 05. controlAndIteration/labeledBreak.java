//Faced Issues
package udsm.controlanditeration;

public class labeledBreak {
    public static void main(String[] args) {
        Outer:
        for(int var1=0; var1<5; var1++)
        {
           for(int var2=1; var2<5; var2++)
           {
               System.out.println("var1: " + var1 + ",var2: " + var2);
               if(var1==3)
                   //Breaking the loop
                   break Outer;
           }
        }
    }
}
