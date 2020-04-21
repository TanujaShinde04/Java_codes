package module01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		String str;
		System.out.println("Enter string");
		Scanner sc= new Scanner(System.in);
		str= sc.nextLine();
		System.out.println(str);
		String filename= "/home/tanuja/Desktop/text.txt";
		String s;
		do
		{
			
			s= sc.nextLine();
			try { 
				  
	            // Open given file in append mode. 
	            BufferedWriter out = new BufferedWriter( new FileWriter(filename, true)); 
	            out.write(s); 
	            out.append('\n');
	            out.close(); 
	        } 
	        catch (IOException e) { 
	            System.out.println("exception occoured" + e); 
	        }
			
		}while(s.length() != 0);
	}

}
