package Review;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_01_01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Informar a largura do terreno:"); //10.0
		double largura = sc.nextDouble();
		System.out.println("Informar o comprimento do terreno:"); //30.0
		double comprimento = sc.nextDouble();
		System.out.println("Informar o preço do metro quadrado do terreno:"); //200.00
		double precoMetroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * precoMetroQuadrado;
		
		System.out.printf("Area = %.2f%n",area);
		System.out.printf("Preço = %.2f",preco);

		sc.close();
	}

}
