package ladder.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextParser {
    private static final String SEPERATOR_COMMA = ",";

    private TextParser() {
    }

    public static List<String> parse(String s) {
        return new ArrayList<>(Arrays.asList(s.split(SEPERATOR_COMMA)));
    }
}
