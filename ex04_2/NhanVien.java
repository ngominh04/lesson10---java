package ex04_2;

import java.util.Scanner;

public class NhanVien extends NhanVienBanHang {
    private int soLuongBanDuoc=30;
    Scanner input=new Scanner(System.in);


    @Override
    public float tinhLuong() {
        return (float) soLuongBanDuoc*20000;
    }

    @Override
    public void hienThi() {
        System.out.println("Nhap ten: ");
        ten=input.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi=input.nextLine();
        NhanVien nhanVien=new NhanVien();
        System.out.println("Ten: "+ten+", dia chi: "+diaChi+", Tien luong nhan vien "+ten+": "+nhanVien.tinhLuong());
        System.out.println();
    }
}
