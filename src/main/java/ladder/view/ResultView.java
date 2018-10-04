package ladder.view;

import ladder.dto.LadderDto;
import ladder.dto.ResultDto;

import static ladder.utils.TextLengthAdjuster.textAdjust;
import java.util.List;
import java.util.Map;

public class ResultView {
    private static final String LADDER_NO = "     ";
    private static final String LADDER_YES = "-----";
    private static final String LADDER_BWT = "|";
    public static final String PRINT_SPACE = "6";

    private ResultView() {
    }

    public static void resultHead() {
        System.out.println();
        System.out.println("사다리 결과");
        System.out.println();
    }

    public static void showNames(List<String> userNames) {
        for (String userName : userNames) {
            System.out.printf("%" + PRINT_SPACE + "s", textAdjust(userName));
        }
        System.out.println();
    }

    public static void showLadder(LadderDto ladderDto) {
        for (List<Boolean> line : ladderDto.getLineValues()) {
            System.out.print(LADDER_NO);
            showLine(line);
            System.out.print(LADDER_BWT);
            System.out.println();
        }
    }

    public static void showLine(List<Boolean> line) {
        for (Boolean ladder : line) {
            System.out.print(LADDER_BWT);
            if (ladder) {
                System.out.print(LADDER_YES);
                continue;
            }
            System.out.print(LADDER_NO);
        }
    }

    public static void showResult(List<String> gameResults) {
        for (String gameResult : gameResults) {
            System.out.printf("%" + PRINT_SPACE + "s", textAdjust(gameResult));
        }
        System.out.println();
    }


    public static void showUserRequest(String userRequest, ResultDto resultDto) {
        System.out.println();
        System.out.println("실행결과");
        if (userRequest.equals("all")) {
            showResultAll(resultDto);
            return;
        }
        System.out.println(resultDto.getGameResult().get(userRequest));
    }

    public static void showResultAll(ResultDto resultDto) {
        for(Map.Entry<String, String> elem : resultDto.getGameResult().entrySet()){
            String key = elem.getKey();
            String value = elem.getValue();
            System.out.println(key+" : "+value);
        }
    }
}