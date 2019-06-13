package _01_prime_or_not;

import javax.swing.JOptionPane;

public class prime_o_not {
	public static void main(String[] args) {
	String number =	JOptionPane.showInputDialog("what is your favorite number?");
	int num  = Integer.parseInt(number);
	for(int i = 2; i< num;i++) {
		if(num % i == 0) {
			System.out.println("not prime");
			System.exit(0);
		}
		
	}
	
	}

}
