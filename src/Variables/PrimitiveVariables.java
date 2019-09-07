package Variables;

public class PrimitiveVariables {

	public static void main(String[] args) {
		boolean completed = false;
		char gender = 'F';
		// As the char type is an unicode character, we can initialize with an unicode code 
		char letter = '\u0041'; 
		byte n1 = 126;
		int n2 = 1000;
		int n3 = 2147483647;
		// When we initialize with a number, Java understands that this number is integer, so we have to put the L/l 
		// at the end of the number to show that this value is long
		// long n4 = 2147483648;
		// An integer literal is of type long if it ends with the letter L or l; 
		// otherwise it is of type int. It is recommended that you use the upper case letter L because the lower case letter l is hard to distinguish from the digit 1.
		long n4 = 2147483648L;
		// Same thing with the float type, by default, 4.5 is interpreted as double, to inform that value is
		// float, we have to put F/f at the end of the value
		// float n5 = 4.5;
		float n5 = 4.5F;
		double n6 = 4.5;
		
		System.out.println(completed);
		System.out.println(gender);
		System.out.println(letter);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		System.out.println(n6);
		
		// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
		
		//Literals
		//You may have noticed that the new keyword isn't used when initializing a variable of a primitive type. Primitive types are special data types built into the language; they are not objects created from a class. A literal is the source code representation of a fixed value; literals are represented directly in your code without requiring computation. As shown below, it's possible to assign a literal to a variable of a primitive type:

		boolean result = true;
		char capitalC = 'C';
		byte b = 100;
		short s = 10000;
		int i = 100000;
		
		//For general-purpose programming, the decimal system is likely to be the only number system you'll ever use. However, if you need to use another number system, the following example shows the correct syntax. The prefix 0x indicates hexadecimal and 0b indicates binary:

		// The number 26, in decimal
		int decVal = 26;
		//  The number 26, in hexadecimal
		int hexVal = 0x1a;
		// The number 26, in binary
		int binVal = 0b11010;

		//Floating-Point Literals
		//A floating-point literal is of type float if it ends with the letter F or f; otherwise its type is double and it can optionally end with the letter D or d.

		//The floating point types (float and double) can also be expressed using E or e (for scientific notation), F or f (32-bit float literal) and D or d (64-bit double literal; this is the default and by convention is omitted).

		double d1 = 123.4;
		// same value as d1, but in scientific notation
		double d2 = 1.234e2;
		float f1  = 123.4f;
		
		// Using Underscore Characters in Numeric Literals
		
		long creditCardNumber = 1234_5678_9012_3456L;
		long socialSecurityNumber = 999_99_9999L;
		float pi =  3.14_15F;
		long hexBytes = 0xFF_EC_DE_5E;
		long hexWords = 0xCAFE_BABE;
		long maxLong = 0x7fff_ffff_ffff_ffffL;
		byte nybbles = 0b0010_0101;
		long bytes = 0b11010010_01101001_10010100_10010010;
		
		System.out.println("=====================================");
		System.out.println(creditCardNumber);
		System.out.println(socialSecurityNumber);
		System.out.println(pi);
		System.out.println(hexBytes);
		System.out.println(hexWords);
		System.out.println(maxLong);
		System.out.println(nybbles);
		System.out.println(bytes);
		
	}

}
