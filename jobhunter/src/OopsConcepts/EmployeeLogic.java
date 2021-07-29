package OopsConcepts;

import java.util.Scanner;

public class EmployeeLogic {

	public static void main(String[] args)
	{	
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no of employee");
		int x=sc.nextInt();
		int []a = new int[x];
		
		Employee[] em= new Employee[x];
		
		for(int i=0;i<em.length;i++)
		{
			/*em[i]=new Employee ();*/
			System.out.println("enter emp id:");
			em[i].setEid(sc.nextInt());
			System.out.println("enter emp name:");
			em[i].setEname(sc.next());
			System.out.println("enter emp sal:");
			em[i].setEsal(sc.nextInt());
			System.out.println("enter emp designation");
			em[i].setEdisg(sc.next());
			sc.nextLine();
		}
		/*em.setEdisg("software");
		em.setEid(1);
		em.setEname("mahesh");
		em.setEsal(50000);*/
		System.out.println("EMP ID \t   EMP NAME\t   EMP SAL \t EMP DESiG");
		System.out.println("*************************************************************");
		for(int i=0;i<x;i++)
		{
		System.out.println(em[i].getEid()+ "\t" +em[i].getEname() + "\t"+"\t" +em[i].getEsal()+"\t"+"\t"+em[i].getEdisg());
	
		
	}

}
} 