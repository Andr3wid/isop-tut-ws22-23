import java.util.Locale;

public class Main {
    static int increaseNumber(int i) {
        i++;

        return i;
    }

    public static void main(String[] args) {

        int num = 1;

        System.out.println("Before: " + num);
        num = increaseNumber(num);
        System.out.println("After: " + num);

    }
}
