package ua.com.mykola.anagrams;

import java.util.Scanner;

public class Anagrams {

    public static void main(String[] args) {
        ScannerTextFromConsole textinconsole = new ScannerTextFromConsole();
        ReversePhrase phraseforreverse = new ReversePhrase();

        System.out.println(phraseforreverse.reverse(textinconsole.scannertext()));
    }
}