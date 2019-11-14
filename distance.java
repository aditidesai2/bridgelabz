package bridgelabz_noor.bridgelabz_aditi;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class distance{
	
	public static void main (String args[]) {
		System.out.println("Enter the values of x and y");
		Scanner sc=new Scanner(System.in);
		double a=sc.nextInt();
		double b=sc.nextInt();
		euclidean(a,b);
		
		
	}
	public static void euclidean(double x, double y) {
		double dist=Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
		System.out.println("Distance to origin"+dist);
		
	}
	
}