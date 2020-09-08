import java.util.HashSet;
import java.util.Vector;

// Input: A = [1, 12, 23, 34]
// Output: 7
// The subarrays are: {1}, {12}, {23}, {34}, {1, 23}, {1, 34}, {12, 34}
// Therefore the count of such subarrays = 7
// Input: A = [5, 12, 2, 1, 165, 2323, 7]
// Output: 33
public class CountOfSubarrays {

	// Given an array A containing N positive integers,
	// the task is to find the number of subarrays
	// of this array such that in each subarray,
	// no digit is repeated twice, i.e. all the digits of
	// the subarray must be unique.

	// Function to check whether
	// the subarray has all unique digits
	static boolean check(Vector<Integer> v) {

		// Storing all digits occurred
		HashSet<Integer> digits = new HashSet<Integer>();

		// Traversing all the numbers of v
		for (int i = 0; i < v.size(); i++) {
			// Storing all digits of v[i]
			HashSet<Integer> d = new HashSet<Integer>();

			while (v.get(i) > 0) {
				d.add(v.get(i) % 10);
				v.set(i, v.get(i) / 10);
			}

			// Checking whether digits of v[i]
			// have already occurred
			for (int it : d) {
				if (digits.contains(it))
					return false;
			}

			// Inserting digits of v[i] in the set
			for (int it : d)
				digits.add(it);
		}

		return true;
	}

	// Function to count the number
	// subarray with all digits unique
	static int numberOfSubarrays(int a[], int n) {

		int answer = 0;

		// Traverse through all the subarrays
		for (int i = 1; i < (1 << n); i++) {
			// To store elements of this subarray
			Vector<Integer> temp = new Vector<Integer>();

			// Generate all subarray
			// and store it in vector
			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) > 0)
					temp.add(a[j]);
			}

			// Check whether this subarray
			// has all digits unique
			if (check(temp))

				// Increase the count
				answer++;
		}

		// Return the count
		return answer;
	}

	public static void main(String[] args) {
		int N = 4;
		int A[] = { 1, 12, 23, 34 };

		System.out.print(numberOfSubarrays(A, N));
	}
}
