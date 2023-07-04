package d_multiplation_table;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Insert number: ");
        int n= scanner.nextInt();
        System.out.println("Insert a lenght: ");
        int m= scanner.nextInt();

        int array[] = new int[m];
        for (int i = 0; i < m; i++) {
            array[i]=n*i;
        }
        System.out.println("The multiplation table is: "+ Arrays.toString(array));
    }
}
