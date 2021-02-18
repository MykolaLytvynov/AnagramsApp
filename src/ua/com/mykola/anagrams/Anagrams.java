package ua.com.mykola.anagrams;

import java.util.Scanner;

public class Anagrams {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Input phrase, use latin alphabet");
        String inputphrase = scanner.nextLine();
        String[] wordsinphrase = inputphrase.split(" ");
        for (int i = 0; i < wordsinphrase.length; i++) {
            char[] lettersinwords = wordsinphrase[i].toCharArray();
            int start = 0;
            int end = lettersinwords.length-1;

            while (start <= end) {
                if (Character.isLetter(lettersinwords[start])) {
                    if (Character.isLetter(lettersinwords[end])) {
                        char temp = lettersinwords[start];
                        lettersinwords[start] = lettersinwords[end];
                        lettersinwords[end] = temp;
                        end--;
                        start++;
                    }
                    else end--;
                }
                else {lettersinwords[start] = lettersinwords[start];
                    start++;
                }
            }
            String reverse = String.valueOf(lettersinwords);
            System.out.println(reverse);
        }
    }
}
