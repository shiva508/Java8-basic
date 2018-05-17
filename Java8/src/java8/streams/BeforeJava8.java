package java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BeforeJava8 {

    public static void main(String[] args) {

        List<String> lines = Arrays.asList("shiva", "dasari", "lara");
        List<String> result = getFilterOutput(lines, "lara");
        for (String temp : result) {
            System.out.println(temp); 
        }

    }

    private static List<String> getFilterOutput(List<String> lines, String filter) {
        List<String> result = new ArrayList<>();
        for (String line : lines) {
            if (!"lara".equals(line)) { 
                result.add(line);
            }
        }
        return result;
    }

}
