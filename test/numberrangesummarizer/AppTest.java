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
}