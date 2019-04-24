package inheritanceConcepts;

public class PersonDetails 
{
	
	
	
		public PersonDetails()
		{
			 firstName="";
			 lastName="";
		    emailId="";
		    contactNumber=0l;
		    
			 
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