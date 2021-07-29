 package OopsConcepts;
public class Oops 
{
    static int count;
    int eid;
    void readDetails(int eid)
    {
    	this.eid=eid;
    }
    void dis()
    {
    	System.out.println("count="+count);
    	System.out.println("id="+eid);
    }	
	public static void main(String[] args) 
	{
		Oops oo=new Oops();
		oo.readDetails(20);
		oo.dis();
		/*System.out.println("count="+count);*/
		/*System.out.printl ++n("id="+ id);*/

	}

}
