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
public class DATE {
    
    protected int ngay;
    protected int thang;
    protected int nam;
    Scanner inp= new Scanner(System.in);
    public DATE() {
        ngay = 0;
        thang = 0;
        nam = 0;
    }
    
    public DATE(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
        
    }
    
   
    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }
    
    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang =thang;
    }
    

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }
    
    public void Nhap(){
        System.out.println("Mời bạn nhập ngày(1->30):");
        ngay = inp.nextInt();
        while(ngay>30 || ngay<1){ 
            System.out.println("Mời bạn nhập lại: ");
            ngay = inp.nextInt();
        }
        System.out.println("Mời bạn nhập tháng(1->12):");
        thang = inp.nextInt();
        while(thang>12 || thang<1){ 
            System.out.println("Mời bạn nhập lại: ");
            thang = inp.nextInt();
        }
        System.out.println("Mời bạn nhập năm(2000->2050):");
        nam = inp.nextInt(); 
        while(nam>2050 || nam<2000){ 
            System.out.println("Mời bạn nhập lại: ");
            nam = inp.nextInt();
        }
    }
    public void Xuat(){
        System.out.println("+------------------Thông tin ngày,tháng,năm bạn vừa nhập---------------------+");
        System.out.println("Ngày  "+ ngay +"\t"+"\t"+ "Tháng  "+ thang +"\t"+"\t"+  "Năm  " + nam);
    }
public static void main (String [] args){
    DATE A = new DATE();
     A.Nhap();
     A.Xuat();
 }
}