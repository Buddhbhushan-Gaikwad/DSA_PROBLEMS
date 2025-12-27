package Array_I;

import java.util.HashSet;

public class ReplaceStringWithUnderLine {

    public static String[] removeDuplicates(int[] nums){

        HashSet<Integer> seen = new HashSet<>();
        String[] result = new String[nums.length];

        for(int i = 0; i < nums.length; i++){
            if(seen.contains(nums[i])){
                result[i] = "-";
            } else {
                seen.add(nums[i]);
                result[i] = String.valueOf(nums[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1, 4, 4};
        String[] result = removeDuplicates(nums);

        System.out.print("[ ");
        for (String s : result) {
            System.out.print(s + " ");
        }
        System.out.println("]");
    }
}
