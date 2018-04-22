package zadatak;

import java.util.Scanner;

/**
 * Main Application for calculating the number of occurencies of 
 * choosen sign (fe I, a, B...)
 * 
 * Author
 * Janko Stijepovic
 * 22.04.2018
 */
public class App 
{
    public static void main( String[] args )
	{
		Scanner in = new Scanner(System.in); 
		System.out.print("Enter a string:");
		String inputWord = in.nextLine();
		
		Character c = null;		
		// check if any string is entered
		if (inputWord.length() > 0) {			
			System.out.print("Enter the required character:");			
			try {		
				// get the first char for searching
				c = in.nextLine().charAt(0);		
				// call function to count the number of occurrences
				Signs.NumberOfSigns(inputWord, c);
			} catch (StringIndexOutOfBoundsException siobe) {
				System.out.println("No search characters entered!");					
			}						
		} else {
			System.out.println("No String was entered!!!!");			
		}
		
		//Signs.NumberOfSigns(inputWord, c);	
		
	}
}
