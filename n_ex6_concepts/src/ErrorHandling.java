import java.util.Scanner;

public class ErrorHandling {
    public static void main(String[] args) {
        int[] bla = new int[2];

        try {
            System.out.println(bla[3]);
        } catch(Exception e) {
            System.out.println("Error occured");
            // e.printStackTrace();
        }

        System.out.println("I get printed after the error");

        //////////////////////////////////

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new car speed: ");
        int newCarSpeed = scanner.nextInt();

        Car c1 = new Car("Audi", 0);
        try {
            c1.setCurrentSpeed(newCarSpeed);
        } catch(IllegalArgumentException ex) {
            System.out.println("Failed to set new speed");
        }

        c1.printCarInfos();
        c1.crash();

        Airplane a1 = new Airplane();
        a1.crash();
    }
}
