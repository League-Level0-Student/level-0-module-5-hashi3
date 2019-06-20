package _02_fibonacci;

public class fib_class {
 
 public static void main(String[] args) {
	 int low = 3;
	 int high = 5;
	 int temp = 0;
	 int fib = 0;
	 
	for(int i = 0; i < 12; i++) {
		System.out.println("low =  " + low );
		   System.out.println("high = " + high);
	   temp = low;
	   low = high;
	   high = high + temp;
	   fib = high;
	   System.out.println("fib = " + fib );
	   
	}
}

}
