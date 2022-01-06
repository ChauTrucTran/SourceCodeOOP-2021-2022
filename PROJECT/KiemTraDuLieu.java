package PROJECT;

import java.io.IOException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Scanner;

public class KiemTraDuLieu {

    Scanner scanner = new Scanner(System.in);
    ThaoTac thaotac = new ThaoTac();
    static Calendar calendar = Calendar.getInstance();
    private final int NgayHienTai = calendar.get(Calendar.DATE);
    private final int ThangHienTai = calendar.get(Calendar.MONTH) + 1;
    private final int NamHienTai = calendar.get(Calendar.YEAR);

    public String KiemTraNhapDiaChi() {
        String dia_chi;
        while (true) {
            dia_chi = scanner.nextLine();
            dia_chi = thaotac.XoaKhoangTrangThua(dia_chi);
            if (dia_chi.equalsIgnoreCase("-q")) {
                return "-q";
            }
            dia_chi = dia_chi.toLowerCase();
            if (dia_chi.contains("phường") && dia_chi.contains("quận") && String.valueOf(dia_chi.charAt(0)).matches("[0-9]") && thaotac.DemKhoangTrang(dia_chi) > 5) {
                return thaotac.ChuanHoaDiaChi(dia_chi);
            } else {
                System.out.print("Địa chỉ không hợp lệ ! Mời nhập lại: ");
            }
        }
    }

    public String KiemTraNhapHoTen() {
        String ho_ten;
        while (true) {
            ho_ten = scanner.nextLine();
            if (ho_ten.equalsIgnoreCase("-q")) {
                return "-q";
            }
            ho_ten = thaotac.XoaKhoangTrangThua(ho_ten);
            if (ho_ten.matches("[\\pL\\pMn*\\s*]+")) {
                if (thaotac.DemKhoangTrang(ho_ten) > 0) {
                    return thaotac.ChuanHoaChuoi(ho_ten);
                } else {
                    System.out.print("Họ tên không hợp lệ ! Mời nhập lại: ");
                }
            } else {
                System.out.print("Họ tên không đúng định dạng ! Mời nhập lại: ");
            }
        }
    }

    public int KiemTraNhapLuaChon() {
        int LuaChon;
        while (true) {
            try {
                LuaChon = Integer.parseInt(scanner.nextLine());
                return LuaChon;
            } catch (NumberFormatException exception) {
                System.out.print("Lựa chọn không hợp lệ ! Mời nhập lại: ");
            }
        }
    }

    public String KiemTraNhapMaKhachHang() {
        String MaKhachHang;
        while (true) {
            MaKhachHang = scanner.nextLine();
            if (MaKhachHang.equalsIgnoreCase("-q")) {
                return "-q";
            }
            MaKhachHang = MaKhachHang.toUpperCase();
            MaKhachHang = thaotac.XoaKhoangTrangThua(MaKhachHang);
            if (MaKhachHang.matches("KH" + "[0-9]{2}")) {
                return MaKhachHang;
            } else {
                System.out.print("Mã khách hàng không đúng định dạng ! Mời nhập lại: ");
            }
        }
    }

    public String KiemTraNhapNgaySinh() {
        String ngay_thang_nam_sinh;
        while (true) {
            ngay_thang_nam_sinh = scanner.nextLine();
            if (ngay_thang_nam_sinh.equalsIgnoreCase("-q")) {
                return "-q";
            }
            if (ngay_thang_nam_sinh.matches("[0-9]{1,2}" + "/" + "[0-9]{1,2}" + "/" + "[0-9]{4}")) {
                if (KiemTraNhapNgayThangHopLe(ngay_thang_nam_sinh)) {
                    return thaotac.ChuanHoaNgayThang(ngay_thang_nam_sinh);
                } else {
                    System.out.print("Ngày sinh không hợp lệ ! Mời nhập lại: ");
                }
            } else {
                System.out.print("Ngày sinh không đúng định dạng ! Mời nhập lại: ");
            }
        }
    }

    public String KiemTraNhapNgayThang() {
        String NgayThang;
        while (true) {
            NgayThang = scanner.nextLine();
            if (NgayThang.equalsIgnoreCase("-q")) {
                return "-q";
            }
            if (NgayThang.matches("[0-9]{1,2}" + "/" + "[0-9]{1,2}" + "/" + "[0-9]{4}")) {
                if (KiemTraNhapNgayThangHopLe(NgayThang)) {
                    return thaotac.ChuanHoaNgayThang(NgayThang);
                } else {
                    System.out.print("Ngày tháng không hợp lệ ! Mời nhập lại: ");
                }
            } else {
                System.out.print("Ngày tháng không đúng định dạng ! Mời nhập lại: ");
            }
        }
    }

