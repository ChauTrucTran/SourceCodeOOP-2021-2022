/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROJECT;
import java.util.Scanner;
/**
 *
 * @author A515-55
 */
public class SACH {
    Scanner inp=new Scanner(System.in);
    protected String Ma_TL;
    protected String Ma_sach;
    protected String Ten_sach;
    protected String MaNXB;
    protected String Ma_TG;
    public SACH(){
        Ma_TL=null;
        Ma_sach=null;
        Ten_sach=null;
        MaNXB=null;
        Ma_TG=null;
    }
    public SACH(String Ma_TL,String Ma_sach,String Ten_sach,String NXB,String Ma_TG) {
        this.Ma_TL = Ma_TL;
        this.Ma_sach = Ma_sach;
        this.Ten_sach = Ten_sach;
        this.MaNXB = NXB;
        this.Ma_TG = Ma_TG;
    }

    public String getMa_TL() {
        return Ma_TL;
    }
    
    public String getMa_sach() {
        return Ma_sach;
    }

    public String getTen_sach() {
        return Ten_sach;
    }

    public String getMaNXB() {
        return MaNXB;
    }

    public String getMa_TG() {
        return Ma_TG;
    }

    public void setMa_sach(String Ma_sach) {
        this.Ma_sach = Ma_sach;
    }

    public void setTen_sach(String Ten_sach) {
        this.Ten_sach = Ten_sach;
    }
    public void setMaNXB(String MaNXB) {
        this.MaNXB = MaNXB;
    }

    public void setMa_TG(String Ma_TG) {
        this.Ma_TG = Ma_TG;
    }

    public void setMa_TL(String Ma_TL) {
        this.Ma_TL = Ma_TL;
    }
    
    public void Nhap_sach(){
        System.out.println("Nhập mã sách: ");
        Ma_sach=inp.nextLine();
        System.out.println("Nhập tên sách: ");
        Ten_sach=inp.nextLine(); 
        System.out.println("Nhập mã nhà xuất bản: ");
        MaNXB=inp.nextLine();
        System.out.println("Nhập mã tác giả: ");
        Ma_TG=inp.nextLine();
    }
    
    public void Xuat_sach(){  
           System.out.printf("%-25s%-25s%-50s%-25s%-25s\n",Ma_TL,Ma_sach,Ten_sach,MaNXB,Ma_TG);
    }
    public void Xuat_ds_tk(){
        System.out.println("+---------------------------------------Danh sách sách đã tìm kiếm----------------------------------------------------+");
        System.out.printf("%-25s%-25s%-50s%-25s%-25s\n","Mã thể loại","Mã sách","Tên sách","Mã NXB", "Mã tác giả");
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.printf("%-25s%-25s%-50s%-25s%-25s\n",Ma_TL,Ma_sach,Ten_sach,MaNXB, Ma_TG);
    }
    
}
