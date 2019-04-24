package InputOutputStreams;

import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutputStreams
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
}
}