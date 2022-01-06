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
public class TRUYEN_TRANH extends SACH{
    //Scanner sc=new Scanner(System.in);
    protected String Ten_TL_truyen_tranh;
    public TRUYEN_TRANH()
    {
        Ma_TL="2";
        Ten_TL_truyen_tranh= "Truyện tranh";
        Ma_sach=null;
        Ten_sach=null;
        Ma_TG=null;
        MaNXB=null;  
    }
    
    
    public TRUYEN_TRANH(SACH Ten_TL_truyen_tranh,String Ma_sach,String Ten_sach,String NXB,String Ma_TG,String Ma_TL) {
        this.Ma_TL="2";
        this.Ten_TL_truyen_tranh= "Truyện tranh";
        this.Ma_sach= Ma_sach;
        this.Ten_sach=Ten_sach;
        this.Ma_TG=Ma_TG;
        this.MaNXB=NXB;
    }

    public void setTen_TL_truyen_tranh(String Ten_TL_truyen_tranh) {
        this.Ten_TL_truyen_tranh = Ten_TL_truyen_tranh;
    }

    public String getTen_TL_truyen_tranh() {
        return Ten_TL_truyen_tranh;
    }

    @Override
    public void Xuat_sach(){
        System.out.printf("%-25s%-25s%-50s%-25s%-25s\n",Ten_TL_truyen_tranh,Ma_sach,Ten_sach,MaNXB,Ma_TG);
    }
}
