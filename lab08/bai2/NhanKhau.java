package lab08.bai2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NhanKhau {
    private String hoVaTen;
    private String ngaySinh;
    private boolean gioiTinh;

    public  void nhapThongTin(){
        Scanner input=new Scanner(System.in);
        System.out.println("Nhap ten: ");
        hoVaTen=input.nextLine();
        System.out.println("Nhap ngay sinh: ");
        ngaySinh=input.nextLine();
        System.out.println("Nhap gioi tinh(nam/nu): ");
        String gender=input.nextLine();
        if("nam".equalsIgnoreCase(gender)){
            gioiTinh=true;
        }else {
            gioiTinh=false;
        }
    }

    public void hienThi(){
        System.out.println("NhanKhau{" +
                "hoVaTen='" + hoVaTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", gioiTinh=" + gioiTinh +
                '}');
    }
}
