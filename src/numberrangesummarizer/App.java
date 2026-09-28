package numberrangesummarizer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class App implements NumberRangeSummarizer{
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        App app = new App();

        System.out.println("Enter a list of numbers separated by commas (','):");
        String input = scanner.nextLine();

        try {
            System.out.println(app.summarizeCollection(app.collect(input)));
        } catch (Exception e) {
            System.out.println("Input Error, Invalid Input");
        }
        sc.close();
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
