package ex04_2;

public class Test {
    public static void main(String[] args) {
        System.out.println("Nhap thong tin Nhan Vien");
        NhanVien nhanVien=new NhanVien();
        nhanVien.hienThi();

        System.out.println("Nhap thong tin Cong Nhan");
        CongNhan congNhan=new CongNhan();
        congNhan.hienThi();
    }
}
