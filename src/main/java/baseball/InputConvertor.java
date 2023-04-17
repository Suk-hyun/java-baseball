package baseball;

import java.util.ArrayList;
import java.util.List;

public class InputConvertor {

    public static List<Integer> convert(String input) {
        String[] splitInput = input.split("");
        List<Integer> intList = new ArrayList<>();

        for (String str : splitInput) {
            int toInt = Integer.parseInt(str);
            intList.add(toInt);
        }

        return intList;
    }
}