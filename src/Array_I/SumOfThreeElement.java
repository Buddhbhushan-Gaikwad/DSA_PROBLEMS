package Array_I;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SumOfThreeElement {
    
        public static void getListOfThreeSumArray(int[] arr) {
        Set<List<Integer>> list = new HashSet<>();

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) { // fixed: should be j+1, not i+2
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        int[] res = {arr[i], arr[j], arr[k]};
                        Arrays.sort(res);

                        List<Integer> triplet = Arrays.asList(res[0], res[1], res[2]);
                        list.add(triplet);
                    }
                }
            }
        }

        // Print all unique triplets
        for (List<Integer> triplet : list) {
            System.out.println(triplet);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, -1, 2, 0, -2, 0};
        getListOfThreeSumArray(arr);
    }

}
