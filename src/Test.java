import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.IntStream;

public class Test {

	
	
	public static List<Person> createPeople() {

		return Arrays.asList(new Person("khalil", "36"), //
				new Person("Paul", "56"), //
				new Person("sara", "6"), //
				new Person("jack", "20"), //
				new Person("claire", "35"));

	}

	public static void main(String[] args) {
		
		
		
		
		final String uuid = UUID.randomUUID().toString().replace("-", "");
	    System.out.println("uuid = " + uuid); 
		
		
		
		
		IntStream.range(0, 10)
		.map(operand -> operand + 3)
		.filter(value -> value % 2 == 0)
		.limit(4)
		.forEach(value -> System.out.println("value = " + value));
		
		
		List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//		System.out.println(myList);
		// myList.forEach(a -> System.out.println("a = " + a));

//		System.out.println(//
//				myList.stream()//
//						.filter(a -> a % 2 == 0)//
//						.map(a -> a * 2)//
//						.collect(Collectors.toList())//
//		);

		// Integer i = 2147483647;
		// // Print the value of Integer.MAX_VALUE
		// System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
		//
		// createPeople().stream()//
		// .filter(person -> person.getAge() > 30)//
		// .forEach(person -> System.out.println(person.getName()));
		//
		// List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		//
		// myList.stream().filter(e -> e > 5).map(e -> e * 2).forEach(System.out::print);
		//
		// // mutable List<Integer> list = Arrays.asList(1, 2, null); list.set(1, 10); // OK
		//
		// // inmutable List<Integer> list1 = List.of(1, 2, 3); list1.set(1, 10); // Fails with
		// // UnsupportedOperationExceptio
		//
		// Map<String, Integer> map1 = new HashMap<String, Integer>();
		//
		// // Create a String with no repeated keys
		// Stream<String[]> str = Stream.of(new String[][] { { "GFG", "GeeksForGeeks" }, { "g",
		// "geeks" }, { "G", "Geeks" } });
		//
		// // Convert the String to Map // using toMap() method Map<String, String> map =
		// str.collect(Collectors.toMap(p -> p[0], p -> p[1]));
		//
		// // Print the returned Map System.out.println("Map:" + map);

	}

}
