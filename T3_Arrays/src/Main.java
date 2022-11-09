import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] preDefinedValues = {
                100,
                1000,
                10000
        };

        String[] greetings = new String[3];
        greetings[0] = "hi";
        greetings[1] = "hello";

        boolean[] bArray = new boolean[10];

        int[] measurementValues = new int[7];
        measurementValues[0] = 100;
        measurementValues[1] = 44;
        measurementValues[2] = 101;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which index do you want to print?");

        int targetIndex = scanner.nextInt();

        int lastIndex = measurementValues.length - 1;

        if(targetIndex > lastIndex || targetIndex < 0) {
            System.out.println("The index you entered does not exist in our array");
        } else {
            System.out.println(measurementValues[targetIndex]);
        }

        System.out.println("=== ALL ARRAY ELEMENTS ===");
        for(int i = 0; i < measurementValues.length; i++) {
            System.out.println(i + ": " + measurementValues[i]);
        }
        System.out.println("=== PRINTING COMPLETE ===");

        int counter = 0;
        int sum = 0;
        while(counter < measurementValues.length) {
            sum = sum + measurementValues[counter];
            counter++;
        }

        System.out.println("The sum of the array values is: " + sum);

        int average = sum / measurementValues.length;
        System.out.println("The average of array values is: " + average);

        // reverse measurement values array
        int[] reversedMeasurementValues = new int[measurementValues.length];
        for(int i = measurementValues.length - 1; i >= 0; i--) {
            reversedMeasurementValues[measurementValues.length - 1 - i] = measurementValues[i];
        }
        System.out.println("Program end");
    }
}
