package ua.com.foxminded.anagrams;

import java.util.Scanner;

public class ScannerTextFromConsole {

    public String scannertext() {
        Scanner inputphrase = new Scanner(System.in);
        System.out.println("Input phrase, use latin alphabet");
        String textfromconsole = inputphrase.nextLine();
        return textfromconsole;
    }
}
