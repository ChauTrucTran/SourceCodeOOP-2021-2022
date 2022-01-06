
package PROJECT;
import java.util.Scanner;

/**
 *
 * @author TRUC
 */
public class CT_PHIEU_NHAP extends PHIEU_NHAP{
    Scanner sc = new Scanner(System.in);
    protected int So_luong_nhap;
    protected int Don_gia_nhap;
    protected int Ma_PN;
    protected int Ma_TL;
    protected int Ma_sach;
    protected int Thanh_tien;
    //PHIEU_NHAP PN= new PHIEU_NHAP();
    public CT_PHIEU_NHAP(){
        NXB=null;
        Ngay_nhap=null;  
        So_luong_nhap=0;
        Don_gia_nhap=0;
        Ma_PN=0;
        Ma_TL=0;
        Ma_sach=0;
        Thanh_tien=0;
    }
    public CT_PHIEU_NHAP(int So_luong_nhap, int Don_gia_nhap,int Ma_PN, int Ma_TL, int Ma_sach, int Thanh_tien,DATE Ngay_nhap, String NXB) {
        this.So_luong_nhap = So_luong_nhap;
        this.Don_gia_nhap = Don_gia_nhap;
        this.Ma_PN = Ma_PN;
        this.Ma_TL = Ma_TL;
        this.Ma_sach = Ma_sach;
        this.Thanh_tien = Thanh_tien;
        this.Ngay_nhap = Ngay_nhap;
        this.NXB = NXB;
    }
    public int getSo_luong_nhap() {
        return So_luong_nhap;
    }
    
    public int getDon_gia_nhap() {
        return Don_gia_nhap;
    }
     
    public int getMa_TL() {
        return Ma_TL;
    }
    public double getMa_sach() {
        return Ma_sach;
    }

    public int getThanh_tien() {
        return Thanh_tien;
    }
    
    public void setSo_luong_nhap(int So_luong_nhap) {
        this.So_luong_nhap = So_luong_nhap;
    }

    public void setDon_gia_nhap(int Don_gia_nhap) {
        this.Don_gia_nhap = Don_gia_nhap;
    }
    
    public void setMa_PN(int Ma_PN) {
        this.Ma_PN = Ma_PN;
    }
    
    public void setMa_TL(int Ma_TL) {
        this.Ma_TL = Ma_TL;
    }
    public void setMa_sach(int Ma_sach) {
        this.Ma_sach = Ma_sach;
    }

    public void setThanh_tien(int Thanh_tien) {
        this.Thanh_tien = Thanh_tien;
    }
    @Override
    public void Nhap(){
        System.out.println("Nhập mã phiếu nhập: ");
        Ma_PN = sc.nextInt();
        System.out.println("Nhập mã TL : ");
        Ma_TL = sc.nextInt();
        System.out.println("Nhập mã sách: ");
        Ma_sach = sc.nextInt();  
        System.out.println("Ngày nhập: ");
        Ngay_nhap = new DATE();
        Ngay_nhap.Nhap();
        System.out.println("Nhập nhà xuất bản: ");
        NXB = sc.nextLine();   
        NXB = sc.nextLine(); 
        System.out.println("Số lượng nhập: ");
        So_luong_nhap = sc.nextInt();
        System.out.println("Đơn giá nhập: ");
        Don_gia_nhap = sc.nextInt();
        System.out.println("Thành tiền: ");
        Thanh_tien = So_luong_nhap*Don_gia_nhap;
    }
    @Override
    public void Xuat(){  
           System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n",Ma_PN,Ma_TL,Ma_sach,Ngay_nhap.ngay,Ngay_nhap.thang,Ngay_nhap.nam,NXB,So_luong_nhap,Don_gia_nhap,Thanh_tien);
    }
    public static void main(String[] args){
        CT_PHIEU_NHAP a=new CT_PHIEU_NHAP();
        a.Nhap();
        a.Xuat();
    }
}
