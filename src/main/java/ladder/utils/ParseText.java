package ladder.utils;

import java.util.ArrayList;
import java.util.List;

public class ParseText {

    private ParseText() {
    }

    public static List<String> getParseText(String texts) {
        ArrayList<String> parsedTexts = new ArrayList<>();
        for (String text : texts.split(",")) {
            parsedTexts.add(text);
        }
        return parsedTexts;
    }
}
