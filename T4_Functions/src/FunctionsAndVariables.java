import java.util.Arrays;

public class FunctionsAndVariables {
    static void changeToZero(int a) {
        a = 0;
    }

    static int resetArrayToZero(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }

        return 1;
    }

    static int resetArrayToZero(float[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = 0.0f;
        }

        return 1;
    }

    public static void main(String[] args) {
        int testVar = 10;
        System.out.println("Value before changeToZero: " + testVar);
        changeToZero(testVar); // call-by-value
        System.out.println("Value after changeToZero: " + testVar);

        int[] testArray = {1,2,3};
        System.out.println("Array before resetArrayToZero: " + Arrays.toString(testArray));
        resetArrayToZero(testArray); // call-by-reference
        System.out.println("Array after resetArrayToZero: " + Arrays.toString(testArray));

        float[] testFloatArray = {1.1f, 2.2f, 3.3f};
        resetArrayToZero(testFloatArray);
        resetArrayToZero(testArray);

        System.out.println("====");
    }
}
