/*
Student Name: Eros Lima Coelho
Student Number: 3151957
*/

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WordTest {

    @Test
    void testContains(){

//        checks if the array (word) contains the letters specified
        Word word = new Word(new char[] {'a', 'b', 'c', 'd'});

        assertTrue(word.contains('a'));
        assertTrue(word.contains('b'));
        assertTrue(word.contains('c'));
        assertFalse(word.contains('e')); //returns false as "e" is the only letter in here not present in the original array
    }
    @Test
    void testLength(){

//        checks if the array is either 4, 1 or 0 in length
        Word word = new Word(new char[] {'a', 'b', 'c', 'd'});
        assertEquals(4, word.length());

        word = new Word(new char[] {'a'});
        assertEquals(1, word.length());

        word = new Word(new char[] {});
        assertEquals(0, word.length());
    }

    @Test
    void testNotNull(){

        Word word = new Word(new char[] {'a', 'b', 'c', 'd'});

//        makes sure it doesn't return null
        assertNotNull(word.getLetters());
    }
}
