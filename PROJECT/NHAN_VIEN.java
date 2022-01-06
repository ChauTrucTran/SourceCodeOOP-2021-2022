/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROJECT;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class NHAN_VIEN extends CON_NGUOI{
    protected String ma_NV;
    protected float so_gio_lam_viec;
    protected int so_ngay_nghi;
    Scanner sc=new Scanner(System.in);
    public NHAN_VIEN(){
        super();
        ma_NV = "";
        so_gio_lam_viec = 0.0f;
        so_ngay_nghi = 0;
        
    }
    
    public NHAN_VIEN(String ma_NV, String ho_ten, String gioi_tinh, DATE ngay_thang_nam_sinh, String dia_chi, String sdt, String email, float so_gio_lam_viec, int so_ngay_nghi){
        this.ma_NV = ma_NV;
        this.ho_ten = ho_ten;
        this.gioi_tinh = gioi_tinh;
        this.ngay_thang_nam_sinh = ngay_thang_nam_sinh;
        this.dia_chi = dia_chi;
        this.sdt = sdt;
        this.email = email;
        this.so_gio_lam_viec = so_gio_lam_viec;
        this.so_ngay_nghi = so_ngay_nghi;
        
    }

    public String getMa_NV() {
        return ma_NV;
    }

    public void setMa_NV(String ma_NV) {
        this.ma_NV = ma_NV;
    }
    
    public void setMa_NV(){
        System.out.println("Mời bạn nhập mã NV: ");
        ma_NV = inp.nextLine();
    }

    public Float getSo_gio_lam_viec() {
        return so_gio_lam_viec;
    }

    public void setSo_gio_lam_viec(Float so_gio_lam_viec) {
        this.so_gio_lam_viec = so_gio_lam_viec;
    }

    public void setSo_gio_lam_viec() {
        System.out.println("Mời bạn nhập số giờ làm việc: ");
        so_gio_lam_viec = inp.nextFloat();
    }

    public int getSo_ngay_nghi() {
        return so_ngay_nghi;
    }

    public void setSo_ngay_nghi(int so_ngay_nghi) {
        this.so_ngay_nghi = so_ngay_nghi;
    }
    
    public void setSo_ngay_nghi() {
        System.out.println("Mời bạn nhập số ngày nghỉ: ");
        so_ngay_nghi = inp.nextInt();
    }
        

    
    public float tinh_Luong() {
        return so_gio_lam_viec * 50 - (so_ngay_nghi * 20);
    }
    
    public void Nhap_NV(){
        setMa_NV();
        setHo_ten();
        setGioi_tinh();
        setNgay_thang_nam_sinh();
        setDia_chi();
        setSdt();
        setEmail();  
        setSo_gio_lam_viec();
        setSo_ngay_nghi();
    }
    public void Xuat_NV(){    
        System.out.println("+------------------Thông tin mà bạn vừa nhập---------------------+");
        System.out.println("Mã NV: "+ ma_NV  +"\n"+"\n"+ "Họ và tên: "+ ho_ten +"\n"+"\n"+ "Giới tính: "+ gioi_tinh +"\n"+"\n"+"Ngày,tháng,năm sinh"+ngay_thang_nam_sinh.ngay+"/"+ngay_thang_nam_sinh.thang+"/"+ngay_thang_nam_sinh.nam+"\n"+"\n"+ "Địa chỉ: " + dia_chi +"\n"+"\n"+ "Số điện thoại: " + sdt +"\n"+"\n"+ "Địa chỉ email: " + email +"\n"+"\n"+ "Số giờ làm việc: " + so_gio_lam_viec +"\n"+"\n"+ "Số ngày nghỉ: " + so_ngay_nghi +"\n"+"\n"+ "Tiền lương cuối tháng: "+ this.tinh_Luong());
        //System.out.println(this.tinhLuong());
    }    
    /*
    public static void main (String[]args){
        NHAN_VIEN a = new NHAN_VIEN();
        a.Nhap();
        a.Xuat();
    }*/
    
    public void Xuat_ds_tk(){
        System.out.println("+---------------------------------------Danh sách sách đã tìm kiếm----------------------------------------------------+");
        System.out.printf("%-12s%-20s%-12s%-30s%-12s%-12s%-12s\n","Mã NV","Họ tên NV","Ngày tháng năm sinh","Địa chỉ", "Số điện thoại", "Địa chỉ email");
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.printf("%-12s%-20s%-12s%-10s%-10s%-10s%-12s%-12s%-12s\n",ma_NV,ho_ten,gioi_tinh,ngay_thang_nam_sinh.ngay,ngay_thang_nam_sinh.thang,ngay_thang_nam_sinh.nam ,dia_chi, sdt, email);
    }
  
}
