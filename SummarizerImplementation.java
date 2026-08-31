package numberrangesummarizer;

import java.util.Arrays;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class SummarizerImplementation implements NumberRangeSummarizer {
    //function to convert the string and store it as an list
    @Override
    public Collection<Integer> collect(String input) {
        String collection = input;
        List<String> list = Arrays.asList(collection.split(","));
        List<Integer> intList = new ArrayList<Integer>();
        
        //Removes empty spaces, convert text numbers into actual integers, and store them 
        for (String part : list) {
            intList.add(Integer.parseInt(part.trim()));
        }

        return intList;
    }
    //function to summarise the converted list
    public String summarizeCollection(Collection<Integer> input) {

        if (input == null || input.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        Iterator<Integer> iterator = input.iterator();

        int start = iterator.next();
        int previous = start;

        while (iterator.hasNext()) {
            int current = iterator.next();

            if (current - previous == 1) {

            } else {
                if (start == previous) {
                    result.append(start);
                } else {
                    result.append(start).append("-").append(previous);
                }

                result.append(", ");
                start = current;
            }

            previous = current;
        }

        
        if (start == previous) {
            result.append(start);
        } else {
            result.append(start).append("-").append(previous);
        }

        return result.toString();
    }
}
