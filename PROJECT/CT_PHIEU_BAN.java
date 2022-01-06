
package PROJECT;
import java.util.Scanner;

/**
 *
 * @author TRUC
 */
public class CT_PHIEU_BAN extends PHIEU_BAN{
    Scanner sc = new Scanner(System.in);
    protected int So_luong_ban;
    protected int Don_gia_ban;
    protected String Ma_TL;
    protected String Ma_sach;
    protected int Thanh_tien;
    public CT_PHIEU_BAN(){
        So_luong_ban=0;
        Don_gia_ban=0;
        Ma_PB=null;
        Ma_TL=null;
        Ma_sach=null;
        Thanh_tien=0;
    }
    public CT_PHIEU_BAN(int So_luong_ban, int Don_gia_ban,String Ma_PB, String Ma_TL, String Ma_sach, int Thanh_tien) {
        this.So_luong_ban = So_luong_ban;
        this.Don_gia_ban = Don_gia_ban;
        this.Ma_PB = Ma_PB;
        this.Ma_TL = Ma_TL;
        this.Ma_sach = Ma_sach;
        this.Thanh_tien = Thanh_tien;
    }
    public int getSo_luong_ban() {
        return So_luong_ban;
    }
    
    public int getDon_gia_ban() {
        return Don_gia_ban;
    }
   
     
    public String getMa_TL() {
        return Ma_TL;
    }
    public String getMa_sach() {
        return Ma_sach;
    }
    
    public int getThanh_tien() {
        return Thanh_tien;
    }
    
    public void setSo_luong_ban(int So_luong_ban) {
        this.So_luong_ban = So_luong_ban;
    }

    public void setDon_gia_ban(int Don_gia_ban) {
        this.Don_gia_ban = Don_gia_ban;
    }
    
    public void setMa_TL(String Ma_TL) {
        this.Ma_TL = Ma_TL;
    }
    public void setMa_sach(String Ma_sach) {
        this.Ma_sach = Ma_sach;
    }
   
    public void setThanh_tien(int Thanh_tien) {
        this.Thanh_tien = Thanh_tien;
    }
    @Override
    public void Nhap(){
        System.out.println("Nhập mã phiếu bán: ");
        Ma_PB = sc.nextLine();
        System.out.println("Nhập Mã TL : ");
        Ma_TL = sc.nextLine();
        System.out.println("Nhập mã sách: ");
        Ma_sach = sc.nextLine();
        System.out.println("Nhập mã nhân viên tiếp nhận: ");
        Ma_NV = sc.nextLine();
        System.out.println("Nhập ngày bán: ");
        Ngay_ban=new DATE();
        Ngay_ban.Nhap();
       
        System.out.println("Số lượng bán: ");
        So_luong_ban = sc.nextInt();
        System.out.println("Đơn giá bán: ");
        Don_gia_ban = sc.nextInt();

        System.out.println("Thành tiền: ");
        Thanh_tien = So_luong_ban*Don_gia_ban;
    }
    @Override
    public void Xuat(){  
           System.out.printf("%-25s%-25s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-25s\n",Ma_PB,Ma_TL,Ma_sach,Ma_NV,Ngay_ban.ngay,Ngay_ban.thang,Ngay_ban.nam,So_luong_ban,Don_gia_ban,Thanh_tien);
    }
    public static void main(String[] args){
        CT_PHIEU_BAN a=new CT_PHIEU_BAN();
        a.Nhap();
        a.Xuat();
    }
}
