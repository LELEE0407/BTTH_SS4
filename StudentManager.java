import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    private List<Student> studentList = new ArrayList<>();

    // Hiển thị danh sách tất cả học sinh
    public void displayAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("Danh sách học sinh trống.");
        } else {
            for (Student student : studentList) {
                student.displayData();
                System.out.println("-----------------------");
            }
        }
    }

    // Thêm mới học sinh
    public void addStudent() {
        Student student = new Student();
        student.inputData();
        studentList.add(student);
        System.out.println("Thêm học sinh thành công.");
    }

    // Sửa thông tin học sinh dựa vào mã học sinh
    public void updateStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã học sinh cần sửa: ");
        String id = scanner.nextLine();
        boolean found = false;
        for (Student student : studentList) {
            if (student.getStudentId().equals(id)) {
                System.out.println("Nhập thông tin mới cho học sinh:");
                student.inputData();
                found = true;
                System.out.println("Cập nhật thông tin thành công.");
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy học sinh với mã: " + id);
        }
    }

    // Xóa học sinh dựa vào mã học sinh
    public void deleteStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã học sinh cần xóa: ");
        String id = scanner.nextLine();
        boolean found = false;
        for (Student student : studentList) {
            if (student.getStudentId().equals(id)) {
                studentList.remove(student);
                found = true;
                System.out.println("Xóa học sinh thành công.");
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy học sinh với mã: " + id);
        }
    }

    // Hiển thị menu chính
    public void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("===== MENU CHỨC NĂNG =====");
            System.out.println("1. Hiển thị danh sách tất cả học sinh");
            System.out.println("2. Thêm mới học sinh");
            System.out.println("3. Sửa thông tin học sinh");
            System.out.println("4. Xóa học sinh");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over
            switch (choice) {
                case 1:
                    displayAllStudents();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Chọn chức năng không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        manager.mainMenu();
    }
}
