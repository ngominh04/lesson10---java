package lab08.bai2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.PrimitiveIterator;
import java.util.Scanner;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HoKhau extends NhanKhau{
    private String diaChiHienNay;
    private String noiCongTac;

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner input=new Scanner(System.in);
        System.out.println("Nhap dia chi thuong tru: ");
        diaChiHienNay=input.nextLine();
        System.out.println("Nhap noi cong tac: ");
        noiCongTac=input.nextLine();
    }
    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("HoKhau{" +
                "diaChiHienNay='" + diaChiHienNay + '\'' +
                ", noiCongTac='" + noiCongTac + '\'' +
                '}');
    }
}
