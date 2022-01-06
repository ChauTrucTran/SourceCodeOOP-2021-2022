/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROJECT;
//import java.util.Scanner;
/**
 *
 * @author A515-55
 */
public class TIEU_THUYET extends SACH{
    //Scanner sc=new Scanner(System.in); 
    protected String Ten_TL_tieu_thuyet;
    public TIEU_THUYET()
    {
        Ma_TL="1";
        Ten_TL_tieu_thuyet="Tiểu thuyết";
        Ma_sach= null;
        Ten_sach=null;
        Ma_TG=null;
        MaNXB=null;
    }
    public TIEU_THUYET(String Ten_TL_tieu_thuyet,String Ma_sach, String Ten_sach, String NXB,String Ma_TG,String Ma_TL) {
        this.Ma_TL="1";
        this.Ten_TL_tieu_thuyet= "Tiểu thuyết";
        this.Ma_sach= Ma_sach;
        this.Ten_sach=Ten_sach;
        this.Ma_TG=Ma_TG;
        this.MaNXB=NXB;
    }

        
    public void setTen_TL_tieu_thuyet(String Ten_TL_tieu_thuyet) {
        this.Ten_TL_tieu_thuyet = Ten_TL_tieu_thuyet;
    }
    
    public String getTen_TL_tieu_thuyet() {
        return Ten_TL_tieu_thuyet;
    }
    @Override
    public void Xuat_sach(){
        System.out.printf("%-25s%-25s%-50s%-25s%-25s\n",Ten_TL_tieu_thuyet,Ma_sach,Ten_sach,MaNXB,Ma_TG);
    }
}
