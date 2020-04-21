package module01;

import java.util.Scanner;

public class student {

	public static void main(String[] args) {
		String first_name;
		String last_name;
		String birthdate;
		String s="";
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First Name of student");
		first_name= sc.nextLine();
		System.out.println("Enter Last Name of student");
		last_name= sc.nextLine();
		System.out.println("Enter Birth day date of student");
		birthdate= sc.nextLine();

		char ch = first_name.charAt(0); 
		char ch1= last_name.charAt(0);
		String ch3= birthdate.substring(0,2);
        String chh=Character.toString(ch);
        String ch11=Character.toString(ch1);
		s= s.concat(chh);
		s= s.concat(ch11);
		s= s.concat(ch3);
		System.out.println("Student id create is: ");
        System.out.println(s); 
		
		

	}

}
