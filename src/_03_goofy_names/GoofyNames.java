                                                                                                          package _03_goofy_names;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;
import javax.xml.transform.Templates;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";

		// 1. Ask the user to enter their name
	String name = JOptionPane.showInputDialog("enter your name");
	

		// 2. Print upper case name to the console using .toUpperCase()
	System.out.println(name.toUpperCase());
	System.out.println();
		//    Run your program to see that this works.
          int length = name.length();
          for(int i = 0; i < length; i++) {
        	  String jama = name.substring(i,i+1);
        	  
        	  if(i%2==0) {
        		  goofyName += jama.toUpperCase();
        	  }
        	  if(i%2==1) {
        		  goofyName += jama.toLowerCase();
        	  }
          }
         // System.out.println(goofyName);
		// 3. Loop through each character of the name (steps 4 - 6).
		//    HINT: Use .length() to determine the number of characters in the String.

			// 4. Create a String variable to store the next character of the name
			//    using .substring(start, end)
			//    HINT: replace 'start' and 'end' to get String with character at i 
			
			// 5. Use MODULO to set this variable to upper case for EVEN characters
			//    and lower case for ODD characters.

			
			// 6. ADD this String  (containing 1 char) to the goofyName String

		
		// 7. Use pop-up to show user their Goofy name
          JOptionPane.showMessageDialog(null, goofyName);

	}
}

