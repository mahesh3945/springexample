package multithreadsConcepts;
class Resource 
{
	public synchronized  void readData()
	{
	System.out.println(Thread.currentThread().getState()+"----"+ Thread.currentThread().getName());
	 for(int i=1;i<=5;i++)
	 {
		 System.out.println(Thread.currentThread().getName()+"----"+i);
		 try
		 {		
		Thread.sleep(100);
		 }
		 catch (InterruptedException e) 
		 {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	}		
}

class  ReadThread extends Thread
{

Resource  resource;
public ReadThread(Resource resource) 
{
this.resource=resource;
}	
	
	@Override
	public void run() 
	{
		System.out.println();
		resource.readData();		
	
	}
}

public class ThreadDemoExam 
{
	public static void main(String[] args) 
	{
		Resource resource=new Resource(); 
		ReadThread readThread1=new ReadThread(resource);
		readThread1.start();
		readThread1.setName("RT1");
		readThread1.setPriority(10);
		
		ReadThread readThread2=new ReadThread(resource);
		readThread2.start();
		readThread2.setName("RT2");
		readThread2.setPriority(1);
		
		
		ReadThread readThread3=new ReadThread(resource);
		readThread3.start();
		readThread3.setName("RT3");
		

		
		ThreadGroup tg= Thread.currentThread().getThreadGroup();
		
		tg.list();
		
		System.out.println(Thread.activeCount());
		System.out.println(readThread1.isAlive());
		System.out.println(readThread2.isAlive());
		System.out.println(readThread3.isAlive());
		
		try {
			readThread1.join();
			readThread2.join();
			readThread3.join();
			}
		catch (InterruptedException e)
		{
			
			e.printStackTrace();
		}
		System.out.println(Thread.activeCount());
		System.out.println(readThread1.isAlive());
		System.out.println(readThread2.isAlive());
		System.out.println(readThread3.isAlive());
		tg.list();
		}
}