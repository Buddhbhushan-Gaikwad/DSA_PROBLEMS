package Array_I;

import java.util.Arrays;

public class LargestSubSring {

    public static int findeLargestSubString(String str){

        int n = str.length();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        int count = 1;

        for(int i = 0; i < n-1; i++){
            if(chars[i] == chars[i+1]){
                continue;
            } else {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        String str = "abcabcdaabbusdisosos";
        int LargestSubStringCount = findeLargestSubString(str);
        System.out.println("Largest SubString Count: "+LargestSubStringCount);
    }
}
