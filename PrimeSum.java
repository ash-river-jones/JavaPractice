import java.util.Scanner;

public class PrimeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean found = false;

        for (int i = 2; i <= num/2; i++) {
            if (isPrime(i)) {
                int diff = num - i;
                if (isPrime(diff)) {
                    System.out.println(num + " is the sum of " + i + " and " + diff);
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println(num + " is not the sum of two prime numbers.");
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
