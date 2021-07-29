package inheritanceConcepts;

public class HiFaculty extends HiPerson
{
 public int  facultyId;
 public int getFacultyId() {
	return facultyId;
}
public void setFacultyId(int facultyId) {
	this.facultyId = facultyId;
}
public String getFacultyOffice() {
	return facultyOffice;
}
public void setFacultyOffice(String facultyOffice) {
	this.facultyOffice = facultyOffice;
}
public String getFacultySubject() {
	return facultySubject;
}
public void setFacultySubject(String facultySubject) {
	this.facultySubject = facultySubject;
}
public int getFacultySal() {
	return facultySal;
}
public void setFacultySal(int facultySal) {
	this.facultySal = facultySal;
}
public String facultyOffice;
 public String facultySubject;
 public int facultySal;

}
