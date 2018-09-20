package calculator;

public class StringCalculator {
    public static final String SEPERATOR = ",|:|;";  // 정규식

    public int add(String inputVal) {
        return calculate(toInt(splitVal(inputVal)));
    }

    private String[] splitVal(String inputVal) {
        return inputVal.split(SEPERATOR);
    }

    private int[] toInt(String[] inputVals) {
        int[] values = new int[inputVals.length];
        for (int i = 0; i < inputVals.length; i++) {
            values[i] = Integer.parseInt(inputVals[i]);
        }
        return values;
    }

    private int calculate(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

}
