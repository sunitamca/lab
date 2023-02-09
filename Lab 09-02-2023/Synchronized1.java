package Lab;

class  PrintData{
	synchronized void multiplication(int n)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(n+"*"+i+"="+n*i);
			try {
				Thread.sleep(400);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
}

public class Synchronized1 {
	public static void main(String[] args)
	{
		PrintData pd= new PrintData();
		
		Thread t1 = new Thread() {
			public void run()
			{
				pd.multiplication(5);
			}
			
				};
				Thread t2=new Thread() {
					public void run()
					{
						pd.multiplication(10);
					}
				};
				t1.start();
				t2.start();
	}

}
