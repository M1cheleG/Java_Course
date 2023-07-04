package a_count_vocals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a word");
        String phrase = scanner.next();

        int vocals = 0, consonants = 0;
        String checkVocal = "aeiou";
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) != ' ') {
                if (checkVocal.contains(String.valueOf(phrase.charAt(i)))) {
                    vocals++;
                } else {
                    consonants++;
                }
            }
        }


        System.out.println("N vocals :" + vocals);
        System.out.println("N consonants :" + consonants);


    }
}
