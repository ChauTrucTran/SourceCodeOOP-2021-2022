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
public class CON_NGUOI {
    public String ho_ten;
    public String gioi_tinh;
    public DATE ngay_thang_nam_sinh;
    public String dia_chi;
    public String sdt;
    public String email;
    Scanner inp= new Scanner(System.in);
    public CON_NGUOI(){
        ho_ten = "";
        gioi_tinh = "";
        ngay_thang_nam_sinh = null;
        dia_chi = "";
        sdt = "";
        email = "";
    }
    
    public CON_NGUOI(String ho_ten, String gioi_tinh, DATE ngay_thang_nam_sinh, String dia_chi, String sdt, String email){
        this.ho_ten = ho_ten;
        this.gioi_tinh = gioi_tinh;
        this.ngay_thang_nam_sinh = ngay_thang_nam_sinh;
        this.dia_chi = dia_chi;
        this.sdt = sdt;
        this.email = email;
    }

    public String getHo_ten() {
        return ho_ten;
    }

    public void setHo_ten(String ho_ten) {
        this.ho_ten = ho_ten;
    }
    
    public void setHo_ten()
    {
        System.out.println("Mời bạn nhập họ và tên:");
        ho_ten = inp.nextLine();
    }

    public String getGioi_tinh() {
        return gioi_tinh;
    }

    public void setGioi_tinh(String gioi_inh) {
        this.gioi_tinh = gioi_tinh;
    }

    public void setGioi_tinh(){
        System.out.println("Mời bạn nhập giới tính: ");
        gioi_tinh = inp.nextLine();
    }
    
    public DATE getNgay_thang_nam_sinh() {
        return ngay_thang_nam_sinh;
    }

    public void setNgay_thang_nam_sinh(DATE ngay_thang_nam_sinh) {
        this.ngay_thang_nam_sinh = ngay_thang_nam_sinh;
    }
    
    public void setNgay_thang_nam_sinh()
    {
        System.out.println("Mời bạn nhập ngày, tháng, năm sinh:");
        ngay_thang_nam_sinh = new DATE();
        ngay_thang_nam_sinh.Nhap();
    }

    public String getDia_chi() {
        return dia_chi;
    }

    public void setDia_chi(String dia_chi) {
        this.dia_chi = dia_chi;
    }
    
    public void setDia_chi()
    {
        System.out.println("Mời bạn nhập địa chỉ:");
        dia_chi = inp.nextLine();
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
    public void setSdt()
    {
        System.out.println("Mời bạn nhập số điện thoại:");
        sdt = inp.nextLine();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setEmail()
    {
        System.out.println("Mời bạn nhập địa chỉ email:");
        email = inp.nextLine();
    }
    
    public void Nhap(){
        setHo_ten();
        setGioi_tinh();
        setNgay_thang_nam_sinh();
        setDia_chi();
        setSdt();
        setEmail();
       
    }
    public void Xuat(){
        System.out.println("+------------------Thông tin mà bạn vừa nhập---------------------+");
        System.out.println("Họ và tên: "+ ho_ten +"\t"+"\t"+ "Giới tính: "+ gioi_tinh +"\t"+"\t"+"Ngày tháng năm sinh"+ngay_thang_nam_sinh.ngay+"/"+ngay_thang_nam_sinh.thang+"/"+ngay_thang_nam_sinh.nam+"\t"+"\t" + "Địa chỉ: " + dia_chi +"\t"+"\t"+ "Số điện thoại: " + sdt +"\t"+"\t"+ "Địa chỉ email: " + email);
        
    }
    
    public static void main(String [] args){
        CON_NGUOI person = new CON_NGUOI();
        person.Nhap();
        person.Xuat();
        
    }
}
