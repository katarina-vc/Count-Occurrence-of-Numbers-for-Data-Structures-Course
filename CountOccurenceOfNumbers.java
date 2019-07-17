/*
 * Name: Katarina Capalbo
 * Date: 6/2/2019
 * Assignment:	Project 4 COP3530 Data Structures
 * 
 * Description: Write a program that reads an unspecified number of integers and finds the one that has the most occurrences. 
 * The input ends when the input is 0. For example, if you entered 2 3 40 3 5 4 –3 3320, the number 3 occurred most often. 
 * If not one but several numbers have the most occurrences, all of them should be reported. For example, since 9 and 3 appear 
 * twice in the list 9 30 3 9 3 2 4, both occurrences should be reported.
 * 
 */

import java.util.*;


// start class CountOccurenceOfNumbers
public class CountOccurenceOfNumbers {
	
	// start main
	public static void main(String[] args) {  
			// Local Declarations
			Scanner in = new Scanner(System.in);
			Map<Integer, Integer> map = new HashMap<>(); // holds user int as key
			int key; // user integer
			int value; // value for key
			final int ENDFLAG = 0; // end flag for user input
		
			// Prompt user for input
			System.out.println("Enter a number of integers ending with 0: ");; 
	  
			// store integer keys and value to map
			while((key = in.nextInt()) != ENDFLAG)
			{
		  		 if (!map.containsKey(key)) {       
	    			 map.put(key, 1);      
	    			 }      
	    		 else {       
	    			 value = map.get(key);       
	    			 value++; 
	    			 
	    			// replace old value with new incremented value
	    			 map.put(key, value);
	    		 }
			} 
			
			// Final output
			printMaxOccurrences(map);
			
	}// end main
	
	// This function finds and prints out the integers with the max occurrences in a map
	public static void printMaxOccurrences(Map<Integer, Integer> map)
	{
		int max;
		
	    // Title output
	    System.out.println("\nThe integers entered with the most occurrences are: ");
	    
	    for (Map.Entry<Integer, Integer> entry: map.entrySet())
	    {
	    	// find max occurrences 
	    	max = Collections.max(map.values());
	    	
	    	// if max, print out
	    	if(entry.getValue() == max)
	    	{
	    		System.out.printf("%d\t", entry.getKey());
	    	}
	    }
	}// end printMaxOccurrences() 
	
}// end class CountOccurenceOfNumbers
