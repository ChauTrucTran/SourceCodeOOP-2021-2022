
package PROJECT;

import java.util.Scanner;

/**
 *
 * @author TRUC
 */
public class PHIEU_BAN {
    Scanner sc = new Scanner(System.in);
    protected String Ma_NV;
    protected String Ma_PB;
    protected DATE Ngay_ban;
    public PHIEU_BAN(){
        Ma_NV=null;
        Ma_PB=null;
        Ngay_ban=null;
        
        
    }
    public PHIEU_BAN(String Ma_PB,String Ma_NV, DATE Ngay_ban) {
        this.Ma_NV = Ma_NV;
        this.Ma_PB = Ma_PB;
        this.Ngay_ban = Ngay_ban;

    }
    public String getMa_NV() {
        return Ma_NV;
    }
    public String getMa_PB() {
        return Ma_PB;
    }
    
    public DATE getNgay_ban() {
        return Ngay_ban;
    }
    
    

   
    public void setMa_NV(String Ma_NV) {
        this.Ma_NV = Ma_NV;
    }
    public void setMa_PB(String Ma_PB) {
        this.Ma_PB = Ma_PB;
    }

    public void setNgay_ban(DATE Ngay_ban) {
        this.Ngay_ban = Ngay_ban;
    }
    

    
    public void Nhap(){
        System.out.println("Nhập mã nhân viên tiếp nhận: ");
        Ma_NV = sc.nextLine();
        System.out.println("Nhập mã phiếu bán: ");
        Ma_PB = sc.nextLine();
        System.out.println("Nhập ngày bán: ");
        Ngay_ban=new DATE();
        Ngay_ban.Nhap();
    }
    public void Xuat(){  
           System.out.printf("%-25s%-20s%-20s%-20s%-20s%-50s%-25s\n",Ma_PB,Ma_NV,Ngay_ban.ngay,Ngay_ban.thang,Ngay_ban.nam);
    }
    public void Xuat_ds_PB(){
        System.out.println("+---------------------------------------Danh sách phiếu bán đã tìm kiếm----------------------------------------------------+");
        System.out.printf("%-25s%-20s%-20s%-20s%-20s%-50s%-25s\n","Mã PB","Mã NV","Ngày bán","Tháng bán","Năm bán");
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.printf("%-25s%-20s%-20s%-20s%-20s%-50s%-25s\n",Ma_PB,Ma_NV,Ngay_ban.ngay,Ngay_ban.thang,Ngay_ban.nam);
    }
    public static void main(String[] args){
        PHIEU_BAN a=new PHIEU_BAN();
        a.Nhap();
        a.Xuat();
    }


    void setNgay_ban(String Ngay_ban_moi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setThang_ban(String Thang_ban_moi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setNam_ban(String Nam_ban_moi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

