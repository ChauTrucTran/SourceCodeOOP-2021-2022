/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROJECT;
import java.util.Scanner;
//import java.sql.Date;

/**
 *
 * @author Gaara
 */
public class PHIEU_THUE implements itf_thue_tra{
    protected int soluongThue;
    protected String Ma_KH;
    protected String Ma_sach;
    protected DATE ngayThue;
    protected int thoigianThue;
    protected int giaTien;
    protected String tinhtrangThue;
    protected String MaPTH;
    Scanner inp=new Scanner(System.in);

    public PHIEU_THUE() {
       soluongThue = 0;
        Ma_KH = null;
        Ma_sach = null;
        ngayThue = null;
        thoigianThue = 0;
        giaTien = 0;
        tinhtrangThue = null;
        MaPTH=null;
    }
    
    public PHIEU_THUE(String MaPTH,int soluongThue, String Ma_KH, String maSach, DATE ngayThue, int thoigianThue, int giaTien, String tinhtrangThue) {
        this.MaPTH = MaPTH;
        this.soluongThue = soluongThue;
        this.Ma_KH = Ma_KH;
        this.Ma_sach = maSach;
        this.ngayThue = ngayThue;
        this.thoigianThue = thoigianThue;
        this.giaTien = giaTien;
        this.tinhtrangThue = tinhtrangThue;
    }

    public String getMaPTH() {
        return MaPTH;
    }
    
    public void setMaPTH(String MaPTH) {
        this.MaPTH = MaPTH;
    }
    public void setMaPTH() {
        System.out.println("Mời bạn nhập mã phiếu thuê:");
        MaPTH = inp.nextLine();
    }
    public int getSoluongThue() {
        return soluongThue;
    }
    public void setSoluongThue(int soluongThue) {
        this.soluongThue = soluongThue;
    }
    public void setSoluongThue()
    {
        System.out.println("Mời bạn nhập số lượng thuê:");
        soluongThue = inp.nextInt();
    }
    
    public String getMa_KH() {
        return Ma_KH;
    }
    public void setMa_KH(String Ma_KH) {
        this.Ma_KH = Ma_KH;
    }
    public void setMa_KH()
    {
        System.out.println("Mời bạn nhập mã khách hàng:");
        Ma_KH = inp.nextLine();
    }
    public String getMa_sach() {
        return Ma_sach;
    }
    public void setMa_sach(String maSach) {
        this.Ma_sach = maSach;
    }
    public void setMa_sach()
    {
        System.out.println("Mời bạn nhập mã sách:");
        Ma_sach= inp.nextLine();
    }
    public DATE getNgayThue() {
        return ngayThue;
    }
    
    public void setNgayThue(DATE ngayThue) {
        this.ngayThue = ngayThue;
    }
    
    public void setNgayThue() {
        ngayThue =new DATE();
        ngayThue.Nhap(); 
    }
    
    public int getThoigianThue() {
        return thoigianThue;
    }
    public void setThoigianThue(int thoigianThue) {
        this.thoigianThue = thoigianThue;
    }
    public void setThoigianThue()
    {
        System.out.println("Mời bạn nhập thời gian thuê (ngày):");
        thoigianThue=inp.nextInt();
    }
    public String getTinhtrangThue() {
        return tinhtrangThue;
    }
    public void setTingtrangThue(String tinhtrangThue) {
        this.tinhtrangThue = tinhtrangThue;
    }
    public void setTingtrangThue()
    {
        System.out.println("Mời bạn nhập tình trạng thuê :");
        tinhtrangThue= inp.nextLine();
        tinhtrangThue= inp.nextLine();
    }
    public int GiaTien() {
        return giaTien;
    }
    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }
    public void setGiaTien()
    {
        System.out.println("Mời bạn nhập giá tiền :");
        giaTien= inp.nextInt();
    }
    @Override
    public void Nhap(){
        setMaPTH() ;
        setMa_KH();
        setMa_sach();
        setNgayThue();
        setSoluongThue();
        setThoigianThue();
        setGiaTien();
        setTingtrangThue();
    }
    @Override
    public void Xuat(){
        System.out.println("+------------------Thông tin mà bạn vừa nhập---------------------+");
        System.out.printf("%-20s%-20s%-20s%-30s%-20s%-20s%-20s%-30s\n","Mã phiếu thuê","Mã khách hàng","Mã sách","Ngày thuê","Số lượng thuê","Thời gian thuê","Giá tiền","Tình trạng thuê" );
        System.out.printf("%-20s%-20s%-20s%-10s%-10s%-10s%-20s%-20s%-20s%-30s\n",MaPTH,Ma_KH,Ma_sach,ngayThue.ngay,ngayThue.thang,ngayThue.nam,soluongThue,thoigianThue,giaTien,tinhtrangThue);
    }
    public void Xuat_PhieuThue(){
        System.out.printf("%-20s%-20s%-20s%-10s%-10s%-10s%-20s%-20s%-20s%-30s\n",MaPTH,Ma_KH,Ma_sach,ngayThue.ngay,ngayThue.thang,ngayThue.nam,soluongThue,thoigianThue,giaTien,tinhtrangThue);
    }
   
    public void Xuat_ds_pt(){
        System.out.println("+---------------------------------------Danh sách sách đã tìm kiếm----------------------------------------------------+");
        System.out.printf("%-20s%-20s%-20s%-30s%-20s%-20s%-20s%-30s\n","Mã phiếu thuê","Mã khách hàng","Mã sách","Ngày thuê","Số lượng thuê","Thời gian thuê","Giá tiền","Tình trạng thuê" );
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.printf("%-20s%-20s%-20s%-10s%-10s%-10s%-20s%-20s%-20s%-30s\n",MaPTH,Ma_KH,Ma_sach,ngayThue.ngay,ngayThue.thang,ngayThue.nam,soluongThue,thoigianThue,tinhtrangThue,giaTien);
    }
public static void main (String [] args){
    PHIEU_THUE A = new PHIEU_THUE();
     A.Nhap();
     A.Xuat();
 }
}