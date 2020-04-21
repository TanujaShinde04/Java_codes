package module01;

public class Threadtable extends Thread{
	public void run()
	{
		//System.out.println("Thread is running");
		
	}
	synchronized void printtable(int n)
	{
		System.out.println("table for "+n);
		for(int i=1;i<=10;i++)
		{
			System.out.print(n*i + " ");
		}
		System.out.print("\n");
	}

	public static void main(String[] args) {
		Threadtable t= new Threadtable();
		t.start();
		int n=1;
		for(int i=0;i<20;i++)
		{
			t.printtable(n);
			n++;
		}
		
	}

}
