package _07_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
	
	void skill1() {
		String input = JOptionPane.showInputDialog(" how many dimes do you have");
		
		int Dimes = Integer.parseInt(input);
		JOptionPane.showMessageDialog(null, " you have this many cents " + (Dimes * 10) );
		input = JOptionPane.showInputDialog("how tall are you in inches");
		int Inches = Integer.parseInt(input);
		
		if( Inches <= 36 ) {
			JOptionPane.showMessageDialog(null, "you need to eat wheaties");
		}
		else {
			JOptionPane.showMessageDialog(null, " you average height");
		}
		
		
	}
	
	void skill2() { 
		for(int i = 0; i <= 30; i ++) {
			int remainder = i % 3;
			if( remainder == 0) {
				System.out.println(i);
			}
			
		}





	}
	void skill3() { 
		Random randy = new Random();
		
		int  num = randy.nextInt(21);
		System.out.println(num);
		int  num2 = randy.nextInt(11);
		System.out.println(num2);
		JOptionPane.showMessageDialog(null, "the difference between the two numbers is " + (num - num2));

		
		



		}

	void skill4() { 
		
		String City = JOptionPane.showInputDialog("what city are you from"); 
		City = City.trim();
		
		if(City.equalsIgnoreCase("San Diego")) {
			
		JOptionPane.showMessageDialog(null, "you live in america's finest City");
			
		}
		
		else{
			JOptionPane.showMessageDialog(null, "go somewhere else");
		}
		
           String car  = JOptionPane.showInputDialog(" how many car do you have in your family?");
           
           int newcar = Integer.parseInt(car);
           
           if(newcar == 0) {
        	   JOptionPane.showMessageDialog(null, " I bet you use public transport");
           }
           else if(newcar == 1) {
        	   JOptionPane.showMessageDialog(null, " ford focus");
        	   
           }
           
           else {
        	   
        	   JOptionPane.showMessageDialog(null, " you have this many wheels " + (newcar * 4));
           }

		// If they answered "San Diego", tell them they live in America's Finest City 



		// Otherwise, tell them to move to San Diego 



		// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 



		// If there is 1 car, use a pop-up to display the make/model of the car 



		// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 



		}
	
	public static void main(String[] args) {
		SkillPractice skills = new SkillPractice();
      	//skills.skill1();
        //skills.skill2();
      	//skills.skill3();
      	skills.skill4();
      	//skills.skill5();

		
		

	}

}
