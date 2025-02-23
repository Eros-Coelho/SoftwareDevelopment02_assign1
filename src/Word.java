/*
Student Name: Eros Lima Coelho
Student Number: 3151957
*/

public class Word {

    private char[] letters;

    public Word(char[] letters){

//        initialise to an empty array if no array is provided, initialise with the provided array otherwise
//        using a ternary operator to make it more efficient and readable
        this.letters = (letters == null) ? new char[0] : letters;
    }

    public boolean contains(char symbol){

//        if the letter is present in the array (word) return true, return false otherwise
        for (char letter : this.letters){
            if (letter == symbol){
                return true;
            }
        }
        return false;
    }

    public int length(){
//        return the length of the array
        return this.letters.length;
    }

    public char[] getLetters(){
//        return the array, ensuring it's never null
        return this.letters;
    }
}
