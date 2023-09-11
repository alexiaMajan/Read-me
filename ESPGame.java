/*
* Class: CMSC203
* Instructor: Grinberg
* Description: (Give a brief description for each Class)
* Due: 09/11/2023
* Platform/compiler:
* I pledge that I have completed the programming assignment
* independently. I have not copied the code from a student or
* any source. I have not given my code to any student.
* Print your Name here: Alexia Majano
*/


import java.util.Scanner;
import java.util.Random;

public class ESPGame {

	public static void main(String[] args) {
		
		final int rounds = 10;
        final String colorRed = "Red";
        final String colorGreen = "Green";
        final String colorBlue = "Blue";
        final String colorOrange = "Orange";
        final String colorYellow = "Yellow";
        final String colorPink = "Pink";
        final String colorPurple = "Purple";
        String userGuess,userName,userInfo,dueDate;
        int correctGuesses = 0;
        int numColors;
        String colors = " ";
        // Collect user input
        Scanner input = new Scanner(System.in);
       
        System.out.print("Enter your name: ");
         userName = input.nextLine();
        System.out.print("Describe yourself: ");
         userInfo = input.nextLine();
        System.out.print("Due Date: ");
         dueDate = input.nextLine();
        System.out.println("CMSC203 Assignment1: Test your ESP skills!");

        
        //randomization 
        Random randomColors = new Random();
        
       //  case numbers; loops the rounds
        for (int i = 1; i <= rounds; i++) {
        
        	//switch case for color randomization
        	numColors = randomColors.nextInt(6);
            switch (numColors) {
                case 0:
                    colors = colorRed;
                    break;
                case 1:
                    colors = colorGreen;
                    break;
                case 2:
                    colors = colorBlue;
                    break;
                case 3:
                    colors = colorOrange;
                    break;
                case 4:
                    colors = colorYellow;
                    break;
                case 5:
                	colors = colorPink;
                	break;
                case 6: 
                	colors = colorPurple;
                	break;
               
            }
        	//output
        	System.out.println("Round " + i);
            System.out.println("\nI am thinking of a color.");
            System.out.println("Is it Red, Green, Blue, Orange, Yellow, Pink, or Purple?");
            System.out.print("Enter your guess: ");
             userGuess = input.nextLine();
            System.out.println("\nI was thinking of " + colors);
           
            // point system
            if (userGuess.equalsIgnoreCase(colors)) {
                correctGuesses++; 
            }

                
              
        // output users info 
        }
          System.out.println("Game Over");
        System.out.println("You guessed " + correctGuesses + " out of " + rounds + " colors correctly.");
        System.out.println("User Name: " + userName);
        System.out.println("User Description: " + userInfo);
        System.out.println("Due Date: " + dueDate);
         
	}
}