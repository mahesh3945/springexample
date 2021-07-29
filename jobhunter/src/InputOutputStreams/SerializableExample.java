package InputOutputStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableExample
{

	public static void main(String[] args)
	{
		try(FileOutputStream fileoutputstream = new FileOutputStream("C:/Users/Mahi Gani/Desktop/Serializable.txt");
				ObjectOutputStream objectoutputstream = new ObjectOutputStream(fileoutputstream); )
			
		{
		Student s1= new Student();	
		s1.setStudentId(101);
		s1.setStudentName("mahesh");
		s1.setStudentCourse("cse");
		objectoutputstream.writeObject(s1);
		System.out.println("object transfered");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		try(FileInputStream fileinputstream = new FileInputStream("C:/Users/Mahi Gani/Desktop/Serializable.txt");
				ObjectInputStream objectinputstream = new ObjectInputStream(fileinputstream);)
		{
			Student st= (Student)objectinputstream.readObject();
			System.out.println(st.getStudentId()+"\t"+st.getStudentName()+"\t"+st.getStudentCourse());
		}
		catch (IOException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}
