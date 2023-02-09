package Lab;

public class DemoThread1 extends Thread {
		public DemoThread1 (String name)
		{
			super(name);
		}
		public void run()
		{
			System.out.println("Thread is running !!"+Thread.currentThread().getName()+"Priority:"+Thread.currentThread().getPriority());
			
		}
		public static void  main(String[]arg)
		{
			DemoThread1 t1=new DemoThread1("First-Thread");
			DemoThread1 t2=new DemoThread1("Second-Thread");
			DemoThread1 t3=new DemoThread1("Third-Thread");
			
			t1.setPriority(2);
			t2.setPriority(9);
			t3.setPriority(1);
			
			t1.start();
			t2.start();
			t3.start();
			
		}

	}



