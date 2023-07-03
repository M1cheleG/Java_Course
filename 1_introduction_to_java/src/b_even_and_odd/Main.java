package b_even_and_odd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a number");
        int number= scanner.nextInt();

        if (((number % 2) == 0)) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
