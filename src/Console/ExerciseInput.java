package Console;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ExerciseInput {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt(); // 35
		sc.nextLine(); 
		String name = sc.nextLine(); // Bob Brown
		char gender = sc.next().charAt(0); // F
		sc.nextLine(); 
		// b5
		String s = sc.next();
		char letter = s.charAt(0);
		int digit = Integer.parseInt(s.substring(1));
		// 4.32
		double n2 = sc.nextDouble();
		// Maria F 23 1.68
		String name2 = sc.next();
		char gender2 = sc.next().charAt(0);
		int age2 = sc.nextInt();
		double heigth2 = sc.nextDouble();
		
		System.out.println(n1);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(letter);
		System.out.println(digit);
		System.out.println(n2);
		System.out.println(name2);
		System.out.println(gender2);
		System.out.println(age2);
		System.out.println(heigth2);
		
		sc.close();

	}

}
