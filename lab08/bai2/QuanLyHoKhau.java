package lab08.bai2;

import java.util.Scanner;

public class QuanLyHoKhau {
    private SoHoKhau[] soHoKhaus;
    static Scanner input=new Scanner(System.in);
    public void khaiBaoSHK(){
        System.out.println("Khai bao so ho khau: ");
        System.err.println("Nhap so ho khau can khai bao");
        soHoKhaus=new SoHoKhau[input.nextInt()];
        for (int i = 0; i < soHoKhaus.length; i++) {
            System.out.println("Nhap so nhan khau thu "+(i+1));
            soHoKhaus[i]=new SoHoKhau(input.nextInt());
            soHoKhaus[i].nhapDuLieu();
        }
    }
    public void danhSachSHK(){
        System.out.println("DS so ho khau: ");
    }
    public void timNguoi(){
        System.out.println("Tim Nguoi: ");
    }

    public static void main(String[] args) {
       String chon;
        QuanLyHoKhau quanLyHoKhau=new QuanLyHoKhau();
        do {
            System.out.println("1. Khai bao so ho khau\n2. Danh sach so ho khau\n3. Tim nguoi\n4. exit\nVui long chon tu 1->4");
            chon=input.nextLine();
            switch (chon){
                case "1":
                    quanLyHoKhau.khaiBaoSHK();
                    break;
                case "2":
                    quanLyHoKhau.danhSachSHK();
                    break;
                case "3":
                    quanLyHoKhau.timNguoi();
                    break;
                case "4":
                    System.out.println("Da thoat chuuong trinh");
                    return;
                default:
                    System.out.println("Chon lai");
            }
        }while (true);
    }
}
