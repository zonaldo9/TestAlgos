import java.util.ArrayList;
import java.util.List;

public class SubsetsList {

	public static void main(String[] args) {
		int inputList[] = { 1, 2, 3 };
		List<List<Integer>> s = getSubsetList(inputList);
		for (List<Integer> list : s) {
			System.out.print(list);
		}
	}

	private static List<List<Integer>> getSubsetList(int[] inputList) {
		List<List<Integer>> subsets = new ArrayList<List<Integer>>();
		ArrayList<Integer> sub = new ArrayList<Integer>();
		subsets.add(sub);
		for (int i = 0; i < inputList.length; i++) {
			sub = new ArrayList<Integer>();
			sub.add(inputList[i]);
//			for (int j = i + 1; j < inputList.length; j++) {
//				sub.add( inputList[j]);
//			}
			subsets.add(sub);
		}

		// TODO Auto-generated method stub
		return subsets;
	}

}
