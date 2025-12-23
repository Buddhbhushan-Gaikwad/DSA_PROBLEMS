package Array_I;

public class LargestSubArray {

    public static int findeLongestSubArray(int[] arr, int k){

        int n = arr.length;
        int len = 0;
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum += arr[j];
                if(sum == k){
                    int l = i;
                    System.out.print("[ ");
                    while(l <= j){
                        System.out.print(arr[l]);
                        l++;
                    }
                    System.out.print(" ]");
                    int currLen = j-i+1;
                    len = Math.max(len, currLen);
                }

            }
        }
        return len;
    }

    public static void main(String[] args){
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        int legth = findeLongestSubArray(arr, k);
        System.out.println("\nThis is length of longest sub array: "+legth);
    }
}
