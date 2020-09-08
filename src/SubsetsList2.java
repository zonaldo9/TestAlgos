import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * TIme:  n*2^n
 * @author 33778
 *
 */
public class SubsetsList2 {

	public static void main(String[] args) {
		int inputList[] = { 1, 2, 3 };
		List<List<Integer>> s = subsets(inputList);
		for (List<Integer> list : s) {
			System.out.print(list);
		}
	}

	public static List<List<Integer>> subsets(int[] input) {
		List<List<Integer>> results = new ArrayList<>();

		if (input == null || input.length == 0) {
			return results;
		}

		Arrays.sort(input);

		List<Integer> subset = new ArrayList<>();
		toFindAllSubsets(input, results, subset, 0);

		return results;
	}

	private static void toFindAllSubsets(int[] input, List<List<Integer>> results, List<Integer> subset, int startIndex) {
		results.add(new ArrayList<>(subset));

		for (int i = startIndex; i < input.length; i++) {
			subset.add(input[i]);
			toFindAllSubsets(input, results, subset, i + 1);
			subset.remove(subset.size() - 1);
		}
	}
}
