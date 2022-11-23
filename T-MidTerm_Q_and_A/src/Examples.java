import java.util.Scanner;

public class Examples {
    static void resetArray(int[] arr, int n) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = n;
        }
    }

    static int findLargestArrayNumber(int[] arr) {
        int largest = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }

    static String ourSuperComplexFunction(String str, int i) {
        String result = "";

        for(int count = 1; count <= i; count++) {
            result = result + str;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How large should the array be: ");
        // int size = input.nextInt();
        int size = 4;

        // Array explainations
        int[] myNumbers = new int[size];
        int[] myNumbers2 = {
                2,3,100,4,5
        };

        System.out.println("Index 0: " + myNumbers[0]);
        System.out.println("Last index" + myNumbers[myNumbers.length - 1]);

        myNumbers[1] = -1;

        System.out.println("Element index 1: " + myNumbers[1]);

        // Fill array with numbers from 1 - array.length
        for(int i = 0; i < myNumbers.length; i++) {
            myNumbers[i] = i;
        }

        // sum of array
        int sum = 0;
        for(int i = 0; i < myNumbers2.length; i++) {
            // sum = sum + myNumbers2[i];
            sum += myNumbers2[i];
        }
        System.out.println("The sum of the array is: " + sum);
        int average = sum / myNumbers2.length;
        System.out.println("The average of the array is: " + average);

        // reverse array (with a helper array)
        int[] reversedArray = new int[myNumbers2.length];
        for(int i = myNumbers2.length - 1; i >= 0 ; i--) {
            int reverseArrayIndex = reversedArray.length - 1 - i;
            reversedArray[reverseArrayIndex] = myNumbers2[i];
        }

        // reverse array (with a helper array)
        int[] reversedArray2 = new int[myNumbers2.length];
        int lowerCounter = 0;
        for(int i = myNumbers2.length - 1; i >= 0 ; i--) {
            reversedArray2[lowerCounter] = myNumbers2[i];
            lowerCounter++;
        }

        // ternary operator
        int age = 16;
        String isAllowedToEnterClub = age >= 18 ? "yes, it's fine" : "no, not allowed";
        /*
        if(age >= 18) {
            isAllowedToEnterClub = "yes, it's fine";
        } else {
            isAllowedToEnterClub = "no, not allowed";
        }
        */

        System.out.println("Is allowed to enter club: " + isAllowedToEnterClub);

        // function fun
        String duplicatedHello = ourSuperComplexFunction("Hello", 5);
        System.out.println(duplicatedHello);

        // convert integer to String
        int number = 10;
        String stringifiedNumber = number + "";
        String stringifiedNumber2 = String.valueOf(number);

        String numberAsText = "100";
        int hundred = Integer.parseInt(numberAsText);

        // find largest number in array
        int largestNum = findLargestArrayNumber(myNumbers2);
        System.out.println("The largest found number is: " + largestNum);
        resetArray(myNumbers2, -1);

        // 2d arrays
        System.out.println("How many rows should your matrix have: ");
        int rows = input.nextInt();

        System.out.println("How many columns should your matrix have: ");
        int cols = input.nextInt();

        int[][] matrix = new int[rows][cols];

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                matrix[i][j] = -1;
            }
        }


        System.out.println("+++++++==========+++++++++");
    }
}
