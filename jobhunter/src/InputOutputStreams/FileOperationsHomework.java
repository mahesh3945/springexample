    package InputOutputStreams;
	import java.io.FileInputStream;
    import java.io.FileOutputStream;
	import java.io.IOException;
	public class FileOperationsHomework 
	{
	 public static void main(String[] args) 
	 {  
	/* try(FileOutputStream fileOutputStream=new FileOutputStream("C:/Users/Mahi Gani/Desktop/DemoTwo.txt"))
	 {  
	  System.out.println("file created");
	  String message="\n java is platform independent";
	  fileOutputStream.write(message.getBytes());
	  fileOutputStream.write(65);
	 }
	 catch(IOException e)
	 {
	  e.printStackTrace();  
	 } */  
	try(FileInputStream fileInputStream=new FileInputStream("C:/Users/Mahi Gani/Desktop/Demo.txt");
		FileOutputStream fileoutputstream = new FileOutputStream("C:/Users/Mahi Gani/Desktop/DemoTwo.txt");)
	  {
	   int bdataa;
	   while((bdataa=fileInputStream.read())!=-1)
	   {
	    /*System.out.print((char)bdataa);*/
		   fileoutputstream.write(bdataa);
	   }
	   System.out.println("file copied");
	  }
	  catch(IOException e)
	  {
	   e.printStackTrace();   
	  }   
}
}
