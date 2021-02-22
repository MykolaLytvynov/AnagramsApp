package ua.com.foxminded.anagrams;

public class ReversePhrase {

    public String reverse(String textforreverce) {
        String result = new String();
        if (textforreverce == null || textforreverce.trim().isEmpty()) {
            return result = "The String must not be empty!!!";
        }

        String[] wordsinphrase = textforreverce.split(" ");
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
            result += String.valueOf(lettersinwords);
            result += " ";
        }
        result = result.trim();
        return result;
    }

    }