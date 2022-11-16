public class EasyFunctions {

    static void printArrayContents(int[] arr, int n) {
        System.out.println("The length of the array is " + arr.length);
        for(int i = 0; i < n; i++) {
            System.out.println(i + ": " + arr[i]);
        }
        System.out.println("=== finished printing array ===");
    }

    static int calculateRectangleArea(int a, int b) {
        System.out.println("Calculating rectangle area with parameters a=" + a + " and b=" + b);
        int result = a * b;
        return result;
    }

    static String createGreetingMessage(String name) {
        String message = "Hello " + name + ", it's great to have you here!";

        return message;
    }

    static int getArraySum(int[] arr) {
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    static int getArrayAverage(int[] arr) {
        int sum = getArraySum(arr);
        int average = sum / arr.length;
        return average;
    }

    public static void main(String[] args) {
        int[] ourTestArray = {
                1,2,3,4,5
        };

        int[] ourTestArray2 = {10, 20, 30};

        printArrayContents(ourTestArray, 3);
        printArrayContents(ourTestArray2, 1);

        int rectangleArea1 = calculateRectangleArea(5, 6);
        int rectangleArea2 = calculateRectangleArea(10, 100);

        System.out.println("Rectangle 1: " + rectangleArea1);
        System.out.println("Rectangle 2: " + rectangleArea2);

        System.out.println(createGreetingMessage("Timo"));

        System.out.println("Array sum: " + getArraySum(ourTestArray2));
        System.out.println("Array average: " + getArrayAverage(ourTestArray2));
    }
}
