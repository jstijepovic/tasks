package zadatak;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Signs {
	
	public static long NumberOfSigns(String inputWord, Character c) {
		
		// set initial value for number of occurencies
		long n = 0;				
		try {	
			// get list of chars
			List<Character> list = inputWord.chars()
									.mapToObj(i -> Character.valueOf((char)i))									
									.collect(Collectors.toList());
			System.out.println(list);
			
			// count the number of occurencies
			n = list.stream().filter(l -> c.equals(l)).count(); 
					
			System.out.println("Znak " + c + " pojavljuje se " + n + " puta!");
			
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			System.out.println("String is not set!");
			//e.printStackTrace();
		} 		
		return n ;
	}

}
