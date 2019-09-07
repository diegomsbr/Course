package Console;

import java.util.Locale;
import java.util.Scanner;

public class Exercise2Input {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your full name:"); // Alex Green
		String fullName = sc.nextLine();
		
		System.out.println("How many bedrooms are there in your house?"); // 3
		int bedroomCount = sc.nextInt();
		
		System.out.println("Enter product price:"); //500.50
		double productPrice = sc.nextDouble();

		System.out.println("Enter your last name, age and heigth (same line):"); // Green 21 1.73
		String lastName = sc.next();
		int age = sc.nextInt();
		double heigth = sc.nextDouble();
		
		System.out.println(fullName);
		System.out.println(bedroomCount);
		System.out.println(productPrice);
		System.out.println(lastName);
		System.out.println(age);
		System.out.println(heigth);
		
		sc.close();
	}

}
