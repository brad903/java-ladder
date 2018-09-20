package ladder.domain;

import ladder.domain.Line;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LineTest {
    private static final int testCount = 5;
    Line lineTest = new Line(testCount);

    @Test
    public void 사다리_그릴지_판단() {
        lineTest.store();
        assertThat(lineTest.judgeEachLadder(2, 1)).isEqualTo(false);  // b/c randomVal is less than RANDOM_PASS
    }

    @Test
    public void 랜덤기준값_판단() {
        assertThat(lineTest.isBeyondVal(6)).isEqualTo(true);
        assertThat(lineTest.isBeyondVal(3)).isEqualTo(false);
    }

    @Test
    // if index is 0, must be true
    public void 인덱스_0일때_앞값판단() {
        assertThat(lineTest.hasNoPreVal(0)).isEqualTo(true);
    }

    @Test
    // hasNoPreVal(n) is reverse side of hasLadder(n-1)
    public void 사다리값_유무_판단() {
        lineTest.store();
        if (lineTest.hasLadder(2)) {
            assertThat(lineTest.hasNoPreVal(3)).isEqualTo(false);
            return;  // terminate
        }
        assertThat(lineTest.hasNoPreVal(3)).isEqualTo(true);
    }

}