package inheritanceConcepts;

import java.util.Scanner;

public class MultiMainclass
{
 public void insertion(MultiResult[] mr,Scanner scr)
 {
	for(int i=0;i<mr.length;i++)
	{
	  System.out.println("enter the details:"+"\n" + "====================================");
	  mr[i]=new MultiResult();
	  System.out.println("enter the student name:");
	  mr[i].setStudentName(scr.next());
	  System.out.println("enter the roll no:");
	  mr[i].setStudentNo(scr.nextInt());
	  System.out.println("enter the exam name:");
	  mr[i].setTestName(scr.next());
	  System.out.println("enter the subje one marks:");
	  mr[i].setSubjOne(scr.nextInt());
	  System.out.println("ente the subject two marks:");
	  mr[i].setSubjTwo(scr.nextInt());
	}
 }
	public void display(MultiResult[] mr)
	{
		System.out.println("SNAME \tSROLLNO\t  TESTNAMES    SUBONE\tS SUBTWO " );
		System.out.println("=======================================================");
	for (int i=0;i<mr.length;i++)
	{
		System.out.println(mr[i].getStudentName()+"\t"+mr[i].getStudentNo()+"\t"+"\t"+mr[i].getTestName()+"t"+"\t"+mr[i].getSubjOne()+"\t"+"\t"+ mr[i].getSubjTwo());
	}
	}
	public void result(MultiResult[] mr)
	{
		
	}
 
	public static void main(String[] args) 
	{
		
		Scanner scr= new Scanner(System.in);
		System.out.println("enter the values");
		int x=scr.nextInt();
		MultiResult[] mr=new MultiResult[x];
		MultiMainclass mmc=new MultiMainclass();
		Scanner sc= new Scanner(System.in);
		int ch;
		do
		{
			System.out.println(" SELECT THE OPTIONS \n *********************************************************** \n "
					+ "1)insert student and test and result details \n 2)display the student details \n"
					+" ***********************************************************\n "
					+ "enter the number :");
		ch= sc.nextInt();
				
		switch(ch)
		{
		case 1:mmc.insertion(mr, scr);
		break;
		case 2:mmc.display(mr);
		break;
		case 3:
		default:System.out.println("invalid option");
		break;
		}
		}
		while(ch!=3);
		scr.close();
		}
}
