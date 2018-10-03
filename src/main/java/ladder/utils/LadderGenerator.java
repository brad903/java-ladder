package ladder.utils;

import java.util.Random;
import static java.lang.Boolean.TRUE;
import static java.lang.Boolean.FALSE;

public class LadderGenerator {
    private static final int RANDOM_BOUND = 10;
    public static final int RANDOM_PASS = 5;

    private LadderGenerator() {}  // prevent making instance

    public static boolean isLadder(int val) {
        if(val >= RANDOM_PASS) {
            return TRUE;
        }
        return FALSE;
    }

    public static int getRandomVal() {
        Random random = new Random();
        return random.nextInt(RANDOM_BOUND);
    }
}
