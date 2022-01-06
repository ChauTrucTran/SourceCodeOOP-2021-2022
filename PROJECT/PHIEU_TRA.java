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
public class PHIEU_TRA implements itf_thue_tra{
    protected int soluongTra;
    protected String Ma_KH;
    protected String Ma_sach;
    protected DATE ngayTra;
    protected int thoigianThue;
    protected String tinhtrangTra;
    protected String xuphat;
    protected String MaPTR;
    protected  DATE Ngay_BD;
    Scanner inp=new Scanner(System.in);


    public PHIEU_TRA() {
        MaPTR=null;
        soluongTra = 0;
        Ma_KH = null;
        Ma_sach = null;
        ngayTra = null;
        thoigianThue = 0;
        tinhtrangTra = null;
        xuphat = null;
        Ngay_BD= null;
    }
    
    public PHIEU_TRA(int soluongTra, String maKhach, String maSach, DATE ngayTra,  int thoigianThue, String tinhtrangTra, String xuphat,String MaPTR,DATE ngay_BD) {
        this.soluongTra = soluongTra;
        this.Ma_KH = maKhach;
        this.Ma_sach = maSach;
        this.ngayTra = ngayTra;
        this.thoigianThue = thoigianThue;
        this.tinhtrangTra = tinhtrangTra;
        this.xuphat = xuphat;
        this.MaPTR=MaPTR;
        this.Ngay_BD=ngay_BD;
    }
    
    public void setMaPTR(String MaPTR) {
        this.MaPTR = MaPTR;
    }

    public String getMaPTR() {
        return MaPTR;
    }
    public void setMaPTR() {
        System.out.println("Mời bạn nhập mã phiếu trả:");
        MaPTR = inp.nextLine();
    }
    public int getSoluongTra() {
        return soluongTra;
    }
    public void setSoluongTra(int soluongTra) {
        this.soluongTra = soluongTra;
    }
    public void setSoluongThue()
    {
        System.out.println("Mời bạn nhập số lượng trả:");
        soluongTra = inp.nextInt();
    }
    
    public String getMa_KH() {
        return Ma_KH;
    }
    public void setMa_KH(String maKhach) {
        this.Ma_KH = maKhach;
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
    public DATE getNgayTra() {
        return ngayTra;
    }
    public void setNgayTra(DATE ngayTra) {
        this.ngayTra = ngayTra;
    }
    public void setNgayTra()
    {
        System.out.println("Mời bạn nhập ngày trả :");
        ngayTra=new DATE();
        ngayTra.Nhap();
        
    }
   
    public int getThoigianThue() {
        return thoigianThue;
    }
    public void setThoigianThue(int thoigianThue) {
        this.thoigianThue = thoigianThue;
    }
    public void setThoigianThue()
    {
        System.out.println("Mời bạn nhập thời gian thuê :");
        thoigianThue= inp.nextInt();
    }
    public String getTinhtrangTra() {
        return tinhtrangTra;
    }
    public void setTinhtrangTra(String tinhtrangTra) {
        this.tinhtrangTra = tinhtrangTra;
    }
    public void setTinhtrangTra()
    {
        System.out.println("Mời bạn nhập tình trạng trả :");
        tinhtrangTra= inp.nextLine();
    }
    public String Xuphat() {
        return xuphat;
    }
    public void setXuphat(String xuphat) {
        this.xuphat = xuphat;
    }
    public void setXuphat()
    {
        System.out.println("Hình thức xử phạt: ");
        xuphat= inp.nextLine();
        xuphat= inp.nextLine();
    }

    public DATE getNgay_BD() {
        return Ngay_BD;
    }

    public void setNgay_BD(DATE Ngay_BD) {
        this.Ngay_BD = Ngay_BD;
    }
    @Override
    public void Nhap(){
        setMaPTR();
        setMa_KH();
        setMa_sach();
        setNgayTra();
        setSoluongThue();
        setThoigianThue();
        setXuphat();
        setTinhtrangTra();

    }
    @Override
    public void Xuat(){
        System.out.println("+------------------Thông tin mà bạn vừa nhập---------------------+");
        System.out.printf("%-20s%-20s%-20s%-30s%-20s%-20s%-20s%-30s\n","Mã phiếu trả","Mã khách hàng","Mã sách","Ngày trả","Số lượng trả","Thời gian thuê","Tình trạng trả" ,"Xử phạt");
        System.out.printf("%-20s%-20s%-20s%-10s%-10s%-10s%-20s%-20s%-20s%-30s\n",MaPTR,Ma_KH,Ma_sach,ngayTra.ngay,ngayTra.thang,ngayTra.nam,soluongTra,thoigianThue,tinhtrangTra,xuphat);        
    }
    public void Xuat_PhieuTra(){
        System.out.printf("%-20s%-20s%-20s%-10s%-10s%-10s%-20s%-20s%-20s%-30s\n",MaPTR,Ma_KH,Ma_sach,ngayTra.ngay,ngayTra.thang,ngayTra.nam,soluongTra,thoigianThue,tinhtrangTra,xuphat);
    }
   
    public void Xuat_ds_ptr(){
        System.out.println("+---------------------------------------Danh sách sách đã tìm kiếm----------------------------------------------------+");
        System.out.printf("%-20s%-20s%-20s%-30s%-20s%-20s%-20s%-30s\n","Mã phiếu trả","Mã khách hàng","Mã sách","Ngày trả","Số lượng trả","Thời gian thuê","Tình trạng trả" ,"Xử phạt");
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.printf("%-20s%-20s%-20s%-10s%-10s%-10s%-20s%-20s%-20s%-30s\n",MaPTR,Ma_KH,Ma_sach,ngayTra.ngay,ngayTra.thang,ngayTra.nam,soluongTra,thoigianThue,tinhtrangTra,xuphat);
    }
public static void main (String [] args){
    PHIEU_TRA A = new PHIEU_TRA();
     A.Nhap();
     A.Xuat();
 }

   
}
    
