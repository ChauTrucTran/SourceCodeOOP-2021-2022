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
public class TAC_GIA extends CON_NGUOI {
    protected String ma_TG;
    protected String note;
    
    public TAC_GIA(){
        super();
        ma_TG = "";
        note = "";
    }
    public TAC_GIA(String ma_TG, String ho_ten, String gioi_tinh, DATE ngay_thang_nam_sinh, String dia_chi, String sdt, String email, String note){
        this.ma_TG = ma_TG;
        this.ho_ten = ho_ten;
        this.gioi_tinh = gioi_tinh;
        this.ngay_thang_nam_sinh = ngay_thang_nam_sinh;
        this.dia_chi = dia_chi;
        this.sdt = sdt;
        this.email = email;
        this.note = note;
        
    }

    public String getMa_TG() {
        return ma_TG;
    }

    public void setMa_TG(String ma_TG) {
        this.ma_TG = ma_TG;
    }
    
    public void setMa_TG(){
        System.out.println("Mời bạn nhập mã tác giả: ");
        ma_TG = inp.nextLine();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    public void setNote(){
        System.out.println("Mời bạn nhập ghi chú: ");
        note = inp.nextLine();
    }
    
    public void Nhap_TG(){
        
        setMa_TG();
        setHo_ten();
        setGioi_tinh();
        setNgay_thang_nam_sinh();
        setDia_chi();
        setSdt();
        setEmail();
        setNote();
    }
    
    public void Xuat_TG(){
        System.out.printf("%-12s%-20s%-12s%-30s%-12s%-12s%-12s%-12s\n","Mã TG","Họ tên TG","Giới tính","Ngày sinh","Địa chỉ", "Số điện thoại", "Địa chỉ email", "Ghi chú");
        System.out.printf("%-12s%-20s%-12s%-10s%-10s%-10s%-12s%-12s%-12s%-12s\n",ma_TG,ho_ten,gioi_tinh,ngay_thang_nam_sinh.ngay,ngay_thang_nam_sinh.thang,ngay_thang_nam_sinh.thang, dia_chi, sdt, email, note);   
    }
    /*
    public static void main (String [] args){
        TAC_GIA a = new TAC_GIA();
        a.Nhap();
        a.Xuat();
    }*/
    
    public void Xuat_ds_tk(){
        System.out.println("+---------------------------------------Danh sách sách đã tìm kiếm----------------------------------------------------+");
        System.out.printf("%-12s%-20s%-12s%-30s%-12s%-12s%-12s%-12s\n","Mã TG","Họ tên TG","Giới tính","Ngày sinh","Địa chỉ", "Số điện thoại", "Địa chỉ email", "Ghi chú");
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.printf("%-12s%-20s%-12s%-10s%-10s%-10s%-12s%-12s%-12s%-12s\n",ma_TG,ho_ten,gioi_tinh,ngay_thang_nam_sinh.ngay,ngay_thang_nam_sinh.thang,ngay_thang_nam_sinh.thang, dia_chi, sdt, email, note);
    }
}
