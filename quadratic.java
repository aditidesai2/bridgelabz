package bridgelabz_noor.bridgelabz_aditi;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class quadratic{
	
	public static void main (String args[]) {
		System.out.println("Enter the values of a,b and c");
		Scanner sc=new Scanner(System.in);
		double a=sc.nextInt();
		double b=sc.nextInt();
		double c=sc.nextInt();
		//to calculate roots of the equation
		double det=b*b-4*a*c;
		double r1= (-b+Math.sqrt(det))/2*a;
		double r2= (-b-Math.sqrt(det))/2*a;
		System.out.println("root1 and root2="+r1+r2);
		
		
		
	}
	
}