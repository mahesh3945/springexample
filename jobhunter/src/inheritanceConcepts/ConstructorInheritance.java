package inheritanceConcepts;

import java.util.Scanner;

public class ConstructorInheritance
{
		public void insertion(ConstructorStudentEx[] constructorstudent,Scanner sc)
		{
			for(int i=0;i<constructorstudent.length;i++)
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
						
				constructorstudent[i]= new ConstructorStudentEx(studentId,studentCourse,studentAge,studentAddress,firstName,lastName,emailId,contactNumber);
				
		    }
		}
		public void display(ConstructorStudentEx[] constructorstudent)
		{
			System.out.println("S ID\t S COURSE\t S AGE\t S ADDRESS\t FIRSTNAME\t LASTNAME\t EMAILID\t CONTACTNUMBER\t");
			System.out.println("=======================================================================================================");
			for(int i=0;i<constructorstudent.length;i++)
			{
			System.out.println(constructorstudent[i].getStudentId()+"\t"+constructorstudent[i].getStudentCourse()+"\t"
			+constructorstudent[i].getStudentAge()+"\t"+constructorstudent[i].getStudentAddress()+"\t"
			+constructorstudent[i].getFirstName()+"\t"+constructorstudent[i].getLastName()+"\t"
			+constructorstudent[i].getEmailId()+"\t"+constructorstudent[i].getContactNumber());
			}
		}
		public void search(ConstructorStudentEx[] constructorstudent,Scanner sc)
		{
			boolean check=false;
			System.out.println("check the product id whether is exist or not \n enter the stid  :");
			int s=sc.nextInt();
			for(int i=0;i<constructorstudent.length;i++)
			{
				if(s==constructorstudent[i].getStudentId())
			{
				System.out.println("Product id is exist" + constructorstudent[i].getStudentId());
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
		/*
		public void FindProduct(ConstructorPersonEx[] constructorpersonex,Scanner sc)
		{
			boolean check=false;
			System.out.println("check the product id whether is exist or not \n enter the stid  :");
			int s=sc.nextInt();
			for(int i=0;i<constructorpersonex.length;i++)
			{
				if(s==constructorpersonex[i].getStudentId())
			{
				System.out.println("Product id is exist" + constructorpersonex[i].getStudentId());
				check=true;
				break;
			}	
			
			}
				if(!check) 
				{
					System.out.println("product id does not  exist" );
				}
		}*/
		
		/*
		public void FindProduct(ConstructorEx[] ce,Scanner sc,String productName)
		{
			boolean check=false;
		System.out.println("check the product name whether is exist or not \n enter the stid  :");
			 String s=sc.next();
			for(int i=0;i<ce.length;i++)
			{
				if(productName.equals(ce[i].getProductName()))
			{
				System.out.println("Product name is exist" + ce[i].getProductName());
				check=true;
				break;
			}	
			
			}
				if(!check)
				{
					System.out.println("product name does not  exist" );
				}
		}*/
		
		public static void main(String[] args)
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("enter the number of students");
			int x=sc.nextInt();
			 ConstructorStudentEx[] constructorstudent = new ConstructorStudentEx[x];
			 ConstructorInheritance constructorinheritance =new ConstructorInheritance();
			
			
		 Scanner scr= new Scanner(System.in);
		 int ch;
			do
			{
				System.out.println(" SELECT THE OPTIONS \n *********************************************************** \n "
						+ "1)insert product details \n 2)display the product details \n"+ ""
						+  "3)check the product id \n"
						+  "4)check the product id \n"
						+  "5)check the product name\n"
						+ " ***********************************************************\n "
						+ "enter the number :");
			ch= scr.nextInt();
					
			switch(ch)
			{
			case 1: constructorinheritance.insertion(constructorstudent, scr);
			break;
			case 2: constructorinheritance.display(constructorstudent);
			break;
			case 3: constructorinheritance.search(constructorstudent, scr);
			break;
			case 4:
			/*
			System.out.println("enter product id to search");
			int productId=sc.nextInt();
			cle.FindProduct(ce, scr, productId);
			break;
			case 5:
			System.out.println("enter product name to search");
			String productName=sc.next();
			cle.FindProduct(ce, scr, productName);
			break;
			case 6:
			break;*/
			default:System.out.println("invalid option");
			break;
			}
			}
			while(ch!=4);
			scr.close();
			}	
		}



/*
StudentDetails studentdetails=new StudentDetails();
System.out.println(studentdetails.getContactNumber()+"\t"+ studentdetails.getStudentAddress()+"\t"+ studentdetails.getStudentAge());
*/
