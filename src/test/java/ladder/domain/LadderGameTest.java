package ladder.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class LadderGameTest {
    LadderGame ladderGame = new LadderGame(5);

    public int move(int i) {
        return i + 1;
    }

    @Test
    public void 반복문_테스트() {
        for (int i = 0; i < 5; i++) {
            int temp = i;
            System.out.print(temp + " -> ");
            for (int j = 0; j < 4; j++) {
                temp = move(temp);
            }
            System.out.println(temp);
        }
    }

}