package InputOutputStreams;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.StringTokenizer;

public class FileInpuStreams
{	
	public static void main(String[] args)
	{
	try(FileInputStream fileInputStream=new FileInputStream("C:/Users/Mahi Gani/Desktop/Extra/Demo.txt");)
	{ 
	/*{
	    int count=fileInputStream.available();
	    
	    for (int i = 0; i < count; i++)
	    {
	     System.out.print((char)fileInputStream.read());     
	    }
	  }
	  */   
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