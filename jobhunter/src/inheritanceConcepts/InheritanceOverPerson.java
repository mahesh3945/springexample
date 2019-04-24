package inheritanceConcepts;

public class InheritanceOverPerson
{
	public InheritanceOverPerson()
	{
		 firstName="";
		 lastName="";
		 emailId="";
		 contactNumber=0l;
	}
	public InheritanceOverPerson(String firstName,String lastName,String emailId,long contactNumber)
	{
		
		this.firstName=firstName;
		this.lastName=lastName;
		this.emailId=emailId;
		this.contactNumber= contactNumber;
		
	}

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
public String firstName;
public String lastName;
public String emailId;
public long contactNumber;
}
 