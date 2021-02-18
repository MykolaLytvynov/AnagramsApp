package ua.com.mykola.anagrams;

import java.util.Scanner;

public class ScannerTextFromConsole {
    public static String textfromconsole;

    public static void Scannertext() {
        Scanner inputphrase = new Scanner (System.in);
        System.out.println("Input phrase, use latin alphabet");
        textfromconsole = inputphrase.nextLine();
    }
}
