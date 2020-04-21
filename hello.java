package module01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class hello {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line;
		try {
			while ((line = br.readLine()) != null) {
				String[] tokens = line.split("\\s");
				System.out.println(Arrays.toString(tokens));
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

}
}
