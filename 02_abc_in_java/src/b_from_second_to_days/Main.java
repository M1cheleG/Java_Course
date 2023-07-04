package b_from_second_to_days;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert time in second");
        int second = sc.nextInt();

        int day=0, hour=0, minute=0;
        day=second/(86400);
        second=second-(day*86400);
        hour=second/(60*60);
        second=second-(hour*60*60);
        minute=second/60;
        second=second-(minute*60);
        System.out.println("Day:"+day);
        System.out.println("Hour:"+hour);
        System.out.println("Minute:"+minute);
        System.out.println("Second"+second);
    }
}
