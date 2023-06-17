package compare_string;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Compare String");
        System.out.println("Insert a word");
        String stringA = scanner.next().toLowerCase();
        System.out.println("Insert a word");
        String stringB = scanner.next().toLowerCase();
        System.out.println("Insert a word");
        String stringC = scanner.next().toLowerCase();

        int comparation=1;
        if(stringA.equals(stringB)){
            comparation++;
        }
        if(stringA.equals(stringC)){
            comparation++;
        } else if (stringB.equals(stringC)) {
            comparation++;
        }

        System.out.println("Equal string : "+comparation);
    }
}
