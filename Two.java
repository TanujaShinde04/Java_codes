package module01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Two {

	public static void main(String[] args) {
		List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		int count = (int) strings.stream().filter(string -> string.isEmpty()).count();
		
		System.out.println("Count of empty strings are");
		System.out.println(count);
	}

}
