import java.util.Scanner;

public class Circle_main {
    public static void main(String[] args) {
        Circle ht1 = new Circle();
        ht1.inputData();
        ht1.displayData();

        System.out.println("chu vi hinh tron la: " + ht1.chuVi());
        System.out.println("dien tich hinh tron la: " + ht1.dienTich());
    }
}
