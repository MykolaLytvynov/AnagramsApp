package ua.com.mykola.anagrams;

import java.util.Scanner;

public class ScannerTextFromConsole {

    public String Scannertext() {
        Scanner inputphrase = new Scanner (System.in);
        System.out.println("Input phrase, use latin alphabet");
        String textfromconsole = inputphrase.nextLine();
        return textfromconsole;
    }
}
