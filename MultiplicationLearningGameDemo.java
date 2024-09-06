package MultiplicationLearningGameDemo;

import java.util.Random;
import java.util.Scanner;

public class MultiplicationLearningGameDemo {
	
	
	static Scanner scan = new Scanner(System.in);
	static int highScore = 0;
    static final int maxQuestion = 10;
    static final int maxDifficulty = 4;
    static int correctScore = 0;
    static int wrongScore = 0;
    static int successiveCorrect = 0;
    static int successiveWrong = 0;
    static int difficulty = 1;
    static int num1;
    static int num2;
    static int userAnswer;
    static boolean run = true ;
    static long executionTime;

	public static void main(String[] args) {
		 
		
		
		while (run==true) {
            System.out.println("Welcome to the Multiplication Learning Game!");
            System.out.println();
            System.out.println("1. Start Game");
            System.out.println("2. Help");
            System.out.println("3. Show High Score");
            System.out.println("4. Exit");
            System.out.print("Select an option (1-4): ");
            
            int choice = scan.nextInt();
            scan.nextLine();
            
            System.out.println();
            
            Random random = new Random(System.currentTimeMillis());
            

            switch (choice) {
                case 1:
                    startGame(random);
                    break;
                case 2:
                    showHelp();
                    break;
                case 3:
                    showHighScore();
                    break;
                case 4:
                	exit();
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
                    break;
            }
            showHighScore();
            userScore();
            System.out.println("Execution Time: " + executionTime + " milliseconds");
            System.out.println();
	}
		
		scan.close();
		}
		
		
		public static void startGame(Random random) {
			userName();
			long startTime = System.currentTimeMillis();
	        for (int i = 0; i < maxQuestion; i++) {
	        	num1 = random.nextInt(10 * difficulty) + 1;
	            num2 = random.nextInt(10 * difficulty) + 1;
	            
	            System.out.printf("Question %s: How much is %s times %s? ", (i + 1), num1, num2);
	            userAnswer = scan.nextInt();
	            
	         
	            if (userAnswer == num1 * num2) {
	            	answerCorrect();
	            	if (successiveCorrect == 3) {
	            		difficultyIncreased();
	            		if (difficulty == maxDifficulty) {
	            			System.out.println("Great job! Difficulty increased to reach Max Difficulty Level" + difficulty + " and you win");
	            			run=false;
	            			break;
	            		}
	            }
	            	
	           }else {
	        	  answerWrong();
	              if (successiveWrong == 3) {
	            	  System.out.println();
                      System.out.println("You have made 3 Successive Wrong Answers");
                      System.out.println("please ask your teacher for extra help");
                      System.out.println();
                      break;
                }
	        }
	            
	            System.out.println();
	        }
	        long endTime = System.currentTimeMillis(); 
	        executionTime = endTime - startTime;
	        executionTime+=executionTime;
	        System.out.println("Game Over!");
	        System.out.println();
	        
	
}
		
		
		public static void userName() {
			 System.out.print("Enter your name: ");
		     String name = scan.nextLine();
		     System.out.println("Welcome " + name);   
		}
		
		
		
		public static void answerCorrect() {
			correctScore++;
            successiveCorrect++;
            successiveWrong = 0; 
            System.out.println("Correct!");
            //userScore();
        	//System.out.println("High Score: " + highScore);
        	        	

		}
		
		
		
		public static void answerWrong() {
			System.out.println("Incorrect! The answer was " + (num1 * num2));
            successiveWrong++;
            successiveCorrect = 0;
            wrongScore++;
           
            
		}
		
		
		
		public static void difficultyIncreased() {
			 if (difficulty < maxDifficulty) {
                 difficulty++;
                 System.out.println("Great job! Difficulty increased to level " + difficulty);
                 
                 
                 successiveCorrect = 0;
			 
		}
		}
		
		
		
		public static void userScore() {
			System.out.println("Your score: " + correctScore);
	        if (correctScore > highScore) {
	            highScore = correctScore;
	            System.out.println("New high score! Congratulations!");
	            showHighScore();
		}
		}
		
		
		public static void showHelp() {
			System.out.println("The game  is a multiplication learning tool.");
	        System.out.println("Game Instructions:");
	        System.out.println("1. Answer multiplication questions generated by the game.");
	        System.out.println("2. Correct answers increase your score and may increase difficulty.");
	        System.out.println("3. Incorrect answers are tracked, and if you get 3 wrong in a row, the game ends.");
	        System.out.println("4. 3 questions correctly in a row at the 3rd difficulty level , winning and end the game.");
	        System.out.println("5. Try to achieve the highest score possible!");
	        System.out.println();
	    }

		
		
		public static void showHighScore() {
	        System.out.println("High Score: " + highScore);
	        //System.out.println("Your Successive Score: " + correctScore);
	        //System.out.println("Your Insuccessive Score: " + wrongScore);
	    }
		
		
		
		public static void exit() {
			 System.out.println("Are you sure to Exit the game (yes/no) ");
			 String option = scan.nextLine();
			 System.out.println();
			 if(option.equalsIgnoreCase("yes")) {
				 System.out.println("Thank you for playing! Goodbye!");
				 System.out.println("Execution Time: " + executionTime + " milliseconds");
				 run = false ;
			 }else if (option.equalsIgnoreCase("no")){
				 run = true;
				 	 
		}
			 
	
		
		}	
		
}
