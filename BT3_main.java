import java.util.Scanner;

public class BT3_main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Nhập vào các hệ số a, b, c
        System.out.print("Nhập a: ");
        double a = input.nextDouble();
        System.out.print("Nhập b: ");
        double b = input.nextDouble();
        System.out.print("Nhập c: ");
        double c = input.nextDouble();

        // Tạo đối tượng QuadraticEquation
        BT3 equation = new BT3(a, b, c);

        // Tính delta và hiển thị kết quả
        double delta = equation.getDiscriminant();
        if (delta > 0) {
            System.out.println("Phương trình có 2 nghiệm: " + equation.getRoot1() + " và " + equation.getRoot2());
        } else if (delta == 0) {
            System.out.println("Phương trình có 1 nghiệm: " + equation.getRoot1());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }

        input.close();
    }
}
