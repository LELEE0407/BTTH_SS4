import java.util.Scanner;

public class Employee {
    private int employeeId;
    private String employeeName;
    private int age;
    private String gen;
    private double rate;
    private double salary;

    // Constructor không tham số
    public Employee() {
    }

    // Constructor có tham số
    public Employee(int employeeId, String employeeName, int age, String gen, double rate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gen = gen;
        this.rate = rate;
    }

    // Phương thức inputData() cho phép người dùng nhập vào thông tin của đối tượng trừ lương
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã nhân viên: ");
        this.employeeId = scanner.nextInt();
        scanner.nextLine();  // Clear buffer
        System.out.print("Nhập tên nhân viên: ");
        this.employeeName = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        this.age = scanner.nextInt();
        scanner.nextLine();  // Clear buffer
        System.out.print("Nhập giới tính: ");
        this.gen = scanner.nextLine();
        System.out.print("Nhập hệ số lương: ");
        this.rate = scanner.nextDouble();
    }

    // Phương thức displayData() cho phép hiển thị toàn bộ thông tin nhân viên
    public void displayData() {
        System.out.println("Mã nhân viên: " + this.employeeId);
        System.out.println("Tên nhân viên: " + this.employeeName);
        System.out.println("Tuổi: " + this.age);
        System.out.println("Giới tính: " + this.gen);
        System.out.println("Hệ số lương: " + this.rate);
        System.out.println("Lương: " + this.salary);
    }

    // Phương thức calSalary() cho phép tính lương nhân viên
    public void calSalary() {
        this.salary = this.rate * 1_300_000;
    }

    // Getter và Setter cho các thuộc tính nếu cần thiết (không bắt buộc)
    // ...
}
