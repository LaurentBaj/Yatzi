package no.kristiania.yatzi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatziTest {

    private YatziGame yatziGame = new YatziGame();

    @Test
    void shouldScoreOnes() {
        yatziGame = new YatziGame();
        assertEquals(4, yatziGame.score(YatzyCategory.ONES, new int[] { 1, 1, 2, 1, 1 }));
        assertEquals(2, yatziGame.score(YatzyCategory.ONES, new int[] { 6, 5, 2, 1, 1 }));
    }

    @Test
    void shouldScoreTwo() {
        yatziGame = new YatziGame();
        assertEquals(4, yatziGame.score(YatzyCategory.ONES, new int[] { 1, 1, 2, 1, 1 }));
        assertEquals(2, yatziGame.score(YatzyCategory.ONES, new int[] { 6, 5, 2, 1, 1 }));
    }


}
