package module01;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class One {

	public static void main(String[] args) {
		
		Stream<String> names = Stream.of("aBc", "d", "ef");
		System.out.println("Converted Uppercase strigs: ");
		System.out.println(names.map(s -> {
				return s.toUpperCase();
			}).collect(Collectors.toList()));

	}

}
