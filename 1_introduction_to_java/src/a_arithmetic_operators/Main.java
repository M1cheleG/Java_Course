
package a_arithmetic_operators;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Arithmetic operation");
        System.out.println("Insert a number");
        int number1 = scanner.nextInt();
        System.out.println("Insert a number");
        int number2 = scanner.nextInt();

        System.out.println("Addition : "+(number1+number2));
        System.out.println("Subtraction : "+(number1-number2));
        System.out.println("Multiplication : "+(number1*number2));
        System.out.println("Division : "+(number1/number2));


    }
}
