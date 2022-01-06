package CodeMau;

import java.io.IOException;

public class KhachHang extends ConNguoi {

    private int TrangThai;
    private String MaKhachHang;

    public String getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(String MaKhachHang) {
        this.MaKhachHang = MaKhachHang;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    public KhachHang() {
    }

    public KhachHang(int TrangThai, String MaKhachHang, String DiaChi, String HoTen, String NgaySinh, String Phai, String SoDienThoai) {
        super(DiaChi, HoTen, NgaySinh, Phai, SoDienThoai);
        this.TrangThai = TrangThai;
        this.MaKhachHang = MaKhachHang;
    }

    public boolean NhapThongTinKhachHang() throws IOException {
        String NgaySinh;
        System.out.print("Nhập họ tên khách hàng: ");
        String HoTen = super.NhapHoTen();
        if (HoTen.equals("-q")) {
            return false;
        }
        System.out.print("Nhập ngày sinh: ");
        while (true) {
            NgaySinh = super.NhapNgaySinh();
            if (NgaySinh.equals("-q")) {
                return false;
            }
            if (kiemtradulieu.KiemTraTuoiHopLe(NgaySinh)) {
                break;
            } else {
                System.out.print("Khách hàng phải đủ 18 tuổi ! Mời nhập lại: ");
            }
        }

        System.out.println("Phái: 1.Nam   2.Nữ");
        System.out.print("Nhập lựa chọn: ");
        String Phai = super.NhapPhai();
        if (Phai.equals("-q")) {
            return false;
        }
        System.out.print("Nhập số điện thoại: ");
        String SoDienThoai = super.NhapSoDienThoai();
        if (SoDienThoai.equals("-q")) {
            return false;
        }
        System.out.print("Nhập địa chỉ: ");
        String DiaChi = super.NhapDiaChi();
        if (DiaChi.equals("-q")) {
            return false;
        }
        return true;
    }

    public void HienThiThongTinKhachHang() {
        System.out.format("|%-23s|", "     " + MaKhachHang);
        super.HienThiThongTin();
    }

}
