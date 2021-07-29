package inheritanceConcepts;

import java.util.Scanner;

public class SingleInheritenceEx
{
	public void insert(StudentDetails[] studentdetails, Scanner sc)
	{
		
		for(int i=0;i<studentdetails.length;i++)
		{
			System.out.println("enter the student Details"+"\n"+"=======================================================");
			 studentdetails[i]=new StudentDetails();
			 System.out.println("enter the student Id :");
			 studentdetails[i].setStudentId(sc.nextInt());
			 System.out.println("enter the student course :");
			 studentdetails[i].setStudentCourse(sc.next());
			 System.out.println("enter the student age :");
			 studentdetails[i].setStudentAge(sc.nextInt());
			 System.out.println("enter the student address :");
			 studentdetails[i].setStudentAddress(sc.next());
			 System.out.println("enter the person details"+"\n"+"===========================================================");
			 
			 System.out.println("enter the first name :");
			 studentdetails[i].setFirstName(sc.next());
			 System.out.println("enter the last name :");
			 studentdetails[i].setLastName(sc.next());
			 System.out.println("enter the email id :");
			 studentdetails[i].setEmailId(sc.next());
			 System.out.println("enter the contact number :");
			 studentdetails[i].setContactNumber(sc.nextLong());
			 }
	}
	public void dispaly(StudentDetails[] studentdetails, Scanner sc)
	{
		System.out.println("S ID \tS AGE\t S COURSE \tS ADDRESS \tFIRSTNAME \tLASTNAME\tEMAIL ID\tCONTACT NUMBER" );
		System.out.println("============================================================================================================================");
		for(int i=0;i<studentdetails.length;i++)
		{
		System.out.print(studentdetails[i].getStudentId()+"\t"+ studentdetails[i].getStudentAge()+"\t"+studentdetails[i].getStudentCourse()+"\t"+"\t"+studentdetails[i].getStudentAddress() +"\t"+"\t"  );
		System.out.println(studentdetails[i].getFirstName()+"\t"+"\t"+studentdetails[i].getLastName()+"\t"+"\t"+studentdetails[i].getEmailId()+"\t"+"\t"+studentdetails[i].getContactNumber());
		}
	}
	public static void main(String[] args) 
	{		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of students :");
		int x=sc.nextInt();
		StudentDetails[] studentdetails = new StudentDetails[x];
		
		
		SingleInheritenceEx singleInheritenceEx=new SingleInheritenceEx();
		Scanner scr= new Scanner(System.in);
		int ch;
		do
		{
			System.out.println(" SELECT THE OPTIONS \n *********************************************************** \n "
					+ "1)insert student details \n 2)display the student details \n"
					+ " 3)check the stexitid \n ***********************************************************\n "
					+ "enter the number :");
		ch= scr.nextInt();
				
		switch(ch)
		{
		case 1:singleInheritenceEx.insert(studentdetails, scr);
		break;
		case 2:singleInheritenceEx.dispaly(studentdetails, scr);
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
	

