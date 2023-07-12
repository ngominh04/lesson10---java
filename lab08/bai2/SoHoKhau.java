package lab08.bai2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SoHoKhau {
    private int soNhanKhau;
    private HoKhau[] arrThanhVien;

    public SoHoKhau(int soNhanKhau) {
        this.soNhanKhau = soNhanKhau;
        arrThanhVien=new HoKhau[soNhanKhau];
    }

    public void nhapDuLieu(){
        for (int i = 0; i < arrThanhVien.length; i++) {
            arrThanhVien[i]=new HoKhau();
            arrThanhVien[i].nhapThongTin();
        }
    }
    public void hienThiDuLieu(){
        for (int i = 0; i < arrThanhVien.length; i++) {
            System.out.println("Nhap thanh vien thu "+(i+1));
            HoKhau thanhVien=arrThanhVien[i];
            thanhVien.hienThi();
        }
    }
}
