import java.util.Arrays;
import java.util.List;

public class TestImmuable {


	private final static String test = "testtest";
	
	private final static List<String> tabTest =  Arrays.asList("a","b");

	public static void main(String[] args) {
		tabTest.add("c");
		System.out.println(test);
		tabTest.forEach(e-> System.out.println(e));
		
		String s0 = "khalil";
		String s = "khalil";
		String s1 = new String("khalil").intern();
		String s2 = new String("khalil");

		System.out.println("s == s0 ? " + (s0 == s));
		// intern()
		System.out.println("s == s1 ? " + (s == s1));
		System.out.println("s == s2 ? " + (s == s2));		
		System.out.println("s1 == s2 ? " + (s1 == s2));

	}

}
