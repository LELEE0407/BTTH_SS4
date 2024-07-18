public class BT3 {
    private double a;
    private double b;
    private double c;

    // Constructor
    public BT3(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Getters
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    // Setters
    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    // Method to calculate the discriminant
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    // Methods to calculate the roots
    public double getRoot1() {
        double delta = getDiscriminant();
        if (delta < 0) {
            return 0;
        }
        return (-b + Math.pow(delta, 0.5)) / (2 * a);
    }

    public double getRoot2() {
        double delta = getDiscriminant();
        if (delta < 0) {
            return 0;
        }
        return (-b - Math.pow(delta, 0.5)) / (2 * a);
    }
}
