//Write a Java program to print a multiplication table for a given number 'n'.
public class multiplicationTable {
    public static void main(String[] args) {
        int n = 2; // You can change this value to print the multiplication table for any number

        printMultiplicationTable(n);
    }

    public static void printMultiplicationTable(int n) {
        System.out.println("Multiplication Table for " + n
        +" is:");
        System.out.println("-----------------------------");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);
        }
    }
}
