package Console;

import java.util.Locale;

public class ConsoleOutput {

	public static void main(String[] args) {

		char gender = 'F';
		int age = 32;
		double balance = 10.35784;
		String name = "Maria";

		System.out.println("Good morning!");
		System.out.println("Good afternoon!");
		System.out.println("Good night!");
		System.out.println("--------------------------");
		System.out.print("Good morning!");
		System.out.print("Good afternoon!");
		System.out.println("Good night!");
		System.out.println("--------------------------");
		// ln is line next abbreviation
		// f is formatted abbreviation
		System.out.printf("%.2f%n", balance);
		System.out.printf("%.4f%n", balance);
		System.out.println("--------------------------");
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", balance);
		System.out.printf("%.4f%n", balance);
		System.out.println("--------------------------");
		System.out.printf("Maria is 32 years old. %n");
		System.out.printf("%s is %d years old, gender %c and got balance = %.2f bitcoins.%n", name, age, gender, balance);
	}

}
