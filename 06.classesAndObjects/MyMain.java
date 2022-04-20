package udsm.classesandobjects;
//Circle.java: Contains both Circle class and its user class

//Circle Class
class Circle{
    public double x,y; //centre of the circle
    public double r; //radius of circle
    
    //Methods to return circumference and area
    public double circumference(){
        return 2*3.14*r;
    }
    public double area(){
        return 3.14*r*r;
    }
}
public class MyMain {
    public static void main(String[] args){
        Circle aCircle; //Creating Reference
        aCircle = new Circle(); //Creating object
        
        //Assigning value to data field
        aCircle.x = 10;
        aCircle.y = 20;
        aCircle.r = 5;
        
        //Invoking method
        double area = aCircle.area(); 
        double circumf = aCircle.circumference();
        
        //Displaying the radius, circumference and area
        System.out.println("Radius = "+aCircle.r+" Area = "+area);
        System.out.println("Radius = "+aCircle.r+" Circumference = "+circumf);
    }
}
