package module01;

import java.util.Scanner;


abstract class account {
	   String name;
	   int acc_no;
	   int balance;
	   static final int min_bal=500;
	   Scanner sc= new Scanner(System.in);
	   void open_account()
		{
			int bal;
			System.out.println("enter name for account");
			name= sc.nextLine();
			System.out.println("enter Account number");
			acc_no= sc.nextInt();
			System.out.println("Enter account opening balance");
			bal= sc.nextInt();
			if(bal >= min_bal)
			{
				balance+=bal;
			}
			else
			{
				System.out.println("Deposit more amount please..");
			}
		}
	   	abstract void deposit();
	   	abstract void withdraw();
	   
}

class sb_Account extends account
{
	Scanner sb1= new Scanner(System.in);
	void deposit()
	{
		int amt;
		System.out.println("Enter Amount U Want to Deposit : ");
		amt=sb1.nextInt();
		balance=balance+amt;
		
	}
	void withdraw()
	{
		int amt;
		System.out.println("Enter Amount U Want to withdraw : ");
		amt= sb1.nextInt();
		if(balance>=amt)
		{ 
			balance=balance-amt;
			System.out.println("Your current balance remains:" +balance);
		}
		else
		{
			System.out.println("Less Balance..Transaction Failed..");
		}
	}
	
	void display()
	{
		System.out.println("Account Holder Details are:");
		System.out.println("Account holder Name is: " +name);
		System.out.println("Account holder balance is: " +acc_no);
		System.out.println("Account holder balance is: " +balance);
		System.out.print("\n");
	}
}

class current_account extends account
{
	Scanner sb1= new Scanner(System.in);
	void display()
	{
		System.out.println("Account Holder Details are:");
		System.out.println("Account holder Name is: " +name);
		System.out.println("Account holder balance is: " +acc_no);
		System.out.println("Account holder balance is: " +balance);
		System.out.print("\n");
	}
	void deposit()
	{
		int amt;
		System.out.println("Enter Amount U Want to Deposit :");
		amt=sb1.nextInt();
		balance=balance+amt;
	}
	void withdraw()
	{

		int amt;
		System.out.println("Enter Amount U Want to withdraw : ");
		amt= sb1.nextInt();
		if(balance>=amt)
		{ 
			balance=balance-amt;
			System.out.println("Your current balance remains:" +balance);
		}
		else
		{
			System.out.println("Less Balance..Transaction Failed..");
		}
	}
}

public class main_account {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		char c;
		System.out.println("Which type of account you want to create??");
		System.out.println("press s for savings account and c for current account");
		c= s.next().charAt(0);
		if(c=='s')
		{
			sb_Account sb= new sb_Account();
			sb.open_account();
			sb.display();
			int ch;
			do
			{
				System.out.println("Main menu:\n1: deposit\n 2.withdraw \n3.check_balance\n4.exit");
				ch= s.nextInt();
				System.out.print("\n");
				switch(ch)
				{
					case 1:
						sb.deposit();
						break;
					case 2:
						sb.withdraw();
						break;
					case 3:
						sb.display();
						break;
					case 4:
						System.out.println("Good Bye..");
						break;
					default :
						System.out.println("invalid choice....");
				}
					
			}while(ch!=4);
			
			
		}
		
		if(c=='c')
		{
			current_account ca= new current_account();
			ca.open_account();
			ca.display();
			
			int ch;
			do
			{
				System.out.println("Main menu:\n1: deposit\n 2.withdraw \n3.check_balance\n4.exit");
				ch= s.nextInt();
				switch(ch)
				{
					case 1:
						ca.deposit();
						break;
					case 2:
						ca.withdraw();
						break;
					case 3:
						ca.display();
						break;
					case 4:
						System.out.println("Good Bye..");
						break;
					default :
						System.out.println("invalid choice....");
				}
					
			}while(ch!=4);
		}
	}

}
