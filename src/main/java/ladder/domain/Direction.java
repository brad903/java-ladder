package ladder.domain;

import java.util.Objects;

import static java.lang.Boolean.FALSE;
import static ladder.utils.LadderGenerator.*;

class Direction {
    private final boolean left;
    private final boolean right;

    public Direction(boolean left, boolean right) {
        this.left = left;
        this.right = right;
    }

    public boolean isLeft() {
        return left;
    }

    public boolean isRight() {
        return right;
    }

    public static Direction newDirection(boolean newLeft) {
        return new Direction(newLeft, isLadder(getRandomVal()));
    }

    public static Direction first() {
        return newDirection(FALSE);
    }

    public static Direction middle(Direction direction) {
        if (direction.isRight()) {
            return new Direction(direction.isRight(), FALSE);
        }
        return newDirection(direction.isRight());
    }

    public static Direction last(Direction direction) {
        return new Direction(direction.right, FALSE);
    }

    public int move() {
        if (isLeft()) return -1;
        if (isRight()) return 1;
        return 0;
    }

    @Override
    public String toString() {
        return "Direction{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Direction direction = (Direction) o;
        return left == direction.left &&
                right == direction.right;
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, right);
    }
}