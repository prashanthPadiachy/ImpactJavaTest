

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class App implements NumberRangeSummarizer{
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    @Override 
    public Collection<Integer> collect(String input)
    {

        List<Integer> nums = new ArrayList<>();

        String[] numArray = input.split(",");

        for (String number: numArray)
            {
                nums.add(Integer.parseInt(number));
            }

        return nums;
    }

    @Override 
    public String summarizeCollection(Collection<Integer> input)
    {
        return null;
    }
}
