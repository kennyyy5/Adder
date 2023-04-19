/*
 * a game that prompts users for answers to mathematics problems
 * Kehinde Adenuga
 * Grade 12, 16 yrs
 * Mid-april 2023
 */
package adderApplication;
/**
 * plays the game until user enters 999
 */
public class Adder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdderGameMethods AGM = new AdderGameMethods();

        int totalPoints = AGM.adderGame();
        
        System.out.print("Your score is " + totalPoints);
        
        
	}

}
