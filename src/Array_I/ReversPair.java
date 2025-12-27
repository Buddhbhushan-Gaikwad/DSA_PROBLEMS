public class ReversPair {
    
    public static void findeReversPair(int[] arr){
        int n = arr.length;
        int count = 0;
        int X=0;
        for(int i=X+1;i<n;i++){
            if(arr[X] > 2*arr[i]){
                count = count +1;
                // HashMap<Integer, Integer> map = new HashMap<>();
                // map.put(arr[X], arr[i]);
                System.out.println("Revers Pair: ("+arr[X]+", "+arr[i]+")");
            }
            if(i==n-1){
                i=X+1;
                X++;
            }
            if(X==n-1){
                break;
            }

        }
        System.out.println("Total Revers Pair: "+count);
    }

    public static void main(String[] args) {
        int[] arr = {6, 4, 1, 2, 7};
        findeReversPair(arr);
    }
}

