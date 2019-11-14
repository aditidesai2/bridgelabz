package bridgelabz_noor.bridgelabz_aditi;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class coin {
	
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of times coin needs to be flipped:");
		int n=sc.nextInt();
		int headcount, tailcount;
		float tailper, headper;
		 headper=0;
		 tailper=0;
		
		headcount=0;
		tailcount=0;
		if (n>0)
		{
		  for (int i=1;i<=n;i++)
		   {
		
			
			  double n1;
			 n1=Math.random();
			 if (n1<0.5)
			  {
				
			
				 System.out.println("Heads"); 
				 headcount=headcount+1;
				}
			 
				
				else   {
					
				
					System.out.println("Tails");
					tailcount=tailcount+1;
				}
			 
			
		     }
		 
		}
			
		else
		{
			System.out.println("Invalid input");
		}
		 headper=(headcount/n)*100;
			tailper=(tailcount/n)*100;
			System.out.print("PErcentage of headcount %f"+headper);
			System.out.print("Percentage of tailcount %f"+tailper);
			
			
				
			}
		}
	

