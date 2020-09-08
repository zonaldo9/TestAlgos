import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class TemperatureProcheZeroStream {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // the number of temperatures to analyse
		in.nextLine();
		String temps = in.nextLine(); // the n temperatures expressed as integers ranging

		if (n == 0)
			System.out.println(0); // stop programm and print "0" if no information received

		else {
			// Stream string "temps" to integer array
			int[] array = Stream.of(temps.split(" ")).mapToInt(Integer::parseInt).toArray();
			Arrays.sort(array); // Sorting array by ascending order
			// Create integer variable "near"... we will write nearest to 0 value to this variable
			int near = array[0];

			// If any abs value in array less than or equal to first minimal value in array...
			for (int i = 0; i < array.length; i++) { 
				if (Math.abs(array[i]) <= Math.abs(near)) { 
					near = array[i]; // ...than near to 0 will be leaser value
				}
			}

			System.out.println(near); // print closest to 0 value
		}
	}

}
