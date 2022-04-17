/*
 Return in a loop instructs the program to immediately quit the current method and return to the calling
method.
 */
package udsm.controlanditeration;

public class returnStatement {
    public static void main(String[] args) {
        
        boolean t = true;
        System.out.println("Before the return.");
        
        if(t) 
            return; //return to the caller
        System.out.println("This won't execute.");
    }
 
}
