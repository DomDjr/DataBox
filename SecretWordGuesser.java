package javaCode;

import java.util.Random;
import java.util.Scanner;

public class SecretWordGuesser {
	public static void main (String [] args) {
		Scanner humanInput = new Scanner(System.in);
		String humanAnswer = null;
		String compAnswer = null;
		
		boolean matchHuman = false;
		boolean matchComp = false;
		
		int humanGuesses = 3;
		int compGuesses = 3;
		
		System.out.println("+--------------------------------------+");
		System.out.print("Welcome to simple guessing game against the computer");
		System.out.println("\n" + "+--------------------------------------+");
		String secretWord;
		Random randString = new Random();
		String listWords[] = {"Ant Eater", "Bear", "Cheetah", "Deer", "Elephant"};
		secretWord = listWords[randString.nextInt(listWords.length)];
		
		System.out.println();
		System.out.print("The secret word has already been established and is chosen from a list.");
		System.out.println("\n" + "The list of words are: ");
		
		for (int i = 0; i < listWords.length; i++) {
			System.out.print("[" + listWords[i] + "]");
		}
		
		System.out.println("\n" + "One of the words in the list is the secret word");
		System.out.println("You are going to go against a computer.");
		System.out.println("The computer and you both each have 3 GUESSES to find the secret word.");
		System.out.println("You will start. What do you think the word is?");
		
		do {
			humanAnswer = humanInput.nextLine();
			if (humanAnswer.equals(secretWord)) {
				matchHuman = true;
				break;
			}
			
			if (! humanAnswer.equals(secretWord)) {
				humanGuesses -= 1;
				System.out.println("WRONG You have " + humanGuesses + " guesses left");
				System.out.println("Its the computers turn now");
				compAnswer = listWords[randString.nextInt(listWords.length)];
				System.out.println("The computer guesses " + compAnswer);
				System.out.println();
				if (compAnswer.equals(secretWord)) {
					matchComp = true;
					break;
				}
				if (!compAnswer.equals(secretWord)) {
					compGuesses -= 1;
					System.out.println("WRONG The computer has " + compGuesses + " guesses left");
					System.out.println();
					System.out.println("Its your turn now");
					humanAnswer = humanInput.nextLine();
					if (humanAnswer.equals(secretWord)) {
						matchHuman = true;
						break;
					}
					if (!humanAnswer.equals(secretWord)) {
						humanGuesses -= 1;
						System.out.println("WRONG You have " + humanGuesses + " guesses left");
						System.out.println();
						System.out.println("Its the computers turn now");
						compAnswer = listWords[randString.nextInt(listWords.length)];
						System.out.println("The computer guesses " + compAnswer);
						System.out.println();
						if (compAnswer.equals(secretWord)) {
							matchComp = true;
							break;
						}
						if (! compAnswer.equals(secretWord)) {
							compGuesses -= 1;
							System.out.println("WRONG. The computer has " + compGuesses + " guesses left");
							System.out.println();
							System.out.println("Its your turn now");
							humanAnswer = humanInput.nextLine();
							if (humanAnswer.equals(secretWord)) {
								matchHuman = true;
								break;
							}
							if (! humanAnswer.equals(secretWord)) {
								humanGuesses -= 1;
								System.out.println("WRONG You have " + humanGuesses + " guesses left");
								System.out.println();
								System.out.println("Its the computers turn now");
								compAnswer = listWords[randString.nextInt(listWords.length)];
								System.out.println("WRONG. The computer guesses " + compAnswer);
								compGuesses -= 1;
								System.out.println();
								System.out.println("The computer has " + compGuesses + " guesses left");
	
							}
						}
					}
				}
			}
		
		
		
		
		} while (((humanGuesses != 0) && (compGuesses != 0)) && ((!humanAnswer.equals(secretWord)) && (!compAnswer.equals(secretWord))));
	
	if (matchComp)
		System.out.print("The computer won. The secret word was " + compAnswer);
	
	else if (matchHuman) 
		System.out.print("You won. The secret word was " + humanAnswer);
	
	else 
		System.out.println("Neither of you won. The secret word was " + secretWord);
	
	humanInput.close();
	
	}

}
