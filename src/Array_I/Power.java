package Array_I;

public class Power {

    public static double pow(int x, int n){
        double ans = 1;
        int pow = n;
        if( n < 0){
            pow = -1 * n;
        }
        while(pow > 0){
            if(pow % 2 == 1){
                    ans = ans * x;
                    pow--;
            } else {
                x = x * x;
                pow = pow/2;
            }
        }
        if( n < 0){
            ans = (double) (1.0) / (double) (ans);
        }
        return ans;
    }

    public static void main(String[] args){
        int x = 2;
        int n = 5;
        System.out.println("This Power of X ^ N : " + pow(x, n));
    }
}
