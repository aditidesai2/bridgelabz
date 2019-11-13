import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
public class Gambler {

   public static void main (String args[])

{  
        int wc=0;
	int lc=0;
	int wp=0;
        int lp=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter goal and Number of times:");
    
    int goal=sc.nextInt();
       int N=sc.nextInt();

    for (int i=0;i<N;i++)
     {
	
       System.out.println("Enter Stake:");       
	int stake=sc.nextInt();
       
       double w=Math.random();
	
       if(w<0.5)
	{    

	  
          System.out.println("The gambler has won");
           wc=wc+1;
	}
	else
	{
 	  
 	  System.out.println("The gambler has lost");
	  lc=lc+1;
		}
	}
        wp=(wc*100)/N;
	lp=(lc*100)/N;
    System.out.println("Wins: "+wc+"Losses: "+lc);
   
    System.out.println("win%: "+wp+"Loss%: "+lp);
}
}
 
    
