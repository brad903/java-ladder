package ladder.utils;

import java.util.Random;

public class GetRandomVal {
    public static final int RANDOM_BOUND = 10;

    private GetRandomVal() {}  // prevent making instance

    public static int getRandomVal() {
        Random random = new Random();
        return random.nextInt(RANDOM_BOUND);
    }
}
