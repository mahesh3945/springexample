package InputOutputStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputExample {

	public static void main(String[] args)
	{
		try(FileOutputStream fileoutputstream = new FileOutputStream("C:/Users/Mahi Gani/Desktop/NewDemo.txt",true);)			
		{
			System.out.println("File Created");
			String message="\n java is platform independent";
			fileoutputstream.write(message.getBytes());	
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}