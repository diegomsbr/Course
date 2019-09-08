package Review;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_01_06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int productId, productId2, qtd1, qtd2;
		double productPrice, productPrice2;
		double total = 0;

		productId = sc.nextInt();
		qtd1 = sc.nextInt();
		productPrice = sc.nextDouble();

		productId2 = sc.nextInt();
		qtd2 = sc.nextInt();
		productPrice2 = sc.nextDouble();

		total = (qtd1 * productPrice ) + ( qtd2 * productPrice2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		sc.close();
	}

}
