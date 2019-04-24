package OopsConcepts;
class PersonDetails
{
	private String firstName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	private String lastName;
	private String emailId;
	private long contactNumber;
}
class Student extends PersonDetails
{
	private int studentId;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentCourse() {
		return studentCourse;
	}
	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	private String studentName;
	private String studentCourse;
	private String studentCity;
}
public class SingleInheritenceClass {

	public static void main(String[] args) 
	{
		
		Student student=new Student();
		student.setStudentId(1111);
		student.setStudentName("mahesh");
		student.setStudentCity("Hyderabad");
		student.setStudentCourse("computers");
		System.out.println("SID ID \t       S NAME\t      S COURSE \t\t S CITY \tFIRSTNAME \t LASTNAME \t EMAIL ID \t CONTACT NUMBER" );
		System.out.println("============================================================================================================================");
		System.out.print(student.getStudentId() +"\t"+"\t"+ student.getStudentName()+"\t"+"\t"+ student.getStudentCourse() +"\t"+ student.getStudentCity() +"\t");
		System.out.println(student.getFirstName()+"\t"+"\t"+ student.getLastName() +"\t"+"\t"+ student.getEmailId() +"\t"+"\t"+"\t"+student.getContactNumber());
	}

}
 




















