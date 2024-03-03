//Write a Java program to generate and print the first 'n' terms of the Fibonacci series.
public class fibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // You can change this value to generate the first 'n' terms of the Fibonacci series

        System.out.println("The first " + n + " terms of the Fibonacci series are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static long fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer");
        }

        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
