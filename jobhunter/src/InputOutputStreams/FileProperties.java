package InputOutputStreams;

import java.io.File;

public class FileProperties
{
	public static void main(String[] args) 
	{		
		File file=new File("F:/FileEx");
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.canWrite());
		String names[]=file.list();
		for (int i = 0; i < names.length; i++) 
		{
		System.out.println(names[i]);	
		}		
	}

}
