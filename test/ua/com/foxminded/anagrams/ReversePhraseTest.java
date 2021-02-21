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
    @DisplayName("correct string reverse")
    public void reversejustphrase() {
        assertEquals("d1cba hgf!e",startvaluesforreverse.reverse("a1bcd efg!h"));
    }

    @Test
    @DisplayName("exeption with null")
    public void exeptioninreversephrase(){
        assertNotNull(startvaluesforreverse.reverse(null));
    }

}