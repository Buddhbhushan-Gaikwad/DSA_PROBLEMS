package Array_I;

public class TrappedWater {
    
    public static void findTrappedWater(int[] arr){
        int n = arr.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        
        leftMax[0] = arr[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(arr[i], leftMax[i-1]);
        }
        System.out.println("Left Max Array: "+java.util.Arrays.toString(leftMax));
        
        rightMax[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }
        System.out.println("Right Max Array: "+java.util.Arrays.toString(rightMax));
        
        int trappedWater = 0;
        for(int i=0; i<n; i++){
            trappedWater += Math.min(leftMax[i], rightMax[i]) - arr[i];
        }
        
        System.out.println("Total Trapped Water: " + trappedWater);
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        findTrappedWater(arr);
    }
}
