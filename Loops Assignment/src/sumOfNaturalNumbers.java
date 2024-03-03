//Write a Java program to calculate the sum of natural numbers up to a given positive integer 'n'.
public class sumOfNaturalNumbers {
    public static void main(String[] args) {
        int n = 10; // You can change this value to calculate the sum up to any positive integer

        System.out.println("The sum of natural numbers up to " + n + " is: " + sum(n));
    }

    public static int sum(int n) {
        int sum = 0;
        if (n < 1) {
            System.out.println("Input must be a positive integer");
        }
        else {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
        }
        return sum;
    }
}
