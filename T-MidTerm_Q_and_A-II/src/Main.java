import java.util.Scanner;

public class Main {
    static boolean iseven(int num) {
        return num % 2 == 0;
    }
    static int multiplyByTwo(int num) {
        return num * 2;
    }

    static double multiplyByTwo(double num) {
        return num * 2;
    }

    static int addToNumber(int a, int b) {
        return a + b;
    }

    static int resetToZero(int variableToChange) {
        variableToChange = 0;
        return variableToChange;
    }

    static void resetFirstElementToZero(int[] arr) {
        arr[0] = 0;
    }

    static int getSumOfArrayElements(int[] arr) {
        if(arr == null) {
            return 0;
        }

        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    static int twoDArraySum(int[][] arr) {
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }

        return sum;
    }

    static int twoDAverage(int[][] arr) {
        int sum = twoDArraySum(arr);

        int amountOfElements = arr.length * arr[0].length;

        return sum / amountOfElements;
    }

    // 3! ==> 3 * 2 * 1
    static int factorial(int n) {
        int result = 1;
        for(int i = n; i > 0; i--) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] our2DArray = {
                { 10, 40, 10},
                { 10, 10, 10}
        };

        int sum3 = twoDArraySum(our2DArray);
        System.out.println("2D Array sum: " + sum3);

        int avg3 = twoDAverage(our2DArray);
        System.out.println("2D Array average: " + avg3);

        Scanner input3 = new Scanner(System.in);
        System.out.println("Which number do you want to calculate the factorial of: ");
        int ourFactorialParameter = input3.nextInt();
        System.out.println("Factorial of " + ourFactorialParameter+ " equals: " + factorial(ourFactorialParameter));

        int num = 100;
        System.out.println("Before reset: " + num);
        resetToZero(num);
        System.out.println("After reset: " + num);

        int[] ourArray = {1,2,3};
        System.out.println("First element before resetting: " + ourArray[0]);
        resetFirstElementToZero(ourArray);
        System.out.println("First element after resetting: " + ourArray[0]);

        int result = multiplyByTwo(addToNumber(10, 10));

        System.out.print("hello");
        System.out.print("\n");
        System.out.print("world");
        System.out.println("hello world");

        int[] emptyArray = new int[0];
        int[] nullArray = null;
        int sum = getSumOfArrayElements(nullArray);

        int wholeNumber = 7;
        float floatingPoint = 7.4f;
        double floatingPointLarge = 7.4;
        boolean trueFalse = true;
        String text = "asdf";
        char c = 'a';

        // integer division
        int add = 1 + 100;
        int sub = 300 - 20;
        int mul = 10 * 10;
        int div = 5 / 3; // --> 1 because integer division
        int mod = 5 % 3; // --> 2

        // int num = 100;
        // boolean isEven = num % 2 == 0;

        double operation = 5.0 / 3; //

        // scanner
        Scanner input = new Scanner(System.in);

        // endless loop with input
        int sum2 = 0;
        int userInput = 0;

        System.out.println("Input positive numbers that should be summed; to exit enter -1");

        while(true) {
            System.out.print("Your number: ");
            userInput = input.nextInt();
            System.out.println();

            if(userInput == -1) {
                break;
            } else {
                sum2 = sum2 + userInput;
            }
        }

        System.out.println("The calculated sum is: " + sum2);
    }
}
