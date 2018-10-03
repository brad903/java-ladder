package ladder.utils;

public class TextLengthAdjuster {
    public static final int MAX_LENGTH = 5;

    private TextLengthAdjuster() {
    }

    public static String textAdjust(String s) {
        if(s.length() > MAX_LENGTH) {
            return s.substring(0, 5);
        }
        return s;
    }
}
