import java.util.Arrays;

public class SumCouple {

	public static void main(String[] args) {

		// Sum to check for each couple of number
		int sum = 8;

		// Input tab with numbers
		// int tab[] = { 1, 2, 3, 9 }; // no result
		// int tab[] = { 1, 2,4,4}; // (4,4)
		int tab[] = { 1, 2, 4, 5, 8, 19, 3 }; // (3,5)
		int length = tab.length;

		// solution 1
		System.out.println("Solution 1: ");
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (sum == (tab[i] + tab[j])) {
					System.out.println("(" + tab[i] + "," + tab[j] + ")");
				}
			}
		}

		// solution 2
		// sort first
		System.out.println("Solution 2: ");
		Arrays.sort(tab);
		// Loop from the start and the end at the same time

		int low = 0;
		int hight = length - 1;

		while (low < hight) {
			if (tab[low] + tab[hight] < sum) {
				low++;
			} else if (tab[low] + tab[hight] > sum) {
				hight--;
			} else {
				System.out.println("(" + tab[low] + "," + tab[hight] + ")");
				// low = hight;
				break;
			}

		}

	}

}
