import java.util.Scanner;

class factorial {
	
	public factorial() {
		
	}
	public int fact(int n) {
		if (n <= 1) {
			return 1;
		}
		else {
			return n * fact(n-1);
		}
	}
	
}

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		factorial fc = new factorial();
		System.out.println(fc.fact(sc.nextInt()));
}
}
