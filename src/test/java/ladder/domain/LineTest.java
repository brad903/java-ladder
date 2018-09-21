package ladder.domain;

import ladder.domain.Line;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    @Test
    public void showLineStatus() {
        lineTest.store();
        for (int i = 0; i < testCount - 1; i++) {
            System.out.print(lineTest.hasLadder(i) + " ");
        }
    }

    @Test
    public void showSwapPositions() {
        List<Integer> currentPositions = new ArrayList<>(Arrays.asList(0, 1, 4, 3, 2));
        for (int currentPosition : currentPositions) {
            System.out.print(currentPosition + " ");  // before values
        }
        System.out.println();
        showLineStatus();
        currentPositions = lineTest.swapPositions(currentPositions);
        System.out.println();
        for (int currentPosition : currentPositions) {
            System.out.print(currentPosition + " ");  // after values
        }
    }

    @Test
    public void swap() {
        List<Integer> currentPositions = new ArrayList<>(Arrays.asList(0, 1, 4, 3, 2));
        lineTest.swap(3, currentPositions);
        assertThat(currentPositions.get(3)).isEqualTo(2);
        assertThat(currentPositions.get(4)).isEqualTo(3);
    }

    @Test
    public void checkSwap() {
        List<Integer> currentPositions = new ArrayList<>(Arrays.asList(0, 1, 4, 3, 2));
        boolean point = true;
        int index = 2;

        int beforeVal = currentPositions.get(index);
        lineTest.checkSwap(point, index, currentPositions);
        int afterVal = currentPositions.get(index + 1);
        assertThat(beforeVal).isEqualTo(afterVal);
    }
}