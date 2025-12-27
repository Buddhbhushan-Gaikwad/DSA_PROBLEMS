import java.util.Arrays;

public class RotateMatrix {

    public static void rotate(int[][] matrix){
        int i ;
        for(i = 0; i < matrix.length; i++){
            for(int j = i; j < matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(i = 0; i < matrix.length; i++){
            int temp = matrix[i][0];
            matrix[i][0] = matrix[i][2];
            matrix[i][2] = temp;
        }


    }
    
    public static void main(String[] args) {
        RotateMatrix rm = new RotateMatrix();
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        rm.rotate(matrix);
        
        System.out.println("Rotated Matrix:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
