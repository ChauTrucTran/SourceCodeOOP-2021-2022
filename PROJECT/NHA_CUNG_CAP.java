 /*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package PROJECT;

import java.util.Scanner;
import java.sql.Date;

/**
*
* @author Gaara
*/
public class NHA_CUNG_CAP implements itf_nxb_ncc{
   
   protected String MaNCC;
   protected String TenNCC;
   protected String Diachi;
   protected String Phone;
   Scanner inp= new Scanner(System.in);
   public NHA_CUNG_CAP() {
       MaNCC = "";
       TenNCC = "";
       Diachi = "";
       Phone = "";
   }
   
   public NHA_CUNG_CAP(String maNCC, String tenNCC, String diachi, String phone ) {
       this.MaNCC = maNCC;
       this.TenNCC = tenNCC;
       this.Diachi = diachi;
       this.Phone = phone;
   }
   
   public String getMaNCC() {
    return MaNCC;
}

public void setMaNCC(String maNCC) {
    this.MaNCC = maNCC;
}

public void setMaNCC()
{
    System.out.println("Mời bạn nhập mã NCC:");
    MaNCC = inp.nextLine();
}
public String getTenNCC() {
    return TenNCC;
}

public void setTenNCC(String tenNCC) {
    this.TenNCC =tenNCC;
}

public void setTenNCC()
{
    System.out.println("Mời bạn nhập tên NCC:");
    TenNCC = inp.nextLine();
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
public String getPhone() {
    return Phone;
}

public void setPhone(String phone) {
    this.Phone = phone;
}

public void setPhone()
{
    System.out.println("Mời bạn nhập phone:");
    Phone = inp.nextLine();
}
@Override
public void Nhap(){
    setMaNCC();
    setTenNCC();
    setDiachi();
    setPhone(); 
}
@Override
public void Xuat(){
    System.out.printf("%-20s%-25s%-25s%-12s\n",MaNCC,TenNCC,Diachi,Phone);
}
public void Xuat_ds_ncc(){
    System.out.println("+---------------------------------------Danh sách sách đã tìm kiếm----------------------------------------------------+");
    System.out.printf("%-20s%-25s%-25s%-12s\n","Mã NCC ","Tên NCC","Địa chỉ", "Phone");
    System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
    System.out.printf("%-20s%-25s%-25s%-12s\n",MaNCC,TenNCC,Diachi,Phone);
}
public static void main (String [] args){
    NHA_CUNG_CAP A = new NHA_CUNG_CAP();
     A.Nhap();
     A.Xuat();
 }
}
