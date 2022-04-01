import java.util.ArrayList;

public class Matrix {
    public static int sumOfEvenNumbers(int[][] matrix){
        int osszeg =0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[i][j]%2==0){
                    osszeg +=matrix[i][j];
                }
            }
        }
        return osszeg;
    }
    public static ArrayList<Integer> rowsWithZero(int[][] matrix){
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[i][j] ==0){
                    index.add(i);
                    break;
                }
            }
        }
        return index;
    }
}
