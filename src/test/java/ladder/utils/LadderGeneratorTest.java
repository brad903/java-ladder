package ladder.utils;

import org.junit.Test;

import static ladder.utils.LadderGenerator.*;
import static org.assertj.core.api.Assertions.assertThat;
import static java.lang.Boolean.TRUE;
import static java.lang.Boolean.FALSE;


public class LadderGeneratorTest {

    @Test
    public void 사다리값_체크() {
        int target = getRandomVal();
        if (target >= RANDOM_PASS) {
            assertThat(TRUE).isEqualTo(isLadder(target));
            return;
        }
        assertThat(FALSE).isEqualTo(isLadder(target));
    }
}