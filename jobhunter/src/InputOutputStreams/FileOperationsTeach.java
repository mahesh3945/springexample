package InputOutputStreams;

	import java.io.FileInputStream;
    import java.io.FileOutputStream;
	import java.io.IOException;
	public class FileOperationsTeach 
	{
	 public static void main(String[] args) 
	 {  
	 try(FileOutputStream fileOutputStream=new FileOutputStream("C:/Users/Mahi Gani/Desktop/Demo.txt",true))
	 {  
	  System.out.println("file created");
	  String message="\njava programming language";
	  fileOutputStream.write(message.getBytes());
	  fileOutputStream.write(65);
	 }
	 catch(IOException e)
	 {
	  e.printStackTrace();  
	 }   
	try(FileInputStream fileInputStream=new FileInputStream("C:/Users/Mahi Gani/Desktop/Demo.txt");
		FileInputStream fileInputStream1=new FileInputStream("C:/Users/Mahi Gani/Desktop/DemoTwo.txt"))
	  {
	   /* int count=fileInputStream.available();
	    
	    for (int i = 0; i < count; i++)
	    {
	     System.out.print((char)fileInputStream.read());     
	    }*/   
	   int bdata;
	   while((bdata=fileInputStream.read())!=-1)
	   {
	    System.out.print((char)bdata);
	    
	   }
	  }
	  catch(IOException e)
	  {
	   e.printStackTrace();   
	  }   
}
}