    public boolean KiemTraNhapNgayThangHopLe(String NgayThang) {
        HashMap<Integer, String> hashmap = thaotac.TachNgayThang(NgayThang);
        int Ngay = Integer.parseInt(hashmap.get(0));
        int Thang = Integer.parseInt(hashmap.get(1));
        int Nam = Integer.parseInt(hashmap.get(2));
        if (Ngay < 1 || Ngay > 31) {
            return false;
        }
        if (Thang < 1 || Thang > 12) {
            return false;
        }
        if (Nam > NamHienTai || Nam < NamHienTai - 100) {
            return false;
        }
        if (Nam == NamHienTai && Thang >= ThangHienTai && Ngay > NgayHienTai) {
            return false;
        }
        switch (Thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                if (Ngay > 31) {
                    return false;
                }
            }
            case 4:
            case 6:
            case 9:
            case 11: {
                if (Ngay > 30) {
                    return false;
                }
            }
            case 2: {
                if (Nam % 400 == 0) {
                    if (Ngay > 29) {
                        return false;
                    }
                } else {
                    if (Ngay > 28) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public String KiemTraNhapPhai() {
        int LuaChon;
        while (true) {
            LuaChon = KiemTraNhapLuaChon();
            switch (LuaChon) {
                case -1:
                    return "-q";
                case 1:
                    return "Nam";
                case 2:
                    return "Nữ";
                default: {
                    System.out.print("Lựa chọn không hợp lệ ! Mời nhập lại: ");
                    break;
                }
            }
        }
    }

    public String KiemTraNhapSoDienThoai() {
        String sdt;
        while (true) {
            sdt = scanner.nextLine();
            if (sdt.equalsIgnoreCase("-q")) {
                return "-q";
            }
            sdt = thaotac.XoaKhoangTrangThua(sdt);
            if (sdt.matches("[0-9]{10}")) {
                int[] MaTinhHopLe = {86, 96, 97, 98, 32, 33, 34, 35, 36, 37, 38, 39, 88, 91, 94, 83, 84, 85, 81, 82, 89, 90, 93, 70, 79, 77, 76, 78, 92, 56, 58};
                String MaTinh = sdt.substring(1, 3);
                for (int i = 0; i < MaTinhHopLe.length; i++) {
                    if (Integer.parseInt(MaTinh) == MaTinhHopLe[i]) {
                        return sdt;
                    }
                }
                System.out.print("Số điện thoại không hợp lệ ! Mời nhập lại: ");
            } else {
                System.out.print("Số điện thoại không đúng định dạng ! Mời nhập lại: ");
            }
        }
    }

    public String KiemTraNhapTenGanDung() {
        String Ten;
        while (true) {
            Ten = scanner.nextLine();
            if (Ten.equalsIgnoreCase("-q")) {
                return "-q";
            }
            Ten = thaotac.XoaKhoangTrangThua(Ten);
            if (Ten.matches("[\\pL\\pMn*\\s*]+")) {
                return Ten;
            } else {
                System.out.print("Tên không đúng định dạng ! Mời nhập lại: ");
            }
        }
    }

    public String KiemTraNhapXacNhan() {
        String XacNhan;
        while (true) {
            XacNhan = scanner.nextLine();
            XacNhan = thaotac.XoaKhoangTrangThua(XacNhan);
            if (XacNhan.matches("[n|y]")) {
                return XacNhan;
            } else {
                System.out.print("Lựa chọn không hợp lệ ! Mời nhập lại: ");
            }
        }
    }

    public String KiemTraSoDienThoaiDaTonTai() throws IOException {
        DanhSachKhachHang danhsachkhachhang = new DanhSachKhachHang();
        String sdt;
        while (true) {
            sdt = KiemTraNhapSoDienThoai();
            if (sdt.equals("-q")) {
                return "-q";
            }
            if (!danhsachkhachhang.KiemTraSoDienThoaiDaTonTai(sdt)) {
                return sdt;
            } else {
                System.out.print("Số điện thoại này đã có trong danh sách ! Mời nhập lại: ");
            }
        }

    }

    public boolean KiemTraTuoiHopLe(String NgayThang) {
        HashMap<Integer, String> hashmap = thaotac.TachNgayThang(NgayThang);
        int Ngay = Integer.parseInt(hashmap.get(0));
        int Thang = Integer.parseInt(hashmap.get(1));
        int Nam = Integer.parseInt(hashmap.get(2));
        if (NamHienTai - Nam > 18) {
            return true;
        } else if (NamHienTai - Nam == 18) {
            if (ThangHienTai >= Thang && NgayHienTai >= Ngay) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}
