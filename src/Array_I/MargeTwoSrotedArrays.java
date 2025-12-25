package Array_I;

import java.util.*;

public class MargeTwoSrotedArrays {

    public static List<Integer> mergeTwoSorted(int[] arr1, int[] arr2){

        int n = arr1.length;
        int m = arr2.length;
        int i = 0, j = 0;

        List<Integer> marged = new ArrayList<>();

        while(i < n && j < m){
            if(arr1[i] < arr2[j]){
                marged.add(arr1[i]);
                i++;
            } else {
                marged.add(arr2[j]);
                j++;
            }
        }

        while(i < n){
            marged.add(arr1[i]);
            i++;
        }
        while(j < m){
            marged.add(arr2[j]);
            j++;
        }
      return marged;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        System.out.println(mergeTwoSorted(arr1,arr2));
    }
}
