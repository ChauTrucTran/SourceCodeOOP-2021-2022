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
public class VAN_HOC extends SACH{
    //Scanner sc=new Scanner(System.in);
    protected String Ten_TL_van_hoc;
    public VAN_HOC(){
        Ma_TL="3";
        Ten_TL_van_hoc= "Văn học";
        Ma_sach=null;
        Ten_sach=null;
        Ma_TG=null;
        MaNXB=null;
    }
    public VAN_HOC(String Ten_TL_van_hoc,String Ma_sach,String Ten_sach,String NXB,String Ma_TG,String Ma_TL) {
        this.Ma_TL="3";
        this.Ten_TL_van_hoc= "Văn học";
        this.Ma_sach= Ma_sach;
        this.Ten_sach=Ten_sach;
        this.Ma_TG=Ma_TG;
        this.MaNXB=NXB;
    }

    public void setTen_TL_van_hoc(String Ten_TL_van_hoc) {
        this.Ten_TL_van_hoc = Ten_TL_van_hoc;
    }

    public String getTen_TL_van_hoc() {
        return Ten_TL_van_hoc;
    }
    
    @Override
    public void Xuat_sach(){
        System.out.printf("%-25s%-25s%-50s%-25s%-25s\n",Ten_TL_van_hoc,Ma_sach,Ten_sach,MaNXB,Ma_TG);
    }
}
