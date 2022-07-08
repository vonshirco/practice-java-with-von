
package strings;

public class Review {
    public static void main(String[] args){
        String city = "Bloomington";
        
        System.out.println(city.charAt(2));//o
        System.out.println(city.substring(2,4));//oo
        System.out.println(city.lastIndexOf("o"));//9
        System.out.println(city.indexOf(3));//-1 (is not there)
        System.out.println(city.indexOf("n"));//6
        System.out.println(city.indexOf("n", 8));//10 (after index 8)
    }
}
