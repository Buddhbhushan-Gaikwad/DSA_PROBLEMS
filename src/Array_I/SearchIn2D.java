

public class SearchIn2D {

    public static boolean findElement(int[][] arr, int t){

        int low = 0;
        int high = arr.length * arr[0].length - 1;
        
        while(low <= high){

            int mid = (low+high)/2;
            int row = mid/2;
            int col = mid%2;

            if(arr[row][col] == t){
                return true;
            } else if(arr[row][col] < t){
                low = mid+1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
    
    public static void main(String [] agrs){
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 6, 8},
            {9, 10, 11, 12}
        };
        int target =5;
        boolean ans = findElement(arr, target);
        System.out.println(ans);
    }
}
