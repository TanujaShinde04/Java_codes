package module01;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int ch;
		do {
			System.out.println("Enter your choice : \n 1.insert element in array list \n 2. delete element\n 3. display \n 4.exit");
			ch= sc.nextInt();
			switch(ch) 
			{
				case 1:
					System.out.println("Enter element to be inserted:");
					int el;
					el= sc.nextInt();
					arr.add(el);
					System.out.println("Element inserted");
					break;
				
				case 2:
					System.out.println("Enter element to be deleted");
					int dl;
					dl= sc.nextInt();
					int index= arr.indexOf(dl);
					arr.remove(new Integer(dl));
					System.out.println("Element deleted at index" +index);
					
				case 3:
					 System.out.println(arr);
					 
				default:
					System.out.println("Enter valid choice");
				
			}
			
			
		}while(ch!=4);
		
		
		
	
		
	}

}
