package OopsConcepts;

import java.util.Scanner;

public class StudentLogic
{

	public void insert(StudentEx se[],Scanner sc)
	{
		
		
		for(int i=0;i<se.length;i++)
		{
			se[i]=new StudentEx();
			System.out.println("enter Student id:");
			se[i].setSid(sc.nextInt());
			System.out.println("enter Student name:");
			se[i].setSname(sc.next());
			System.out.println("enter Student Course:");
			se[i].setScourse(sc.next());
			System.out.println("enter Student City");
			se[i].setScity(sc.next());
			sc.nextLine();
			/*se[i]=new StudentEx(); pass the paramaeters through constuctor*/
		}
	
	}
		public void display(StudentEx [] se)
		{   
			System.out.println("SID ID \t   S NAME\t   S COURSE \t S CITY");
			System.out.println("======================================================");
			for(int i=0;i<se.length;i++)
			{
			
			System.out.println(se[i].getSid()+"\t"+se[i].getSname()+"\t"+se[i].getScourse()+"\t"+se[i].getScity());
		
			}
		}
		public void search(StudentEx [] se,Scanner sc)
		{
			
			boolean check=false;
			System.out.println("check the student id whether is exist or not \n enter the stid  :");
			int s=sc.nextInt();
			for(int i=0;i<se.length;i++)
			{
				if(s==se[i].getSid())
			{
				System.out.println("student id is exist" + se[i].getSid());
				check=true;
				break;
			}	
			
			}
				if(!check)
				{
					System.out.println("student id does not  exist" );
				}
		}
		
	public static void main(String[] args)
	
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no of Students");
		int x=sc.nextInt();
		StudentEx[] se=new StudentEx[x];
		
		StudentLogic sl= new StudentLogic();
		Scanner scr= new Scanner(System.in);
		int ch;
		do
		{
			System.out.println(" SELECT THE OPTIONS \n *********************************************************** \n "
					+ "1)insert student details \n 2)display the student details \n"
					+ " 3)check the stid \n ***********************************************************\n "
					+ "enter the number :");
		ch= scr.nextInt();
				
		switch(ch)
		{
		case 1: sl.insert(se,sc);
		break;
		case 2: sl.display(se);
		break;
		case 3:sl.search(se,sc);
		break;
		case 4:
		default:System.out.println("invalid option");
		break;
		}
		}
		while(ch!=4);
		scr.close();
		}
}