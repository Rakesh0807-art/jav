5) a) Design, Develop and Implement a Java program that creates three threads. First thread displays “Good Morning “every one second, the second thread displays “Hello” every two seconds and the third thread displays “Welcome” every three seconds.

public class One extends Thread {
	
	public void run()
	{
		try 
		{
			int i=0;
			while (i<5) 
			{
				sleep(1000);
				System.out.println("Good morning");
				i++;
			}
		}
			
		catch(InterruptedException e)
		{
			System.out.println("Interrupted");
		}

	}
}

public class Two extends Thread {
	
	
	public void run()
	{
		try 
		{
			int i=0;
			while (i<5) 
			{
				sleep(2000);
				System.out.println("Hello");
				i++;
			}
		}
			
		catch(InterruptedException e)
		{
			System.out.println("Interrupted");
		}
      }
}
public class Three extends Thread {
	
	public void run()
	{
		try 
		{
			int i=0;
			while (i<5) 
			{
				sleep(3000);
				System.out.println("Welcome");
				i++;
			}
		}
			
		catch(InterruptedException e)
		{
			System.out.println("Interrupted");
		}

	}
}
	}
}

public class MyThread {

	public static void main(String[] args) {
		
		One t1=new One();
		Two t2=new Two();
		Three t3=new Three();
		
		t1.start();
		t2.start();
		t3.start();
		
		}
		
}
