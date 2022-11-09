public class FunctionExample {

    static int calculateRectangleArea(int a, int b) {
        System.out.println("I received " + a + " and " + b);

        int result = a * b;

        return result;
    }

    static int[] reverseIntArray(int[] input) {
        int[] reversedInput = new int[input.length];

        for(int i = input.length - 1; i >= 0; i--) {
            reversedInput[input.length - 1 - i] = input[i];
        }

        return reversedInput;
    }

    public static void main(String[] args) {

        int rectA = calculateRectangleArea(10, 12);
        System.out.println("The area is: " + rectA);

        int[] arr = {1,2,3,4,5};
        int[] reversedArr = reverseIntArray(arr);
        int[] reversedReversedArr = reverseIntArray(reversedArr);

        System.out.println("===");
    }
}
