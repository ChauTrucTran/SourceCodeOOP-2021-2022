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
public class NHA_XUAT_BAN implements itf_nxb_ncc{
    
    protected String MaNXB;
    protected String TenNXB;
    protected String Diachi;
    protected String Email;
    Scanner inp= new Scanner(System.in);
    public NHA_XUAT_BAN() {
        MaNXB = "";
        TenNXB = "";
        Diachi = null;
        Email = "";
    }
    
    public NHA_XUAT_BAN(String maNXB, String tenNXB, String diachi, String email) {
        this.MaNXB = maNXB;
        this.TenNXB = tenNXB;
        this.Diachi = diachi;
        this.Email = email;
    }
    
   
    public String getMaNXB() {
        return MaNXB;
    }

    public void setMaNXB(String maNXB) {
        this.MaNXB = maNXB;
    }
    
    public void setMaNXB()
    {
        System.out.println("Mời bạn nhập mã NXB:");
        MaNXB = inp.nextLine();
    }
    public String getTenNXB() {
        return TenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.TenNXB =tenNXB;
    }
    
    public void setTenNXB()
    {
        System.out.println("Mời bạn nhập tên NXB:");
        TenNXB = inp.nextLine();
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        this.Diachi = diachi;
    }
    
    public void setDiachi()
    {
        System.out.println("Mời bạn nhập địa chỉ:");
        Diachi = inp.nextLine();
    }

   
    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }
    
    public void setEmail()
    {
        System.out.println("Mời bạn nhập địa chỉ email:");
        Email = inp.nextLine();
    }
    @Override
    public void Nhap(){
        setMaNXB();
        setTenNXB();
        setDiachi();
        setEmail(); 
    }
    @Override
    public void Xuat(){
        System.out.printf("%-20s%-25s%-25s%-50s\n",MaNXB,TenNXB,Diachi,Email);
    }
    public void Xuat_ds_nxb(){
        System.out.println("+---------------------------------------Danh sách sách đã tìm kiếm----------------------------------------------------+");
        System.out.printf("%-20s%-25s%-25s%-50s\n","Mã NXB ","Tên NXB","Địa chỉ", "Email");
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.printf("%-20s%-25s%-25s%-50s\n",MaNXB,TenNXB,Diachi,Email);
    }
    

public static void main (String [] args){
    NHA_XUAT_BAN A = new NHA_XUAT_BAN();
     A.Nhap();
     A.Xuat();
 }
}
