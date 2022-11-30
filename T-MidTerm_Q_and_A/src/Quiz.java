import java.util.Arrays;

public class Quiz {

    // TODO define your method here
    static int[] sumRows(int[][] arr) {
        int[] sums = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                sums[i] += arr[i][j];
            }
        }

        return sums;
    }

    public static void main(String[] args) {
        int[][] myMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // TODO put your code here
        int[] mySumRows = sumRows(myMatrix);
        System.out.println(Arrays.toString(mySumRows));
    }

}
