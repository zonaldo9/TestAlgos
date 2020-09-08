import java.util.Arrays;

public class BinarySearch {

	public static boolean exists(int ints[], int k) {

		return binarySearch(ints, k, 0, ints.length - 1);
	}

	static boolean binarySearch(int ints[], int k, int low, int high) {

		while (low <= high) {
			int mid = (high + low) / 2;
			if (k > ints[mid]) {
			return	binarySearch(ints, k, mid + 1, high);
			} else if (k < ints[mid]) {
				return binarySearch(ints, k, low, high - 1);
			} else {
				return true;
			}

		}

		return false;

	}

	public static void main(String[] args) {

		int sortedArray[] = { 1, 6, 9 };
		int key = 9;
		int index = Arrays.binarySearch(sortedArray, key);

		// System.out.println(index);
		System.out.println(exists(sortedArray, key));

		int maxInt = Integer.MAX_VALUE;
		int high = 2100000000;
		int low = 2000000000;
//		System.out.println("mid using >>> 1 = " + ((low + high) >>> 1));
//		System.out.println("mid using / 2   = " + ((low + high) / 2));
	}

}
