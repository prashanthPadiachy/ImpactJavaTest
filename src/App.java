

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class App implements NumberRangeSummarizer{
    public static void main(String[] args) throws Exception {
        
        //FOR TESTING right now
        App app = new App();

        Collection<Integer> numbers = app.collect("1,3,6,7,8,12,13,14,15,21,22,23,24,31");

        String result = app.summarizeCollection(numbers);

        System.out.println(result);
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
        List<Integer> nums = new ArrayList<>(input);

        String result = "";

        int start = nums.getFirst();
        int end = start;

        for (int i = 1; i < nums.size(); i++) {
            int cur = nums.get(i);

            if(cur == end+1){
                end = cur;
            }else{
                if (result.isEmpty() == false) {
                    result+= ", ";
                }

                if (start==end) {
                    result+= start;
                }else{
                    result += start+"-"+end;
                }

                start = cur;
                end = cur;
            }
        }
        
        return result;
    }
}
