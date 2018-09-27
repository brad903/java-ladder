package ladder.domain;

import ladder.utils.GetRandomVal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Line {
    private static final int RANDOM_PASS = 5;
    private List<Integer> currentPositions = new ArrayList<>();
    private ArrayList<Boolean> points = new ArrayList<>();
    private int countOfPerson;

    public Line(int countOfPerson, List<Integer> prevPositions) {
        this.countOfPerson = countOfPerson;
        initPositions(prevPositions);
    }

    public void initPositions(List<Integer> prevPositions) {
        for (int i = 0; i < countOfPerson; i++) {
            if(prevPositions == null) {
                currentPositions.add(i);
                continue;
            }
            currentPositions.add(prevPositions.get(i));
        }
    }

    public void pointStore() {
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

    public void swapPositions() {
        for (int i = 0; i < points.size(); i++) {
            checkSwap(points.get(i), i);
        }
    }

    public void checkSwap(boolean point, int index) {
        if (point) {
            swap(index);
        }
        return;
    }

    public void swap(int i) {
        int temp = currentPositions.get(i);
        currentPositions.set(i, currentPositions.get(i + 1));
        currentPositions.set(i + 1, temp);
    }

    public List<Integer> getCurrentPositions() {
        return currentPositions;
    }

}