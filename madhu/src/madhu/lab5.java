/*
 * Name:madhavi kothapeta
 * Id no: 161010522
 * Class Session: monday
 */
package madhu;

import java.util.Scanner;

public class lab5 {

	public static void main(String[] args) 
	{
		System.out.print("Enter number of students:.... ");
		    Scanner input = new Scanner(System.in);        
		         int k = input.nextInt();
		        String[] Sname = new String[k];
		        String[] Sid = new String[k];
		        float[] Sscore = new float[k];
		        float maxValue;
		       float average=0;
		       float num1=0;
		       float num=0,score2=0,second;
		       maxValue=second=Integer.MAX_VALUE;
		        for(int i = 0; i < k; i++) {
		            System.out.print("Enter the student's Id...name...score ");
		             Sid[i]=input.next();
		             Sname[i]= input.next();
		             Sscore[i] = input.nextFloat();
		        }
		        for(int i = 0; i < k; i++) {
		        	
		        	average=average+Sscore[i];
		        	if(Sscore[i]>num1){
		        		num=Sscore[i];
		        		score2=num1;
		        		num1=Sscore[i];
		        	}
		        }
		             for (int i = 0; i <k  ; i ++)
		                {
		                    if (Sscore[i] < maxValue)
		                    {
		                        second = maxValue;
		                        maxValue = Sscore[i];
		                    }
		                    else if (Sscore[i] < second && Sscore[i] != maxValue)
		                        second = Sscore[i];
		                }
		         float avgs=average/k;
		        System.out.println("The average score is:"+avgs);
		        for(int i = 0; i < k; i++) {
		        	
		        	if(Sscore[i]==num){
		        		System.out.println("Student with highest score:"+Sid[i]+"  "+Sname[i]+"  " +Sscore[i]);
		             	}
		        }
		        for(int i = 0; i < k; i++) {
		        		if(Sscore[i]==score2){
		            		System.out.println("Student with second highest score:"+Sid[i]+"  "+Sname[i]+"  " +Sscore[i]);
		        		}
		        }
		        for(int i = 0; i < k; i++) {
		        		if(Sscore[i]==maxValue){
		                		System.out.println("Student with lowest score:"+Sid[i]+"  "+Sname[i]+"  " +Sscore[i]);
		            		}
		        }
		       for(int i = 0; i < k; i++) {
		        		if(Sscore[i]==second){
		                		System.out.println("Student with second lowest score:"+Sid[i] +"  "+Sname[i]+"  " +Sscore[i]);	
		                		}
		        }
		        System.out.println("students with above the average scores are:");
		        for(int i=0;i<k;i++) {
		        	if(Sscore[i]>avgs){
		        		System.out.println(Sid[i] +"  "+Sname[i]+"  " +Sscore[i]);
				}
		        }
		    }

		}




