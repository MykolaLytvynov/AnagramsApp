package ua.com.foxminded.anagrams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ua.com.foxminded.anagrams.ReversePhrase;

import static org.junit.jupiter.api.Assertions.*;

class ReversePhraseTest {

    ReversePhrase startvaluesforreverse;

    @BeforeEach
    public void newobjectforreverse() {
        startvaluesforreverse = new ReversePhrase();
    }

    @Test
    @DisplayName("When Entering Null")
    void reverseShouldNotGiveErrorWhenEnteringNull() {
        assertNotNull(startvaluesforreverse.reverse(null));
    }


    @Test
    @DisplayName("Empty string")
    void reverseNotShouldReturnEmptyStringWhenInputIsEmptyString() {
        assertNotEquals("", startvaluesforreverse.reverse(""));
    }

    @Test
    @DisplayName("Just Space")
    void reverseNotShouldReturnSpaceWhenInputIsJustSpace() {
        assertNotEquals(" ", startvaluesforreverse.reverse(" "));
    }

    @Test
    @DisplayName("Multi-space")
    void reverseNotShouldReturnSpacesWhenInputIsJustSpaces() {
        assertNotEquals("    ", startvaluesforreverse.reverse("    "));
    }


    @Test
    @DisplayName("One letter")
    void reverseShouldReturnOneLetterWhenInputIsOneLetter() {
        assertEquals("b", startvaluesforreverse.reverse("b"));
    }

    @Test
    @DisplayName("Several identical letters")
    void reverseShouldReturnSeveralIdenticalLettersWhenEnterSeveralIdenticalLetters() {
        assertEquals("bbbbbbbbb", startvaluesforreverse.reverse("bbbbbbbbb"));
    }

    @Test
    @DisplayName("Word of only lowercase letters")
    void reverseShouldReturnReverseLowercaseLettersWhenInputIsOnlyLowercaseLetters() {
        assertEquals("dcba", startvaluesforreverse.reverse("abcd"));
    }

    @Test
    @DisplayName("Word of only large letters")
    void reverseShouldReturnReverseLargeLettersWhenInputIsOnlyLargeLetters() {
        assertEquals("EDCBA", startvaluesforreverse.reverse("ABCDE"));
    }

    @Test
    @DisplayName("Word in different case")
    void reverseReturnReverseWordInDifferentCaseWhenInputIsWordInDifferentCase() {
        assertEquals("EDcbA", startvaluesforreverse.reverse("AbcDE"));
    }

    @Test
    @DisplayName("1 letter word in different case")
    void reverseReturnReverse1LetterWordInDifferentCaseWhenInputIs1LetterWordInDifferentCase() {
        assertEquals("QqqqQq", startvaluesforreverse.reverse("qQqqqQ"));
    }


    @Test
    @DisplayName("Any Symbols, Only Non Letters")
    void reverseShouldNotReverseAnySymbolWhenInputContainsOnlyNonLetters() {
        assertEquals("%^&*(%^", startvaluesforreverse.reverse("%^&*(%^"));
    }

    @Test
    @DisplayName("Symbols and Letters")
    void reverseShouldReverseOnlyLettersNoSymbolsWhenInputIsSymbolsAndLetters() {
        assertEquals("bm2&ba4", startvaluesforreverse.reverse("ab2&mb4"));
    }


    @Test
    @DisplayName("Few words")
    void reverseShouldReverseFewWordsOrderOfWordsMustRemainWhenInputIsFewWords() {
        assertEquals("d1cba hgf!e", startvaluesforreverse.reverse("a1bcd efg!h"));
    }
}
