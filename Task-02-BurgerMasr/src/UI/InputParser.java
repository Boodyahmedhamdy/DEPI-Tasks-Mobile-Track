package UI;

import java.util.ArrayList;
import java.util.List;

public class InputParser {

    public static List<Integer> parseSandwichesInput(String input) {
        return extractIntegersFromString(input);
    }

    public static List<Integer> parseExtrasInput(String input) {
        return extractIntegersFromString(input);
    }

    private static List<Integer> extractIntegersFromString(String str) {
        List<Integer> integers = new ArrayList<>();
        StringBuilder currentNumber = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                currentNumber.append(c);
            } else if (!currentNumber.isEmpty()) {
                integers.add(Integer.parseInt(currentNumber.toString()));
                currentNumber.setLength(0); // Clear for next number
            }
        }
        // Add the last number if it exists
        if (!currentNumber.isEmpty()) {
            integers.add(Integer.parseInt(currentNumber.toString()));
        }
        return integers;
    }

}
