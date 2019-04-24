package onetoMany;


import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="OneToManyDepAnnotations")
public class DepartmentPojo
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int departmentId;
	public int getDepartmentId() {
		return departmentId;
	}
	
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentEmail() {
		return departmentEmail;
	}
	public void setDepartmentEmail(String departmentEmail) {
		this.departmentEmail = departmentEmail;
	}
	public Set getEmps() {
		return emps;
	}
	public void setEmps(Set emps) {
		this.emps = emps;
	}
	private String departmentName;
	private String departmentEmail;
	private Set emps;
	
}
