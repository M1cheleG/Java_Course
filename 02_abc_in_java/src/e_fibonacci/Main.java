package e_fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("N fibonacci number:");
        int number= scanner.nextInt();

        int a=0,b=1,c;
        for (int i = 0; i < number; i++) {
            c=a+b;
            a=b;
            b=c;
        }

        System.out.println("the number is: "+a);
    }
}
