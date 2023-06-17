package replace_the_intruders;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Replace the intruder");
        System.out.println("Insert a word");
        String stringA = scanner.nextLine();
        System.out.println("Insert a word");
        String stringB = scanner.nextLine();
        System.out.println("Insert a phrase");
        String stringC = scanner.nextLine();


        String[] stringsC= stringC.split(" ");
        System.out.println(stringsC[0]+" "+stringsC[1].replace(stringA,stringB)+" "+stringsC[2]);
    }
}
