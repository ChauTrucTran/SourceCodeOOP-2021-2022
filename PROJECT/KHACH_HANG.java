/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROJECT;

/**
 *
 * @author HP
 */
public class KHACH_HANG extends CON_NGUOI {
    public String ma_KH;
    //public static String email="abc123@gmail.com";
    
    public KHACH_HANG(){
        super();
        ma_KH = "";
    }
    public KHACH_HANG(String ma_KH, String ho_ten, String gioi_tinh, DATE ngay_thang_nam_sinh, String dia_chi, String sdt, String email){
        this.ma_KH = ma_KH;
        this.ho_ten = ho_ten;
        this.gioi_tinh = gioi_tinh;
        this.ngay_thang_nam_sinh = ngay_thang_nam_sinh;
        this.dia_chi = dia_chi;
        this.sdt = sdt;
        this.email = email;
        
    }

    public String getMa_KH() {
        return ma_KH;
    }

    public void setMa_KH(String ma_KH) {
        this.ma_KH = ma_KH;
    }
    
    public void setMa_KH(){
        System.out.println("Mời bạn nhập mã KH: ");
        ma_KH = inp.nextLine();
    }
    public void Nhap_KH(){
        
        setMa_KH();
        setHo_ten();
        setGioi_tinh();
        setNgay_thang_nam_sinh();
        setDia_chi();
        setSdt();
        setEmail();
    }
    
    public void Xuat_KH(){
            System.out.printf("%-25s%-30s%-10s%-10s%-10s%-30s%-10s%-25s%-50s\n",ma_KH,ho_ten,ngay_thang_nam_sinh.ngay,ngay_thang_nam_sinh.thang,ngay_thang_nam_sinh.nam,gioi_tinh, dia_chi, sdt, email);    
        
    }
    /*
    public static void main (String [] args){
        KHACH_HANG a = new KHACH_HANG();
        a.Nhap();
        a.Xuat();
    }*/
    
    public void Xuat_ds_tk(){
        System.out.println("+---------------------------------------Danh sách sách đã tìm kiếm----------------------------------------------------+");
        System.out.printf("%-25s%-30s%-30s%-30s%-10s%-25s%-50s\n","Mã KH","Họ tên KH","Ngày sinh","Giới tính","Địa chỉ", "Số điện thoại", "Địa chỉ email");
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.printf("%-25s%-30s%-10s%-10s%-10s%-30s%-25s%-50s\n",ma_KH,ho_ten,ngay_thang_nam_sinh.ngay,ngay_thang_nam_sinh.thang,ngay_thang_nam_sinh.nam,gioi_tinh, dia_chi, sdt, email);
    }
}
