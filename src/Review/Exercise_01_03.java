package Review;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_01_03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		double areaCirculo = 0.0;
		
		areaCirculo = 3.14159 * raio * raio;
		
		System.out.printf("A=%.4f",areaCirculo);
		sc.close();

	}

}
