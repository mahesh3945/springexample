package inheritanceConcepts;

import java.util.Scanner;

public class InheritanceOverLoad
{
		public void insertion(InheritanceOverStudent[] ios,Scanner sc)
		{
			for(int i=0;i<ios.length;i++)
			{
				System.out.println("enter the student details" +"\n" + "==============================================================");
				System.out.println("enter the student id");
				int studentId=sc.nextInt();
				System.out.println("enter the student course");
				String studentCourse=sc.next();
				System.out.println("enter the student age");
				int studentAge =sc.nextInt();
				System.out.println("enter the student address");
				String studentAddress=sc.next();
				System.out.println("enter the person details"+"\n"+"==============================================================");
				System.out.println("enter the first name");
				String firstName=sc.next();
				System.out.println("enter the last name");
				String lastName=sc.next();
				System.out.println("enter the email id");
				String emailId=sc.next();
				System.out.println("enter the contact number");
				long contactNumber=sc.nextLong();
						
				ios[i]= new InheritanceOverStudent(studentId,studentCourse,studentAge,studentAddress,firstName,lastName,emailId,contactNumber);
				
		    }
		}
		public void display(InheritanceOverStudent[] ios)
		{
			System.out.println("S ID\t S COURSE\t S AGE\t S ADDRESS\t FIRSTNAME\t LASTNAME\t EMAILID\t CONTACTNUMBER\t");
			System.out.println("=======================================================================================================");
			for(int i=0;i<ios.length;i++)
			{
			System.out.println(ios[i].getStudentId()+"\t"+ios[i].getStudentCourse()+"\t"
			+ios[i].getStudentAge()+"\t"+ios[i].getStudentAddress()+"\t"
			+ios[i].getFirstName()+"\t"+ios[i].getLastName()+"\t"
			+ios[i].getEmailId()+"\t"+ios[i].getContactNumber());
			}
		}
	
		public void search(InheritanceOverStudent[] ios,Scanner sc)
		{
			boolean check=false;
			System.out.println("check the product id whether is exist or not \n enter the stid  :");
			int s=sc.nextInt();
			for(int i=0;i<ios.length;i++)
			{
				if(s==ios[i].getStudentId())
			{
				System.out.println("Product id is exist" + ios[i].getStudentId());
				check=true;
				break;
			}	
			
			}
				if(!check) 
				{
					System.out.println("product id does not  exist" );
				}
		}
		
		//method overloading
		public void findProduct( InheritanceOverStudent[] ios,Scanner sc,int studentId)
		{
			boolean check=false;
			/*
			System.out.println("check the product id whether is exist or not \n enter the stid  :");
			int s=sc.nextInt();*/
			for(int i=0;i<ios.length;i++)
			{
				if(studentId==ios[i].getStudentId())
			{
				System.out.println("Product id is exist  :" + ios[i].getStudentId());
				check=true;
				break;
			}	
			
			}
				if(!check) 
				{
					System.out.println("product id does not  exist" );
				}
		} 
		public void findProduct(InheritanceOverStudent[] ios,Scanner sc,String lastName)
		{
			boolean check=false;
		/*System.out.println("check the product name whether is exist or not \n enter the stid  :");
			 String s=sc.next();*/
			for(int i=0;i<ios.length;i++)
			{
		     	if(lastName.equals(ios[i].lastName))
			{
				System.out.println("Product name is exist  :" + ios[i].lastName);
				check=true;
				break;
			}	
			
			}
				if(!check)
				{
					System.out.println("product name does not  exist" );
				}
		}
		
		public static void main(String[] args)
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("enter the number of students");
			int x=sc.nextInt();
			InheritanceOverStudent[] ios=new InheritanceOverStudent[x];
			InheritanceOverLoad iol=new InheritanceOverLoad(); 
			
			
		 Scanner scr= new Scanner(System.in);
		 int ch;
			do
			{
				System.out.println(" SELECT THE OPTIONS \n *********************************************************** \n "
						+ "1)insert product details \n 2)display the product details \n"+ ""
						+  "3)check the product id \n"
						+  "4)check the student id \n"
						+  "5)check the last name\n"
						+ " ***********************************************************\n "
						+ "enter the number :");
			ch= scr.nextInt();
					
			switch(ch)
			{
			case 1: iol.insertion(ios, scr);
			break;
			case 2: iol.display(ios);
			break;
			case 3:iol.search(ios, scr);
			break;
			case 4:
			System.out.println("enter Student id to search");
			int studentId=sc.nextInt();
			iol.findProduct(ios, scr, studentId);
			break;
			case 5:
			System.out.println("enter last name to search");
			String lastName=sc.next();
			iol.findProduct(ios, scr, lastName);
			break;
			case 6:
			break;
			default:System.out.println("invalid option");
			break;
			}
		}
			while(ch!=6);
			scr.close();
			
				
		}	
		}



/*
StudentDetails studentdetails=new StudentDetails();
System.out.println(studentdetails.getContactNumber()+"\t"+ studentdetails.getStudentAddress()+"\t"+ studentdetails.getStudentAge());
*/
