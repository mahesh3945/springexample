package InputOutputStreams;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.StringTokenizer;

public class FileInputExample
{

	public static void main(String[] args)
	{
		try {
			try(FileInputStream fileinputstream= new FileInputStream("C:/Users/Mahi Gani/Desktop/NewDemo.txt");)
			{
			   int bdata;
			   while((bdata=fileinputstream.read())!=-1)
			   {
			    System.out.print((char)bdata);
			   }
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
