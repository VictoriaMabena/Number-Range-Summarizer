package numberrangesummarizer;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Arrays;
import java.util.Collection;

//To conduct these tests I used known expected input to conduct the tests

public class SummarizerImplementationTest {

    private NumberRangeSummarizer summarizer = new SummarizerImplementation();

    // Test01: test to verify that the collect function works as expected, converts a string into integers without missing element in between.
    @Test
    public void stringConventionTest() {
        Collection<Integer> result = summarizer.collect(
                "1,3,6,7,8,12,13,14,15,21,22,23,24,31"
        );

        Collection<Integer> expected =
                Arrays.asList(1, 3, 6, 7, 8, 12, 13, 14, 15, 21, 22, 23, 24, 31);

        System.out.println("Collected input Expected: " + expected);
        System.out.println("Collected input Actual:   " + result);

        assertEquals(expected, result);
    }

    // Test02: test to verify the summariser function handles the values as expected, the ranges between the numbers are correct.
    @Test
    public void summarizerTest() {
        Collection<Integer> input = Arrays.asList(
                1, 3, 6, 7, 8, 12, 13, 14, 15, 21, 22, 23, 24, 31
        );

        String result = summarizer.summarizeCollection(input);
        String expected = "1, 3, 6-8, 12-15, 21-24, 31";

        System.out.println("Summarized collection Expected: " + expected);
        System.out.println("Summarized collection Actual:   " + result);

        assertEquals(expected, result);
    }
}