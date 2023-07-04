package e_fibonacci;

import java.util.Scanner;

public class Recorsive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("N fibonacci number:");
        int number= scanner.nextInt();
        System.out.println("The number is: "+fibonacci(number));
    }

    private static int fibonacci(int number) {
        if (number <= 1) {
            return number;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

}
