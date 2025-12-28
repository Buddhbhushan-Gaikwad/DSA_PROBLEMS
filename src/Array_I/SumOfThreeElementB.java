package Array_I;
import java.util.HashSet;
import java.util.Set;

public class SumOfThreeElementB {
    
    public static void getListOfThreeSumArray(int[] arr) {
        int a = 0, b = 1, c = 2;
        Set<String> seen = new HashSet<>(); // less memory than Set<List<Integer>>

        while (a < arr.length - 2) {
            int sum = arr[a] + arr[b] + arr[c];

            if (sum == 0) {
                // sort just 3 numbers manually to avoid creating arrays/lists
                int x = arr[a], y = arr[b], z = arr[c];
                if (x > y) { int t = x; x = y; y = t; }
                if (y > z) { int t = y; y = z; z = t; }
                if (x > y) { int t = x; x = y; y = t; }

                String key = x + "," + y + "," + z;
                if (seen.add(key)) {
                    System.out.println("[" + x + ", " + y + ", " + z + "]");
                }
            }

            // increment logic
            c++;
            if (c >= arr.length) {
                b++;
                c = b + 1;
            }
            if (b >= arr.length - 1) {
                a++;
                b = a + 1;
                c = b + 1;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, -1, 2, 0, -2, 0};
        getListOfThreeSumArray(arr);
    }
}
