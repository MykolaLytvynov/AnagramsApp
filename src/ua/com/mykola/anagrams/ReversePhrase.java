package ua.com.mykola.anagrams;

public class ReversePhrase {
    public static String reverseletters;

    public static void Reverse() {
        String[] wordsinphrase = ScannerTextFromConsole.textfromconsole.split(" ");
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
            reverseletters = String.valueOf(lettersinwords);
            System.out.println(reverseletters);
        }
    }
}
