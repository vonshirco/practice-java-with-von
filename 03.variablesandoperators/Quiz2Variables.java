/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udsm.variablesandoperators;

/**
 *
 * @author von
 */
public class Quiz2Variables {  
  public static void main (String[] args){
      //Variables Declaration
      int courseNumber;
      double test1, test2,total;
      String remarks; 
      //Assigning values to variables
      test1 = 48;
      test2 = 50;
      total = test1 + test2;
      //Printing total marks
      System.out.println(total);
      
      if (total > 40) {
          remarks = "pass";
      }else{
          remarks = "fail";
      }
      System.out.println(remarks);
  }  
}
