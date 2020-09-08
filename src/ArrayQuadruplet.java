import java.util.Arrays;

public class ArrayQuadruplet {

	public static int[] getArrayQuadruplet(int tab[], int sum) {
		int[] result = new int[] {};
		if (tab == null || tab.length < 4) {
			return result;
		}
		// Sort
		Arrays.sort(tab);
		int length = tab.length;

		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {

				int low = j + 1;
				int hight = length - 1;
				int current = tab[i] + tab[j];

				while (low < hight) {
					if (tab[low] + tab[hight] + current < sum) {
						low++;
					} else if (tab[low] + tab[hight] + current > sum) {
						hight--;
					} else {
						System.out.println(tab[i] + "," + tab[j] + "," + tab[low] + "," + tab[hight]);
						result = new int[] { tab[i], tab[j], tab[low], tab[hight] };
						return result;
					}
				}
			}
		}
		return tab;
	}

	public static void main(String[] args) {

		// Input sum
		int sum = 20;

		// Input tab with numbers
		int tab[] = { 2, 7, 4, 0, 9, 5, 1, 3 }; // (0,4,7,9)

		getArrayQuadruplet(tab, sum);
	}

}
