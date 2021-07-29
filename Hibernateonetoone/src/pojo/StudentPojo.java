package pojo;

import java.util.Set;

public class StudentPojo 
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
public int getStudentFee() {
	return studentFee;
}
public void setStudentFee(int studentFee) {
	this.studentFee = studentFee;
}
private String studentName;
private String studentCourse;
private int studentFee;
private PersonDetailsPojo personDetails;
public PersonDetailsPojo getPersonDetails() {
	return personDetails;
}
public void setPersonDetails(PersonDetailsPojo personDetails) {
	this.personDetails = personDetails;
}

}
