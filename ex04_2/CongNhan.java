package ex04_2;

import java.util.Scanner;

public class CongNhan extends NhanVienBanHang{
    int soLuongSanPham=10;
    Scanner input=new Scanner(System.in);
    @Override
    public float tinhLuong() {
        return (float) soLuongSanPham*10000;
    }

    @Override
    public void hienThi() {
        System.out.println("Nhap ten: ");
        ten=input.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi=input.nextLine();
        CongNhan congNhan=new CongNhan();
        System.out.println("Ten: "+ten+", dia chi: "+diaChi+", Tien luong nhan vien "+ten+": "+congNhan.tinhLuong());
        System.out.println();
    }
}
