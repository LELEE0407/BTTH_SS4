import java.util.Scanner;

public class Student {
    private String studentId;
    private String studentName;
    private int age;
    private String gender;
    private String address;
    private String phoneNumber;

    // Constructor không tham số
    public Student() {
    }

    // Constructor có tham số
    public Student(String studentId, String studentName, int age, String gender, String address, String phoneNumber) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Phương thức nhập dữ liệu
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã học sinh: ");
        this.studentId = scanner.nextLine();
        System.out.print("Nhập tên học sinh: ");
        this.studentName = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        this.age = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        System.out.print("Nhập giới tính: ");
        this.gender = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        this.address = scanner.nextLine();
        System.out.print("Nhập số điện thoại: ");
        this.phoneNumber = scanner.nextLine();
    }

    // Phương thức hiển thị dữ liệu
    public void displayData() {
        System.out.println("Mã học sinh: " + this.studentId);
        System.out.println("Tên học sinh: " + this.studentName);
        System.out.println("Tuổi: " + this.age);
        System.out.println("Giới tính: " + this.gender);
        System.out.println("Địa chỉ: " + this.address);
        System.out.println("Số điện thoại: " + this.phoneNumber);
    }

    // Getters và Setters
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
