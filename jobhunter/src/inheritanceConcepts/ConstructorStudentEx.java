package inheritanceConcepts;

public class ConstructorStudentEx extends ConstructorPersonEx
{
	/*public ConstructorStudentEx()
	{
		studentId=0;
		studentCourse=""; 
		studentAge=0;
		studentAddress="";
	}*/
	public ConstructorStudentEx(int studentId,String studentCourse,int studentAge,String studentAddress, String firstName, String lastName, String emailId, long contactNumber)
	{
		super(firstName,lastName, emailId,contactNumber);
		this.studentId=studentId;
		this.studentCourse=studentCourse;
		this.studentAge=studentAge;
		this.studentAddress=studentAddress;
		 	
	}
	
	public int studentId;

	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentCourse() {
		return studentCourse;
	}
	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String studentCourse;
	public int studentAge;
	public  String studentAddress;
	
}
