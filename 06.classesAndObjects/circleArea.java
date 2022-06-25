
package moreclassesandobjects;

//Class Declaration
class Circle{
    //data field
    double radius = 1.0;
    
    //method
    double findArea(){
        double area = radius * radius * 3.14159;
        return area;
    }
}

public class circleArea {
    public static void main(String[] args){
        //Declaring Object Reference Variable
        Circle myCircle; //className objectReference;
        
        //Creating the Object
        myCircle = new Circle(); //objectReference = new ClassName;
        
        /*
        Or Declaring object reference variable and creating the object at once
        Circle myCircle = new Circle();
        */
        
        //Referencing objects data
        double myRadius = myCircle.radius;
        
        //Invoking objects method
        double myArea = myCircle.findArea();
        
        //The Area now
        System.out.println("The radius is " + myRadius + " and the area is " + myArea);
        
    }
}
