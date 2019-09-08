package Operators;

public class LogicalOperators {

	public static void main(String[] args) {
		
		
	    // c1  c2   c1 && c2
		// T   T        T
		// T   F        F
		// F   T        F
		// F   F        F
		
	    // c1  c2   c1 || c2
		// T   T        T
		// T   F        T
		// F   T        T
		// F   F        F
		
		// precedence ==> ! > && > ||

		boolean c1 = 2 > 3 ;
		boolean c2 = 2 > 3 || 4 != 5;
		boolean c3 = !(2 > 3) || 4 != 5;
		boolean c4 = 2 > 3 && 4 != 5;
		boolean c5 = !(2 > 3) && 4 != 5;
		
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		
		System.out.println("------------------");
		
		boolean c6 = 10 < 5; // false
		boolean c7 = c2 || c5; // true
		boolean c8 = c5 && c6; // false
		boolean c9 = c2 || c5 && c6; // true, firstly Java will test c5 && c6 because the precedence factor
		boolean c10 = (c2 || c5) && c6;
		
		System.out.println(c6);
		System.out.println(c7);
		System.out.println(c8);
		System.out.println(c9);
		System.out.println(c10);
	}

}
