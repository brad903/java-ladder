package ladder;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LineTest {
    private static final int testCount = 5;
    Line lineTest = new Line(testCount);

    @Test
    public void judgeEachLadder() {
        lineTest.store();
        assertThat(lineTest.judgeEachLadder(2, 1)).isEqualTo(false);  // b/c randomVal is less than RANDOM_PASS
    }

    @Test
    public void isBeyondVal() {
        assertThat(lineTest.isBeyondVal(6)).isEqualTo(true);
    }

    @Test
    public void hasNoPreVal() {
        assertThat(lineTest.hasNoPreVal(0)).isEqualTo(true);
    } // if index is 0, must be true

    @Test
    public void hasLadder() {
        lineTest.store();
        assertThat(lineTest.hasLadder(2)).isEqualTo(!lineTest.hasNoPreVal(3));  // hasNoPreVal(n) is reverse side of hasLadder(n-1)
    }
}