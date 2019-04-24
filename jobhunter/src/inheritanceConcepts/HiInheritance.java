package inheritanceConcepts;

import java.util.Scanner;

public class HiInheritance 
{
	public void studentValues(HiStudent[] histudent,Scanner sc)
	{
		for(int i=0;i<histudent.length;i++)
		{
			System.out.println("enter the student Details"+"\n"+"=======================================================");
			 histudent[i]=new HiStudent();
			 System.out.println("enter the student Id :");
			 histudent[i].setStudentId(sc.nextInt());
			 System.out.println("enter the student course :");
			 histudent[i].setStudentCourse(sc.next());
			 System.out.println("enter the student age :");
			 histudent[i].setStudentAge(sc.nextInt());
			 System.out.println("enter the student address :");
			 histudent[i].setStudentAddress(sc.next());
			 System.out.println("enter the person details"+"\n"+"===========================================================");
			 
			 System.out.println("enter the first name :");
			 histudent[i].setFirstName(sc.next());
			 System.out.println("enter the last name :");
			 histudent[i].setLastName(sc.next());
			 System.out.println("enter the email id :");
			 histudent[i].setEmailId(sc.next());
			 System.out.println("enter the contact number :");
			 histudent[i].setContactNumber(sc.nextLong());
			 }
		}
	public void studentDisplay(HiStudent[] histudent)
	{
		System.out.println("S ID \tS AGE\t S COURSE \tS ADDRESS \tFIRSTNAME \tLASTNAME\tEMAIL ID\tCONTACT NUMBER" );
		System.out.println("============================================================================================================================");
		for(int i=0;i<histudent.length;i++)
		{
		System.out.print(histudent[i].getStudentId()+"\t"+ histudent[i].getStudentAge()+"\t"+histudent[i].getStudentCourse()+"\t"+"\t"+histudent[i].getStudentAddress() +"\t"+"\t"  );
		System.out.println(histudent[i].getFirstName()+"\t"+"\t"+histudent[i].getLastName()+"\t"+"\t"+histudent[i].getEmailId()+"\t"+"\t"+histudent[i].getContactNumber());
		}	
	}
	public void facultyValues(HiFaculty[] hifaculty,Scanner sc)
	{
		for(int i=0;i<hifaculty.length;i++)
		{
		
		System.out.println("enter the faculty Details"+"\n"+"=======================================================");
		 hifaculty[i]=new HiFaculty();
		 System.out.println("enter the Faculty Id :");
		 hifaculty[i].setFacultyId(sc.nextInt());
		 System.out.println("enter the faculty Office :");
		 hifaculty[i].setFacultyOffice(sc.next());
		 System.out.println("enter the faculty Age :");
		 hifaculty[i].setFacultySubject(sc.next());
		 System.out.println("enter the faculty sal :");
		 hifaculty[i].setFacultySal(sc.nextInt());
		 System.out.println("enter the person details"+"\n"+"===========================================================");
		 
		 System.out.println("enter the first name :");
		 hifaculty[i].setFirstName(sc.next());
		 System.out.println("enter the last name :");
		 hifaculty[i].setLastName(sc.next());
		 System.out.println("enter the email id :");
		 hifaculty[i].setEmailId(sc.next());
		 System.out.println("enter the contact number :");
		 hifaculty[i].setContactNumber(sc.nextLong());
		
	}
	}
	public void facultyDisplay(HiFaculty[] hifaculty)
	{
		System.out.println("F ID \tF OFFICE\tF SUBJECT \tF SAL\tFIRSTNAME \tLASTNAME\tEMAIL ID\tCONTACT NUMBER" );
		System.out.println("============================================================================================================================");
		for(int i=0;i<hifaculty.length;i++)
		{
		System.out.print(hifaculty[i].getFacultyId()+"\t"+ hifaculty[i].getFacultyOffice()+"\t"+hifaculty[i].getFacultySubject()+"\t"+"\t"+hifaculty[i].getFacultySal() +"\t"+"\t"  );
		System.out.println(hifaculty[i].getFirstName()+"\t"+"\t"+hifaculty[i].getLastName()+"\t"+"\t"+hifaculty[i].getEmailId()+"\t"+"\t"+hifaculty[i].getContactNumber());
		}
	}
	public void search(HiStudent[] histudent,Scanner sc)
	{
		boolean check=false;
		System.out.println("check the student id whether is exist or not \n enter the stid  :");
		int s=sc.nextInt();
		for(int i=0;i<histudent.length;i++)
		{
			if(s==histudent[i].getStudentId())
		{
			System.out.println("student id is exist" + histudent[i].getStudentId());
			check=true;
			break;
		}	
		
		}
			if(!check) 
			{
				System.out.println("product id does not  exist" );
			}
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the nof students");
		int x=sc.nextInt();
		System.out.println("enter the nof faculty");
		int y=sc.nextInt();
		HiStudent[] histudent = new HiStudent[x];
		HiFaculty[] hifaculty = new HiFaculty[y];
		
		HiInheritance hiinheritance= new HiInheritance();
		 Scanner scr= new Scanner(System.in);
		 int ch;
			do
			{
				System.out.println(" SELECT THE OPTIONS \n *********************************************************** \n "
						+ "1)insert student details \n"
						+  "2)display the student details \n"+ ""
						+  "3)insert the faculty details \n"
						+  "4)display the faculty details \n"
					    +  "5)check the student id\n"
						+ " ***********************************************************\n "
						+ "enter the number :");
			ch= scr.nextInt();
					
			switch(ch)
			{
			case 1: hiinheritance.studentValues(histudent, scr);
			break;
			case 2: hiinheritance.studentDisplay(histudent);
			break;
			case 3: hiinheritance.facultyValues(hifaculty, scr);
			break;
			case 4: hiinheritance.facultyDisplay(hifaculty);
			break;
			case 5:hiinheritance.search(histudent, scr);
			break;
			case 6:
			break;
			default:System.out.println("invalid option");
			}
			}
			while(ch!=6);
			scr.close();
			}	
		}

	

