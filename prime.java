package week2;
public class prime {

    public static void main(String[] args) {

            //define limit
            int limit = 100;

            System.out.println("Prime numbers between 1 and " + limit);

            //loop through the numbers one by one
            for(int i=100; i < 200; i++){

                    boolean isPrime = true;

                    //check to see if the number is prime
                    for(int j=2; j < i ; j++){

                            if(i % j == 0){
                                    isPrime = false;
                                    break;
                            }
                    }
                    // print the number
                    if(isPrime)
                            System.out.print(i + " ");
            }
    }
}