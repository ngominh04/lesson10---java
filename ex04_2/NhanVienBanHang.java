package ex04_2;

public abstract class NhanVienBanHang {
     String ten;
     String diaChi;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public abstract float tinhLuong();
    public abstract void hienThi();
}
