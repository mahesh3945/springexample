package InputOutputStreams;

import java.io.File;

public class FilePropertiesEx
{
	public static void main(String[] args)
	{
		File folder = new File("F:/downloads");
		File[] listOfFiles = folder.listFiles();

		
		String directories="",files="";
		    for (int i = 0; i < listOfFiles.length; i++)
		    { 
		      if (listOfFiles[i].isFile()) {
		    	  files=files.concat(listOfFiles[i].getName()+"\n");
		        //System.out.println("File is :  " + listOfFiles[i].getName());
		      } 
		      else if (listOfFiles[i].isDirectory())
		      {
		    	  directories=directories.concat(listOfFiles[i].getName()+"\n");
		       // System.out.println("Directories is: " + listOfFiles[i].getName());
		      }
		    }
		    System.out.println("no of directories are:\n"+ directories);
		    System.out.println("no of files:\n"+ files);

}
}