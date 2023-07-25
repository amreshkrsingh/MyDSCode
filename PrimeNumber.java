//$Id$
import java.util.Arrays;

public class PrimeNumber {

	public static void main(String[] args) {
        long limit = 100; // Change this to the desired limit

        System.out.println("Prime numbers up to " + limit + ":");
        printPrimeNumbers(limit);
    }

	
	//To improve the efficiency of the program and avoid exceeding the time limit, we can implement the SIEVE OF ERATOSTHENES ALGORITHM. 
    private static void printPrimeNumbers(long limit) {
        boolean[] isPrime = new boolean[(int) (limit + 1)];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for (int number = 2; number * number <= limit; number++) {
            if (isPrime[number]) {
                for (int multiple = number * number; multiple <= limit; multiple += number) {
                    isPrime[multiple] = false;
                }
            }
        }

        for (int number = 2; number <= limit; number++) {
            if (isPrime[number]) {
                System.out.print(number + " ");
            }
        }

        System.out.println();
    }
}