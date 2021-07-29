package multithreadsConcepts;

   	class MyThread extends Thread
   	{
   		public void run()
   	{
   			System.out.println("Hello");
   			System.out.println("Hello thread");
   	}
 }
   	class ThreadDemo 
   	{
   		public static void main(String[] args)
   		{
   			MyThread t=new MyThread();
   			t.start();
   		}
}
   