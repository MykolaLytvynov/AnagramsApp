package ua.com.foxminded.anagrams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversePhraseTest {

    ReversePhrase startvaluesforreverse;
    @BeforeEach
    public void newobjectforreverse() {
        startvaluesforreverse = new ReversePhrase();
    }

    @Test
    @DisplayName("When Entering Null")
    public void reverseShouldNotGiveErrorWhenEnteringNull(){
        assertNotNull(startvaluesforreverse.reverse(null));
    }


    @Test
    @DisplayName("Empty string")
    public void reverseNotShouldReturnEmptyStringWhenInputIsEmptyString(){
        assertNotEquals( "", startvaluesforreverse.reverse(""));
    }

    @Test
    @DisplayName("Just Space")
    public void reverseNotShouldReturnSpaceWhenInputIsJustSpace() {
        assertNotEquals( " ", startvaluesforreverse.reverse(" "));
    }

    @Test
    @DisplayName("Multi-space")
    public void reverseNotShouldReturnSpacesWhenInputIsJustSpaces(){
        assertNotEquals( "    ", startvaluesforreverse.reverse("    "));
    }


    @Test
    @DisplayName("One letter")
    public void reverseShouldReturnOneLetterWhenInputIsOneLetter(){
        assertEquals( "b", startvaluesforreverse.reverse("b"));
    }

    @Test
    @DisplayName("Several identical letters")
    public void reverseShouldReturnSeveralIdenticalLettersWhenEnterSeveralIdenticalLetters(){
        assertEquals( "bbbbbbbbb", startvaluesforreverse.reverse("bbbbbbbbb"));
    }

    @Test
    @DisplayName("Word of only lowercase letters")
    public void reverseShouldReturnReverseLowercaseLettersWhenInputIsOnlyLowercaseLetters(){
        assertEquals( "dcba", startvaluesforreverse.reverse("abcd"));
    }

    @Test
    @DisplayName("Word of only large letters")
    public void reverseShouldReturnReverseLargeLettersWhenInputIsOnlyLargeLetters(){
        assertEquals( "EDCBA", startvaluesforreverse.reverse("ABCDE"));
    }

    @Test
    @DisplayName("Word in different case")
    public void reverseReturnReverseWordInDifferentCaseWhenInputIsWordInDifferentCase(){
        assertEquals( "EDcbA", startvaluesforreverse.reverse("AbcDE"));
    }

    @Test
    @DisplayName("1 letter word in different case")
    public void reverseReturnReverse1LetterWordInDifferentCaseWhenInputIs1LetterWordInDifferentCase(){
        assertEquals( "QqqqQq", startvaluesforreverse.reverse("qQqqqQ"));
    }


    @Test
    @DisplayName("Any Symbols, Only Non Letters")
    public void reverseShouldNotReverseAnySymbolWhenInputContainsOnlyNonLetters(){
        assertEquals( "%^&*(%^", startvaluesforreverse.reverse("%^&*(%^"));
    }

    @Test
    @DisplayName("Symbols and Letters")
    public void reverseShouldReverseOnlyLettersNoSymbolsWhenInputIsSymbolsAndLetters(){
        assertEquals( "bm2&ba4", startvaluesforreverse.reverse("ab2&mb4"));
    }


    @Test
    @DisplayName("Few words")
    public void reverseShouldReverseFewWordsOrderOfWordsMustRemainWhenInputIsFewWords() {
        assertEquals("d1cba hgf!e",startvaluesforreverse.reverse("a1bcd efg!h"));
    }
}
