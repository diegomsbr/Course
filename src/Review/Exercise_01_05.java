package Review;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_01_05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		int employeeNumber = sc.nextInt();
		int workedHours = sc.nextInt();
		double perHourLaborValue = sc.nextDouble();
		double salary = workedHours * perHourLaborValue;
		
		System.out.printf("NUMBER = %d%n", employeeNumber);
		System.out.printf("SALARY = U$ %.2f%n", salary );
		
		sc.close();
	}

}
