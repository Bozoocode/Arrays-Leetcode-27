package com.vamshi.arrayprogramms_Set2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountItemMatchingRule {
    public static int countMatch(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (List<String> item : items) {
            if (  item.get(0).equals(ruleValue)||item.get(1).equals(ruleValue)||item.get(2).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "Lenovo"));
        items.add(Arrays.asList("phone", "gold", "iphone"));

        String ruleKey = "type";
        String ruleValue = "phone";

        int result = countMatch(items, ruleKey, ruleValue);
        System.out.println(result);
    }
}
