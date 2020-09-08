public class TemperatureProcheZero {

	public static void main(String args[]) {
		 int input[] = { -2, 2};
//		int input[] = { 7, -10, 13, 8, 4, -7, -12, -3, 3, -9, 6, -1, -6, 7 };
		int n = input.length; // the number of temperatures to analyse

		int smallest = input[0];
		for (int i = 0; i < n; i++) {
			if (Math.abs(input[i]) <= Math.abs(smallest)) {
				smallest = input[i];
			} 

		}

		System.out.println("result = " + smallest);
	}

}
