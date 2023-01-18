public class Rectangle {
    // variable declarations (properties an object HAS)
    private int a;
    private int b;

    // static variables are shared amongst ALL INSTANCES of a class
    static int numberOfRectangles = 0;

    public Rectangle(int a, int b) {
        // makes sure we access the instance variable a
        this.a = a;
        this.b = b;

        numberOfRectangles++;
    }

    public Rectangle() {
        this.a = 1;
        this.b = 1;

        numberOfRectangles++;
    }

    // method declarations (things the object can DO)
    public int getArea() {
        int area = a * b;
        return area;
    }

    // static methods are always called on the class name
    static int returnSomeInt(int a) {
        return 100;
    }

    // GETTER & SETTER SECTION
    public int getA() {
        return this.a;
    }

    public int getB() {
        return this.b;
    }

    public void setA(int newA) {
        if(newA < 0) {
            System.out.println("It is not allowed to set negative values");
        } else {
            a = newA;
        }

    }

    public void setB(int newB) {
        if(newB < 0) {
            System.out.println("It is not allowed to set negative values");
        } else {
            b = newB;
        }
    }

    void printAmountOfRectangles() {
        System.out.println("There have been " + numberOfRectangles + " rectangles created.");
    }
}
