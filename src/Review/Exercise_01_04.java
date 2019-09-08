package Review;

import java.util.Scanner;

public class Exercise_01_04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = 0, b = 0, c = 0, d = 0;
		int diferenca = 0;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();

		diferenca = (a * b - c * d);

		System.out.printf("DIFERENCA=%d",diferenca);
		sc.close();

	}

}
