package Operators;

import java.util.Scanner;

public class Bitwise {

	public static void main(String[] args) {

		// Operators
		// & And (Bit per Bit)
		// | Or (Bit per Bit)
		// ^ XOR (Exclusive Or)

		// c1 c2 c1 & c2 c1 | c2 c1 XOR c2 (XOR will be true if only ONE condition will
		// be true)
		// F F F F F
		// F T F T T
		// T F F T T
		// T T T T F

		int n1 = 89;
		int n2 = 60;

		System.out.println(Integer.toBinaryString(n1));
		System.out.println(Integer.toBinaryString(n2));
		System.out.println("--------------------------");
		System.out.println((n1 & n2) + "   " + Integer.toBinaryString(n1 & n2));
		System.out.println((n1 | n2) + "  " + Integer.toBinaryString(n1 | n2));
		System.out.println((n1 ^ n2) + "  " + Integer.toBinaryString(n1 ^ n2));

		System.out.println("--------------------------");

		Scanner sc = new Scanner(System.in);

		int mask = 0b100000;
		int n = sc.nextInt();
		
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		}
		else {
			System.out.println("6th bit is false!");
		}
		
		System.out.println("Mask = " + mask);
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(mask));
		sc.close();

	}

}
