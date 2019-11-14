package bridgelabz_noor.bridgelabz_aditi;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter year");
		String s=sc.nextLine();

		if(s.length()==4 ) {
			int n=Integer.parseInt(s);
		
			   if((n%4==0 && n%100!=0) || n%400==0)
                                
	    		System.out.println(n+" is a leap year");
                    	       else 
	   		 System.out.println(n+" is not a leap year");                       
	 }
		else {
			System.out.println(s+" is not a valid year");              
	}
	}
}