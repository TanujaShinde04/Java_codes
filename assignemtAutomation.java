package module01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class assignemtAutomation {
	
	public static void main(String[] args) throws IOException {
		int ch; 
		Scanner sc= new Scanner(System.in);
        FileReader fr=null; 
        try
        { 
            fr = new FileReader("/home/tanuja/Desktop/text.txt"); 
        } 
        catch (FileNotFoundException fe) 
        { 
            System.out.println("File not found"); 
        } 
        while ((ch=fr.read())!=-1) 
            System.out.print((char)ch); 
        fr.close(); 
        
        
        System.out.println("\nEnter your answer below:");
        
        String filename= "/home/tanuja/Desktop/output.txt";
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
