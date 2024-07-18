import java.util.Scanner;

public class Circle {
    private int banKinh;
    private final Float pi = 3.14f;

    public Circle(int banKinh) {
        this.banKinh = banKinh;
    }

    public Circle(){

    }

    public int getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(int banKinh) {
        this.banKinh = banKinh;
    }

    public int chuVi(){
        return 2 * banKinh * pi.intValue();
    }

    public int dienTich(){
        return banKinh * banKinh * pi.intValue();
    }

    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ban kinh: ");
        while (true){
            if(sc.hasNextInt()){
                banKinh = sc.nextInt();
                break;
            }else{
                System.out.println("gia tri nhap vao khong hop le");
                sc.nextLine();
            }
        }
    }

    public void displayData(){
        System.out.println("Thong tin hinh tron: ");
        System.out.println("Ban kinh " + banKinh);
        System.out.println("Chu vi " + chuVi() );
        System.out.println("Dien tich " + dienTich());
    }
}