package ladder.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Line {
    public List<Point> points = new ArrayList<>();

    Line(int countOfPerson) {
        Point point = initFirst();
        point = initMiddle(point, countOfPerson);
        initLast(point);
    }

    private Point initFirst() {
        Point point = Point.first();
        points.add(point);
        return point;
    }

    private Point initMiddle(Point point, int countOfPerson) {
        for (int i = 1; i < countOfPerson - 1; i++) {
            point = Point.middle(point);
            points.add(point);
        }
        return point;
    }

    private void initLast(Point point) {
        point = Point.last(point);
        points.add(point);
    }

    public int move(int index) {
        return Point.move(points.get(index));
    }

    public List<Boolean> valueToDto(int countOfPerson) {
        List<Boolean> lineValue = new ArrayList<>();
        for (int i = 0; i < countOfPerson - 1; i++) {
            Boolean val = Point.showValue(points.get(i));
            lineValue.add(val);
        }
        return lineValue;
    }

    @Override
    public String toString() {
        return "Line{" +
                "points=" + points +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Objects.equals(points, line.points);
    }

    @Override
    public int hashCode() {
        return Objects.hash(points);
    }

}