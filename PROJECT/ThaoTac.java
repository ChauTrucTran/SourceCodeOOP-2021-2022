package PROJECT;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ThaoTac {

    Random random = new Random();
    static Calendar calendar = Calendar.getInstance();
    private final int NgayHienTai = calendar.get(Calendar.DATE);
    private final int ThangHienTai = calendar.get(Calendar.MONTH) + 1;
    private final int NamHienTai = calendar.get(Calendar.YEAR);
    Scanner scanner = new Scanner(System.in);

    public String ChuanHoaChuoi(String DauVao) {
        DauVao = DauVao.replaceAll(";", "");
        DauVao = DauVao.toLowerCase();
        String[] Chuoi = DauVao.split(" ");
        DauVao = "";
        for (int i = 0; i < Chuoi.length; i++) {
            DauVao += String.valueOf(Chuoi[i].charAt(0)).toUpperCase() + Chuoi[i].substring(1);
            if (i < Chuoi.length - 1) {
                DauVao += " ";
            }
        }
        return DauVao;
    }

    public String ChuanHoaDiaChi(String DiaChi) {
        DiaChi = ChuanHoaChuoi(DiaChi);
        DiaChi = XoaKhoangTrangThua(DiaChi);
        DiaChi = DiaChi.replaceAll("Đường Số", "đường số");
        DiaChi = DiaChi.replaceAll("Phường", "phường");
        DiaChi = DiaChi.replace("Quận", "quận");
        HashMap<Integer, String> hashmap = new HashMap<>();
        StringTokenizer stringtokenizer = new StringTokenizer(DiaChi, " ");
        int Dem = 0;
        while (stringtokenizer.hasMoreTokens()) {
            hashmap.put(Dem, stringtokenizer.nextToken());
            Dem++;
        }
        DiaChi = hashmap.get(0).toUpperCase();
        for (int i = 1; i < Dem; i++) {
            if (i < Dem) {
                DiaChi += " ";
            }
            if (hashmap.get(i).matches("[0-9]{1}")) {
                DiaChi += "0" + hashmap.get(i);
            } else {
                DiaChi += hashmap.get(i);
            }
        }
        return DiaChi;
    }

    public String ChuanHoaNgayThang(String NgayThang) {
        HashMap<Integer, String> hashmap = TachNgayThang(NgayThang);
        int Ngay = Integer.parseInt(hashmap.get(0));
        int Thang = Integer.parseInt(hashmap.get(1));
        int Nam = Integer.parseInt(hashmap.get(2));
        String ngay = "";
        String thang = "";
        if (Ngay < 10) {
            ngay += "0";
        }
        if (Thang < 10) {
            thang += "0";
        }
        return ngay + String.valueOf(Ngay) + "/" + thang + String.valueOf(Thang) + "/" + String.valueOf(Nam);
    }

    public int DemKhoangTrang(String DauVao) {
        DauVao = XoaKhoangTrangThua(DauVao);
        char[] Chuoi = DauVao.toCharArray();
        int Dem = 0;
        for (int i = 0; i < Chuoi.length; i++) {
            if (Chuoi[i] == ' ') {
                Dem++;
            }
        }
        return Dem;
    }
    
    public void KeVienDanhSachKhachHang() {
        System.out.print("+");
        for (int i = 0; i < 23; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < 27; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < 19; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < 14; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < 23; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < 48; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        System.out.println("");
    }
    
    public HashMap TachNgayThang(String NgayThang) {
        int Dem = 0;
        HashMap<Integer, String> hashmap = new HashMap<>();
        StringTokenizer stringtokenizer = new StringTokenizer(NgayThang, "/");
        while (stringtokenizer.hasMoreTokens()) {
            hashmap.put(Dem, stringtokenizer.nextToken());
            Dem++;
        }
        return hashmap;
    }

    public void TiepTuc() {
        String DauVao;
        System.out.print("Nhấn Enter để tiếp tục...");
        DauVao = scanner.nextLine();
    }

    public String XoaKhoangTrangThua(String DauVao) {
        DauVao = DauVao.trim();
        DauVao = DauVao.replaceAll("\\s+", " ");
        return DauVao;
    }

}
