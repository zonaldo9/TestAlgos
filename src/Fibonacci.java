import java.math.BigInteger;

public class Fibonacci {

	// Version 1
	// Recursion
	// Time Complexity:O(n)
	// Extra Space: O(1)
	public static int fibonacci1(int n) {
		if (n >= 2) {
			return fibonacci1(n - 1) + fibonacci1(n - 2);
		}
		return n;
	}

	// Version 2
	// Dynamic Programming
	// Time Complexity:O(n)
	// Extra Space: O(n)
	public static int fibonacci2(int n) {
		/* Declare an array to store Fibonacci numbers. */
		int f[] = new int[n + 1];
		f[0] = 0;
		if (n == f[0]) {
			return f[0];
		}
		f[1] = 1;
		for (int i = 2; i <= n; i++) {
			// Add the previous 2 numbers in the series and store it
			f[i] = f[i - 1] + f[i - 2];
		}
		return f[n];
	}

	// Version 3
	// store intermediate result (using Space Optimized Method)
	// Time Complexity:O(n)
	// Extra Space: O(1)
	public static int fibonacci3(int n) {
		int f0 = 0, f1 = 1, f;
		if (n == 0)
			return f0;
		for (int i = 2; i <= n; i++) {
			f = f0 + f1;
			f0 = f1;
			f1 = f;
		}
		return f1;
	}

	// Version 4 : Fn = {[(√5 + 1)/2] ^ n} / √5
	// Time Complexity: O(1)
	// Space Complexity: O(1)
	public static int fibonacci4(int n) {
		double phi = (1 + Math.sqrt(5)) / 2;
		return (int) Math.round(Math.pow(phi, n) / Math.sqrt(5));
	}

	// Version 4 : large input
	public static BigInteger fibonacci5(int n) {
		BigInteger a = BigInteger.valueOf(0);
		BigInteger b = BigInteger.valueOf(1);
		BigInteger c = BigInteger.valueOf(1);
		for (int j = 2; j <= n; j++) {
			c = a.add(b);
			a = b;
			b = c;
		}

		return (a);
	}

	public static void main(String[] args) {
		int input = 1000;
		// System.out.println("Fibonacci1 (" + input + ") = " + fibonacci1(input));
		// System.out.println("Fibonacci2 (" + input + ") = " + fibonacci2(input));
		// System.out.println("Fibonacci3 (" + input + ") = " + fibonacci3(input));
		// System.out.println("Fibonacci4 (" + input + ") = " + fibonacci4(input));
		System.out.println("Fibonacci5 (" + input + ") = " + fibonacci5(input));
	}

}
