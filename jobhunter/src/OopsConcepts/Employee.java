package OopsConcepts;

public class Employee
{

	public Employee(int eid,String ename,int esal,String edisg)
	{
		this.eid= eid;
		this.ename=ename;
		this.esal=esal;
		this.edisg=edisg;
		
	}
	private int eid;
	private String ename;
	private int esal;
	private String edisg;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}
	public String getEdisg() {
		return edisg;
	}
	public void setEdisg(String edisg) {
		this.edisg = edisg;
	}

	
}
