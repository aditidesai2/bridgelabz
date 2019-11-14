package bridgelabz_noor.bridgelabz_aditi;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class primefactors {

public static void main (String[] args)
{
	System.out.println("Enter number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	primefactors(n);
}
public static void primefactors(int n) {
	while(n%2==0)	
	{
		System.out.println(2+" ");
		n=n/2;
	}
	for (int i=3;i*i<=n;i=i+2)
	{
		while (n%i==0)
		{
			System.out.println(i+" ");
			n=n/i;
			
		}
	}
	if(n>2)
		System.out.println(n);
}
}
	
