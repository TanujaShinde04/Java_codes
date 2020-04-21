package module01;

import java.util.Scanner;
import java.util.regex.Pattern;

public class emailvalidator {
	
	public static boolean isValid(String email) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    } 

	public static void main(String[] args) {
		String email;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter emil id");
		email= sc.next();
        if (isValid(email)) 
            System.out.print("\nVALID EMAIL ID"); 
        else
            System.out.print("\nINVALID EMAIL ID"); 

	}

}
