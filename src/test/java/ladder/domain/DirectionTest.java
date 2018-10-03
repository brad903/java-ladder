package ladder.domain;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class DirectionTest {

    @Test
    public void newDirection() {
        Direction direction = Direction.newDirection(FALSE);
        assertThat(direction.isLeft()).isEqualTo(FALSE);
    }

    @Test
    public void middle() {
        Direction direction = Direction.middle(new Direction(TRUE, TRUE));
        assertThat(direction.isLeft()).isEqualTo(TRUE);
    }

    @Test
    public void last() {
        Direction direction = Direction.last(new Direction(TRUE, TRUE));
        assertThat(direction.isLeft()).isEqualTo(TRUE);
        assertThat(direction.isRight()).isEqualTo(FALSE);
    }
}