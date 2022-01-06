package PROJECT;

import java.io.IOException;

public abstract class ConNguoi {

    KiemTraDuLieu kiemtradulieu = new KiemTraDuLieu();
    private String dia_chi, ho_ten, ngay_thang_nam_sinh, gioi_tinh, sdt, email;

    public String getdia_chi() {
        return dia_chi;
    }

    public void setdia_chi(String dia_chi) {
        this.dia_chi = dia_chi;
    }

    public String getho_ten() {
        return ho_ten;
    }

    public void setho_ten(String ho_ten) {
        this.ho_ten = ho_ten;
    }

    public String getngay_thang_nam_sinh() {
        return ngay_thang_nam_sinh;
    }

    public void setngay_thang_nam_sinh(String ngay_thang_nam_sinh) {
        this.ngay_thang_nam_sinh = ngay_thang_nam_sinh;
    }

    public String getgioi_tinh() {
        return gioi_tinh;
    }

    public void setgioi_tinh(String gioi_tinh) {
        this.gioi_tinh = gioi_tinh;
    }

    public String getsdt() {
        return sdt;
    }

    public void setsdt(String sdt) {
        this.sdt = sdt;
    }
    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public ConNguoi() {
    }

    public ConNguoi(String dia_chi, ho_ten, ngay_thang_nam_sinh, gioi_tinh, sdt, email) {
        this.dia_chi = dia_chi;
        this.ho_ten = ho_ten;
        this.ngay_thang_nam_sinh = ngay_thang_nam_sinh;
        this.gioi_tinh = gioi_tinh;
        this.sdt = sdt;
        this.email = email;
    }

    public String Nhapdia_chi() {
        dia_chi = kiemtradulieu.KiemTraNhapDiaChi();
        return dia_chi;
    }

    public String Nhapho_ten() {
        ho_ten = kiemtradulieu.KiemTraNhapHoTen();
        return ho_ten;
    }

    public String Nhapngay_thang_nam_sinh() {
        ngay_thang_nam_sinh = kiemtradulieu.KiemTraNhapNgaySinh();
        return ngay_thang_nam_sinh;
    }

    public String Nhapgioi_tinh() {
        gioi_tinh = kiemtradulieu.KiemTraNhapPhai();
        return gioi_tinh;
    }

    public String Nhapsdt() throws IOException {
        sdt = kiemtradulieu.KiemTraNhapSoDienThoai();;
        return sdt;
    }
     public String Nhapgmail() throws IOException {
        gmail = kiemtradulieu.KiemTraNhapgmail();;
        return gmail;
    }

    public void HienThiThongTin() {
        System.out.format("%-27s|%-19s|%-14s|%-23s|%-48s|\n", "     " + dia_chi, "     " + ho_ten, "     " + ngay_thang_nam_sinh, "     " + sdt, "     " + gmail);
    }

}
