//Cherish Shanks
//IT145
//Programming Problem
//April 29,2016

import java.util.*;

public class NumOrder {
	   
	   
    //allows users to input their numbers
static Scanner keyboard = new Scanner(System.in); 


public static void main(String[] args){
        
  int num1, num2, num3, tmp;
  
 
  System.out.print("Please enter your three numbers seperated by a space: ");

     //The the three numbers the users inputed
       num1 = keyboard.nextInt();
      
       num2 = keyboard.nextInt();
      
       num3 = keyboard.nextInt();

       System.out.println();

     //make sure the users num1 input is less than or equal to their num2 input
       if (num1 > num2)
       {
           tmp = num1;
          
           num1 = num2;
          
           num2 = tmp;
       }

           System.out.print("Your numbers in nondescending order is: ");

      //put the users num3 input in its proper order
       if (num3 <= num1)
      
            System.out.println(num3 + " " + num1 + " " + num2);
           
       else if (num1 <= num3 && num3 <=  num2)
      
            System.out.println(num1 + " " + num3 + " " + num2);
           
      else
            System.out.println(num1 + " " + num2 + " " + num3);
           
  System.exit(0); 
 }
}	
