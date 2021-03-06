
/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Random;
import java.util.List;
import java.util.Arrays;

public class HangmanTest {
    List<String> myWords = Arrays.asList("cow", "silver", "phone", "core");
    Random myRandomGenerator = new Random();

    String word = myWords.get(myRandomGenerator.nextInt(myWords.size()));

    @Test
    public void findLetter_selectWord_string() {
        Hangman testHangman = new Hangman();
        String expected = word;
        myWords.contains(word);
        assertEquals(expected, testHangman.findLetter(word));
    }

    @Test

    public void findLetter_fillWithSpace() {
        Hangman testHangman = new Hangman();
        String expected = " ";
        assertEquals(expected, testHangman.findLetter(" "));
    }

    @Test
    public void findLetter_replaceLetterWithHyphen() {
        Hangman testHangman = new Hangman();
        String expected = "----";
        assertEquals(expected, testHangman.findLetter("home"));
    }

    @Test
    public void isCorrectlyGussed_guessIsCorrect() {
        Hangman testHangman = new Hangman();

    }
}
