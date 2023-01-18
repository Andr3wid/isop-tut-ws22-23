import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(4, 2);
        r1.printAmountOfRectangles();

        Rectangle r2 = new Rectangle(10, 20);
        r2.printAmountOfRectangles();
        r1.printAmountOfRectangles();

        Rectangle r3 = new Rectangle();
        r3.printAmountOfRectangles();
        r1.printAmountOfRectangles();
        r2.printAmountOfRectangles();

        r1.setA(10);

        System.out.println("Rectangle side a: " + r1.getA());

        System.out.println("The area of the r1 is: " + r1.getArea());
        System.out.println("The area of the r2 is: " + r2.getArea());

        int someValue = Rectangle.returnSomeInt(10);

    }
}
