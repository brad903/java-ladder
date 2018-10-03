package ladder.domain;

import java.util.Objects;

public class Point {
    private final int index;
    private final Direction direction;

    public Point(int index, Direction direction) {
        this.index = index;
        this.direction = direction;
    }

    public static Point first() {
        return new Point(0, Direction.first());
    }

    public static Point middle(Point point) {
        return new Point(point.index + 1, Direction.middle(point.direction));
    }


    public static Point last(Point point) {
        return new Point(point.index + 1, Direction.last(point.direction));
    }

    public static int move(Point point) {
        return point.index + point.direction.move();
    }

    public static Boolean showValue(Point point) {
        return point.direction.isRight();
    }

    @Override
    public String toString() {
        return "Point{" +
                "index=" + index +
                ", direction=" + direction +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return index == point.index &&
                Objects.equals(direction, point.direction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, direction);
    }
}
