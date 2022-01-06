
package PROJECT;

import java.util.Scanner;

/**
 *
 * @author TRUC
 */
public class PHIEU_NHAP {
    Scanner sc = new Scanner(System.in);
    protected String Ma_PN;
    protected DATE Ngay_nhap;
    protected String NXB;
    //PHIEU_NHAP ctpn=new CT_PHIEU_NHAP();
    //CT_PHIEU_NHAP CTPN = (CT_PHIEU_NHAP) ctpn;//down
    public PHIEU_NHAP(){
        Ma_PN=null;
        Ngay_nhap=null;
        NXB=null;
    }

    public PHIEU_NHAP(String Ma_PN, DATE Ngay_nhap, String NXB) {
        this.Ma_PN = Ma_PN;
        this.Ngay_nhap = Ngay_nhap;
        this.NXB = NXB;
    }
    
    public String getMa_PN() {
        return Ma_PN;
    }
    
    public DATE getNgay_nhap() {
        return Ngay_nhap;
    }
   
    public String getNXB() {
        return NXB;
    }
    
    public void setMa_PN(String Ma_PN) {
        this.Ma_PN = Ma_PN;
    }

    public void setNgay_nhap(DATE Ngay_nhap) {
        this.Ngay_nhap = Ngay_nhap;
    }
   
    public void setNXB(String NXB) {
         this.NXB = NXB;
    }
    
    public void Nhap(){
        System.out.println("Nhập mã phiếu nhập: ");
        Ma_PN = sc.nextLine();
        System.out.println("Ngày nhập: ");
        Ngay_nhap = new DATE();
        Ngay_nhap.Nhap();
        System.out.println("Nhập nhà xuất bản: ");
        NXB = sc.nextLine();
       //CTPN.Nhap_PN();//down
    }
   
    public void Xuat(){  
           System.out.printf("%-25s%-20s%-20s%-20s%-20s\n",Ma_PN,Ngay_nhap.ngay,Ngay_nhap.thang,Ngay_nhap.nam,NXB/*,CTPN.Ma_TL,CTPN.Ma_sach,CTPN.So_luong_nhap,CTPN.Don_gia_nhap,CTPN.Thanh_tien*/);       
    }
    public static void main(String[] args){
        PHIEU_NHAP a=new CT_PHIEU_NHAP();
        a.Nhap();
        a.Xuat();
    }
}
