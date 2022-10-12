import java.util.Scanner;

public class E1_Printing {
    // entry point for every java program
    public static void main(String[] args) {
        System.out.println("Hello ISOP Tutorial fellows!");
        System.out.println("Hello ISOP Tutorial fellows!");

        System.out.println(123124 + 1245);

        // Generally on initializing variables:
        // DATATYPE NAME = VALUE;
        int ourWholeNumber = 10;

        String greeting = "Hello, how are you doing?";

        System.out.println(greeting);

        // Floating point data types
        float myFloatingPointNumber = 10.5f;
        double myOtherFloatingPointNumber = 10.5;

        // boolean data type
        boolean anyBoolean = true; // or also the value false

        // CIRCLE area calculation program
        double pi = 3.141592654;
        double radius;

        Scanner input = new Scanner(System.in);
        System.out.print("Please input the radius of your circle: ");
        radius = input.nextDouble();
        System.out.println();

        double areaOfCircle = radius * radius * pi;

        System.out.println("The area of your circle is: " + areaOfCircle);

        // math operators
        int subtraction = 1000 - 10;
        int division = 10 / 3;
        System.out.println("Result of 10 / 3: " + division);

        int modulo = 10 % 3;
        System.out.println("Remainder of 10 / 3: " + modulo);

        // escape characters
        System.out.println("\tThis is the first line.\nThis is the second line.");

        // Greeting program
        System.out.println("Please input your name: ");
        String name = input.next();

        System.out.println("Please input your age: ");
        int age = input.nextInt();

        String introductionSentence = "Hello my name is " + name + " and I am " + age + " years old.";
        System.out.println(introductionSentence);

        // adding Strings and numbers
        String num1 = "2sduwiyrt";
        int num2 = 3;
        String result = num1 + num2;
        System.out.println("Calculated result: " + result);

        int castedNum1 = Integer.parseInt(num1);
        int castedResult = castedNum1 + num2;
        System.out.println("Calculated casted result: " + castedResult);

    }
}
