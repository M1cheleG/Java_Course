package f_anagrams;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a word :");
        String word = scanner.next();
        System.out.println("Insert a word :");
        String word2 = scanner.next();

        int check=0;
        if(word.length()==word2.length()){
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < word2.length(); j++) {
                if (word.charAt(i) == word2.charAt(j)) {
                    word = removeChar(word, i);
                    check++;
                    continue;
                }
            }
        }
        }

        // CHECK: System.out.println(check+" "+word+" "+word2);

        if(check==word.length()){
            System.out.println("Anagramma");
        }else{
            System.out.println("Not anagramma");
        }

    }

    private static String removeChar(String word,int index) {
        StringBuilder stringBuilder = new StringBuilder(word);
        stringBuilder.setCharAt(index,'$');
        return stringBuilder.toString();
    }
}
