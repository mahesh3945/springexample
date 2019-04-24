package OopsConcepts;
public class Constucter 
{

	   private int sid;
	   
	   public Constucter() 
	   {
		   sid=0;
		   sname="";
		   scourse="";
		   scity="";
	   }
	   public Constucter(int sid,String sname,String scourse,String scity)
	   {
		   this.sid=sid;
		   this.sname=sname;
		   this.scourse=scourse;
		   this.scity=scity;
		   
	   }
	   
	   public int getSid() 
	   {
		return sid;
	}
	   
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getScourse() {
		return scourse;
	}
	public void setScourse(String scourse) {
		this.scourse = scourse;
	}
	public String getScity() {
		return scity;
	}
	public void setScity(String scity) {
		this.scity = scity;
	}
	private String sname;
	   private String scourse;
	   private String scity; 
	   
	}


