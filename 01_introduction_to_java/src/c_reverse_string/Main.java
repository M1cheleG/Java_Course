package c_reverse_string;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Reverse string");
        System.out.println("Insert a phrase");
        String string = scanner.nextLine();

        String[] strings= string.split(" ");
        System.out.println("The reverse string is : "+strings[1]+" "+strings[0]);
    }
}
