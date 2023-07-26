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
        boolean[] primeArray = new boolean[(int) (limit + 1)];
        Arrays.fill(primeArray, true);

        primeArray[0] = false;
        primeArray[1] = false;

        for (int number = 2; number * number <= limit; number++) {
            if (primeArray[number]) {
                for (int multiple = number * number; multiple <= limit; multiple += number) {
                	primeArray[multiple] = false;
                }
            }
        }
//To print the prime numbers from the array.
        for (int i = 2; i <= limit; i++) {
            if (primeArray[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
