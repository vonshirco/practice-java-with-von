/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udsm.quadraticequation;

/**
 *
 * @author von
 */
public class QuadraticEquation {
    public static void main(String[] args) {
        
        //Declaring variables
        double a = 1, b = -3, c = -10;
        double root1, root2;
        double determinants;
        
        //Calculating Determinants b2 - 4ac
        determinants =  b * b - 4 * a * c;
        
        //Getting the roots
        root1 = (-b + Math.sqrt(determinants)) / (2 * a);
        root2 = (-b - Math.sqrt(determinants)) / (2 * a);
        
        //Displaying the roots
        System.out.println("The roots of the Quadratic Equations are " + root1 + " and " + root2);
    }
}
