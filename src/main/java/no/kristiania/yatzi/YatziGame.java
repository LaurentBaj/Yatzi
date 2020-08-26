package no.kristiania.yatzi;

public class YatziGame {
    public int score(YatzyCategory category, int[] dice) {
        int result = 0;
        for (int die: dice) {
            if (die == 1) {
                result += 1;
            } else if (die == 2) {
                result += 2;
            }
        }
        return result;
    }
}
