/*
Student Name: Eros Lima Coelho
Student Number: 3151957
*/

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WordTest {

    @Test
    void testContains(){

        Word word = new Word(new char[] {'a', 'b', 'c', 'd'});

        assertTrue(word.contains('a'));
        assertTrue(word.contains('b'));
        assertTrue(word.contains('c'));
        assertTrue(word.contains('d'));
    }
    @Test
    void testLength(){

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

        assertNotNull(word.getLetters());
    }
}
