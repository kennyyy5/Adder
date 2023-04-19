/*
 * a game that prompts users for answers to mathematics problems
 * Kehinde Adenuga
 * Grade 12, 16 yrs
 * Mid-april 2023
 */
package adderApplication;

import java.util.Random;
import java.util.Scanner;
/**
 * class contains methods needed for adder game
 */
public class AdderGameMethods {
       private int totalPoints;
       private int userTotalNo;
      
       Random rand = new Random();
 	   Scanner input = new Scanner(System.in);
 		/**
 		 * constructor
 		 * pre: none
 		 * post: totalPoints and userTotalNo variable intialised to 0 when instance class is called.
 		 */
       public AdderGameMethods() {
    	   totalPoints = 0;
    	   userTotalNo = 0; 
       }
      
       /**
       * plays the game in the main method.
       * pre: userTotalNo variable not set to 999
       * post:  plays the game and return total points score at end 
       */
      public int adderGame() {
    	while(userTotalNo != 999) {
    	int firstNo = rand.nextInt(21);
    	int secondNo = rand.nextInt(21);
    	int actualTotalNo = firstNo + secondNo;
  	    System.out.print(firstNo + " + " + secondNo + " = " );
  	    userTotalNo = input.nextInt();
  	    
  	    if(userTotalNo == actualTotalNo) {
  	    	totalPoints += 5;
  	    	
  	    }else if(userTotalNo != 999 && userTotalNo != actualTotalNo){
  	    	System.out.print("Wrong answer. Enter another answer: ");
  	    	userTotalNo = input.nextInt();
  	    	
  	    	if(actualTotalNo == userTotalNo) {
  	    		totalPoints += 3;
  	    	}else if(userTotalNo != 999 && userTotalNo != actualTotalNo){
  	    	System.out.print("Wrong answer. Enter another answer: ");
  		    userTotalNo = input.nextInt();
  		    if(actualTotalNo == userTotalNo) {
  	    		totalPoints += 1;
  	    	}else if (userTotalNo != 999 && userTotalNo != actualTotalNo) {
  	    		System.out.println("Wrong answer. The actual answer is " + actualTotalNo);
  	    	} 
  	    	
  	    	}
  	    }else if(userTotalNo == 999) {
  	    	
  	    }
  	  
  	    }
    	return(totalPoints);
  	}
      }
       


