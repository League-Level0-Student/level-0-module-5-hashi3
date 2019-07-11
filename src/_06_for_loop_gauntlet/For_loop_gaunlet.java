package _06_for_loop_gauntlet;

public class For_loop_gaunlet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year = 0;

		for(int i = 0; i < 100  ; i += 10 ) {
			
			for(int j = 1; j <= 10; j++) {
				
				System.out.print(i + j);
				System.out.print(" ");
			}
        System.out.println();
		}
			
	}

}
