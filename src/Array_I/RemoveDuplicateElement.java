package Array_I;

public class RemoveDuplicateElement {

    public static int removeDuplicate(int[] nums){

        if (nums.length == 0) {
            return 0;
        }

        int j = 1; // pointer for unique elements
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args){
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int length = RemoveDuplicateElement.removeDuplicate(nums);

        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
