package module01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Three {
	public static void main(String args[])
	{
		List<String> members=Arrays.asList("Abish", "Bhargavi", "Alex", "Max", "Annie");
		
		Stream<String> stream = members.stream();
		
		int count= (int) stream.filter( item -> item.startsWith("A") ).count();
		System.out.println("Count of strings who are beginning with char A are : ");
		System.out.println(count);
	}

}
