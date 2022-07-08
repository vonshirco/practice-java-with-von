/*
 Substring - is a part of a string/subset of anaother string
startindex starts from 0
endindex starts from 1
can be gotten from the objects
public String substring(int startindex)
public String substring(int startindex, int endindex)
 */
package strings;

public class Substring {
    public static void main(String[] args){
        String s = "Sachin Tendulkar";
        System.out.println(s.substring(6)); // Tendulkar
        System.out.println(s.substring(0,6)); //Sachin
    }
}
