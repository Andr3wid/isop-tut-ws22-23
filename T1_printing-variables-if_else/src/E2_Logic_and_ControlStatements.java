public class E2_Logic_and_ControlStatements {
    public static void main(String[] args) {
        boolean myBool = true;
        int num1 = 2;
        int num2 = 2;

        boolean smallerThan = num1 < num2;
        System.out.println("Result of comparison1: " + smallerThan);

        boolean biggerThan = num1 > num2;
        System.out.println("Result of comparison 2: " + biggerThan);

        // code in if block only gets executed if stuff between brackets is TRUE
        if(num1 > num2) {
            System.out.println("Num1 is bigger than or equal to num2");
        }  else if (num1 == num2){
            System.out.println("Num1 equals num2");
        } else {
            System.out.println("Num1 is smaller than num2");
        }


        int n1 = 25;
        int lowerBound  = 20;
        int upperBound = 30;

        boolean isN1BetweenUpperAndLower = n1 > lowerBound && n1 < upperBound;
        // check if n1 is between lower and upper bound
        if(isN1BetweenUpperAndLower) {
            System.out.println(n1 + " is between " + lowerBound + " and " + upperBound);
        }

        // OR operation
        boolean isDark = true;
        boolean canPersonSee = true;
        boolean hasFlashlight = false;

        if(!isDark && canPersonSee || isDark && canPersonSee && hasFlashlight) {
            System.out.println("It's possible to see something!");
        } else {
            System.out.println("It's not possible to see something :(");
        }

    }
}
