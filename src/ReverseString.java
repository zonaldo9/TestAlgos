public class ReverseString {

	public static void main(String[] args) {

		String input = "Geeks For Geeks";

		StringBuffer sb = new StringBuffer(input);
		sb.reverse();
		// System.out.println(sb);

		for (char c : reverseString(input))
			System.out.print(c);
	}

	private static char[] reverseString(String input) {

		char[] temparray = input.toCharArray();
		int low = 0;
		int high = input.length() - 1;

		for (low = 0; low < high; low++, high--) {
			char tmp = temparray[low];
			temparray[low] = temparray[high];
			temparray[high] = tmp;
		}

		return temparray;
	}

}
