package c_odd_to_even;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Insert amount of number :");
        int number= scanner.nextInt();

        int numbers[] = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Insert "+(i+1)+" number: ");
            numbers[i]= scanner.nextInt();
        }

        System.out.println("Start array "+ Arrays.toString(numbers));

        for (int i = 0; i < number; i++) {
            if(numbers[i]%2!=0){
                numbers[i]*=2;
            }
        }

        System.out.println("Ending array "+ Arrays.toString(numbers));
    }

}
