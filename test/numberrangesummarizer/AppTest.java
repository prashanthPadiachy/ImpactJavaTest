package numberrangesummarizer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testSampleInput() {
        App app = new App();

        String result = app.summarizeCollection(
                app.collect("1,3,6,7,8,12,13,14,15,21,22,23,24,31")
        );

        assertEquals(
                "1, 3, 6-8, 12-15, 21-24, 31",
                result
        );
    }

    @Test
    public void testEmptyInput() {
        App app = new App();

        String result = app.summarizeCollection(
                app.collect("")
        );

        assertEquals(
                "",
                result
        );
    }

    @Test
    public void testEmptyInput1() {
        App app = new App();

        String result = app.summarizeCollection(
                app.collect("  ")
        );

        assertEquals(
                "",
                result
        );
    }

    @Test
    public void testOnlyConsecutiveNums() {
        App app = new App();

        String result = app.summarizeCollection(
                app.collect("1, 2, 3, 4, 5, 6")
        );

        assertEquals(
                "1-6",
                result
        );
    }

    @Test
    public void testOnlyNonConsecutiveNums() {
        App app = new App();

        String result = app.summarizeCollection(
                app.collect("2, 4, 6, 9, 41")
        );

        assertEquals(
                "2, 4, 6, 9, 41",
                result
        );
    }

    @Test
    public void testMixedList() {
        App app = new App();

        String result = app.summarizeCollection(
                app.collect("2, 3, 4, 7, 12, 13, 40, 51, 52")
        );

        assertEquals(
                "2-4, 7, 12-13, 40, 51-52",
                result
        );
    }

    @Test
    public void testInputNoSpacing() {
        App app = new App();

        String result = app.summarizeCollection(
                app.collect("1,2,3,6,7,9,11")
        );

        assertEquals(
                "1-3, 6-7, 9, 11",
                result
        );
    }

    @Test
    public void testInputRandomSpacing() {
        App app = new App();

        String result = app.summarizeCollection(
                app.collect("  1, 2 ,3  ,6,7  , 9,11  ")
        );

        assertEquals(
                "1-3, 6-7, 9, 11",
                result
        );
    }
}