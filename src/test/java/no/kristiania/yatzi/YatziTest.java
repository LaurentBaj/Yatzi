package no.kristiania.yatzi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatziTest {

    @Test
    void shouldScoreOnes() {
        assertEquals(4, new YatziGame().score(YatzyCategory.ONES, new int[] { 1, 1, 2, 1 }));
    }


}
