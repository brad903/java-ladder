package ladder.domain;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class PointTest {
    @Test
    public void move() {
        Direction direction = new Direction(FALSE,TRUE);
        Point point = new Point(2, direction);
        assertThat(point.move(point)).isEqualTo(3);

        direction = new Direction(TRUE, FALSE);
        point = new Point(2, direction);
        assertThat(point.move(point)).isEqualTo(1);

        direction = new Direction(FALSE, FALSE);
        point = new Point(2, direction);
        assertThat(point.move(point)).isEqualTo(2);
    }
}