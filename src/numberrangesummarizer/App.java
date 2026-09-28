package numberrangesummarizer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class App implements NumberRangeSummarizer{
    public static void main(String[] args) throws Exception {
        
        //FOR TESTING right now
        App app = new App();

        Collection<Integer> numbers = app.collect(" ");

        String result = app.summarizeCollection(numbers);

        System.out.println(result+"I");
        System.out.println("DONE");
    }

    @Override 
    public Collection<Integer> collect(String input)
    {

        List<Integer> nums = new ArrayList<>();

        if(input == null || input.trim().isEmpty()){
            return nums;
        }

        String[] numArray = input.split(",");

        for (String number: numArray)
            {
                nums.add(Integer.parseInt(number.trim()));
            }

        return nums;
    }

    @Override 
    public String summarizeCollection(Collection<Integer> input)
    {
        List<Integer> nums = new ArrayList<>(input);

        if(nums.isEmpty()){
            return "";
        }

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

        //Code repetition to add final number or range to result
        if(result.isEmpty() == false){
            result+= ", ";
        }
        if (start==end) {
            result+= start;
        }else{
            result += start+"-"+end;
        }
        
        return result;
    }
}
