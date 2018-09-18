package ladder;

import java.util.Scanner;

public class InputView {

    private InputView() {
    }  // prevent making instance

    public static int getPeopleCount() {
        Scanner scan = new Scanner(System.in);
        System.out.println("참여할 사람은 몇 명 인가요?");
        return scan.nextInt();
    }

    public static int getLadderHeight() {
        Scanner scan = new Scanner(System.in);
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        return scan.nextInt();
    }

}
