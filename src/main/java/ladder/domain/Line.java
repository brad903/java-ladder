package ladder.domain;

import ladder.utils.GetRandomVal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Line {
    private static final int RANDOM_PASS = 5;
    private int countOfPerson;
    private ArrayList<Boolean> points = new ArrayList<>();

    public Line(int countOfPerson) {
        this.countOfPerson = countOfPerson;
    }

    public void store() {
        for (int i = 0; i < countOfPerson - 1; i++) {
            points.add(judgeEachLadder(GetRandomVal.getRandomVal(), i));
        }
    }

    public boolean judgeEachLadder(int randomVal, int index) {
        if (isBeyondVal(randomVal) && hasNoPreVal(index)) {
            return true;
        }
        return false;
    }

    public boolean isBeyondVal(int randomValue) {
        return randomValue >= RANDOM_PASS;
    }

    public boolean hasNoPreVal(int index) {
        if (index != 0) {
            return !points.get(index - 1);
        }
        return true;
    }

    public boolean hasLadder(int index) {
        return points.get(index);
    }

    public List<Integer> swapPositions(List<Integer> currentPositions) {
        for (int i = 0; i < points.size(); i++) {
            checkSwap(points.get(i), i, currentPositions);
        }
        return currentPositions;
    }

    public void checkSwap(boolean point, int index, List<Integer> currentPositions) {
        if (point) {
            swap(index, currentPositions);
        }
        return;
    }

    public void swap(int i, List<Integer> currentPositions) {
        int temp = currentPositions.get(i);
        currentPositions.set(i, currentPositions.get(i + 1));
        currentPositions.set(i + 1, temp);
    }

}