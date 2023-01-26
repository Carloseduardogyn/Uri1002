package Uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1002 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		
		double a;
		
		double r;
		
		r = sc.nextDouble();
		a = pi *  r * r;
		
		System.out.printf("A=%.4f%n", a);
		
		sc.close();

	}

}
