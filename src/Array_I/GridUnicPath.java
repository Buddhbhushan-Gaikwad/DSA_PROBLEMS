package Array_I;

public class GridUnicPath {

    public static int findUnicPath(int n, int m){

        int[][] dp = new int[n][m];
        int count = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                count++;
                if(i == 0 || j == 0){
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[n-1][m-1];
    }

    public static void main(String[] args){
        int n = 4;
        int m = 5;
        int unicPath = findUnicPath(n, m);
        System.out.println(unicPath);
    }
}
