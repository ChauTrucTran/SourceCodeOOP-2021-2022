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


import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author A515-55
 */
public class DS_TG {
    Scanner sc=new Scanner(System.in);
    protected int n;
    TAC_GIA[] DSTG;
    public DS_TG(){
        DSTG=null;
        n=0;
    }
    public void Nhap_DSTG(){
        System.out.println("Mời bạn nhập số lượng tác giả : ");
        n=Integer.parseInt(sc.nextLine());
        DSTG=new TAC_GIA[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhập tác giả thứ "+(i+1));
            DSTG[i]=new TAC_GIA();
            DSTG[i].Nhap_TG();
        }
    }
    public void Xuat_DSTG()
    {
        System.out.println("+---------------------------------------------------------Danh sách tác giả vừa nhập----------------------------------------------------+");
        System.out.printf("%-18s%-25s%-12s%-30s%-30s%-15s%-30s%-20s\n","Mã tác giả","Tên tác giả","Giới tính", "Ngày, tháng, năm sinh", "Địa chỉ","Số điện thoại", "Địa chỉ email", "Note");
        for(int i=0;i<n;i++)
        System.out.printf("%-18s%-25s%-12s%-10s%-10s%-10s%-30s%-15s%-30s%-20s\n",DSTG[i].ma_TG, DSTG[i].ho_ten,DSTG[i].gioi_tinh,DSTG[i].ngay_thang_nam_sinh.ngay, DSTG[i].ngay_thang_nam_sinh.thang, DSTG[i].ngay_thang_nam_sinh.nam, DSTG[i].dia_chi, DSTG[i].sdt, DSTG[i].email, DSTG[i].note);    
    }
    public void tim_kiem_TG()
    {
        
        System.out.println("Nhập vào tác giả cần tìm( mã hoặc tên):");
        String ho_ten=sc.next();
        int k=0;
        for(int i=0; i<n; i++)
            if(DSTG[i].getHo_ten().equalsIgnoreCase(ho_ten)||DSTG[i].getMa_TG().equalsIgnoreCase(ho_ten))
            {
                DSTG[i].Xuat_TG();
                k=1;
            }        
        if (k==0) System.out.println("Không có tên tác giả này!");
    }
    public void Them_TG(){
        System.out.println("Mời nhập số lượng tác giả cần thêm: ");
        int m=Integer.parseInt(sc.nextLine());
        System.out.println("Mời nhập tên tác giả cần thêm: ");
        for(int i=1;i<=m;i++)
        {
            System.out.println("TÁC GIẢ "+i);
            TAC_GIA KH=new TAC_GIA();
            KH.Nhap_TG();
            DSTG = Arrays.copyOf(DSTG, DSTG.length +1); 
            DSTG[n]=KH;
            n++;
        }
        System.out.println("+---------------------------------------Danh sách tác giả sau khi thêm----------------------------------------------------+");
        System.out.printf("%-18s%-25s%-12s%-30s%-30s%-15s%-30s%-20s\n","Mã tác giả","Tên tác giả","Giới tính", "Ngày, tháng, năm sinh", "Địa chỉ","Số điện thoại", "Địa chỉ email", "Note");
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
        for(int i=0; i<n; i++)
        DSTG[i].Xuat_TG();
    }
        public void Sua_TG(){
        int t=0;
        System.out.println("Mời nhập tác giả cần sửa(mã hoặc tên):");
        String TG=sc.nextLine();
        for(int i=0; i<n; i++)
            if(DSTG[i].getMa_TG().equalsIgnoreCase(TG) ||DSTG[i].getHo_ten().equalsIgnoreCase(TG) || DSTG[i].getDia_chi().equalsIgnoreCase(TG) || DSTG[i].getSdt().equalsIgnoreCase(TG) || DSTG[i].getEmail().equalsIgnoreCase(TG) || DSTG[i].getNote().equalsIgnoreCase(TG))
            {
                DSTG[i].Xuat_TG();
                t=i;
            }
            else{
                System.out.println("Không có TG đó!");
                return;
            }
        System.out.println("Bạn muốn sửa gì? ");
        System.out.println("1. Mã tác giả");
        System.out.println("2. Tên tác giả");
        System.out.println("3. Địa chỉ tác giả");
        System.out.println("4. Số điện thoại của tác giả");
        System.out.println("5. Địa chỉ email của tác giả");
        System.out.print("Mời bạn nhập:");
        int chon=sc.nextInt();
        switch(chon){
            case 1:{
                System.out.println("Nhập mã tác giả mới: ");
                String Ma_TG_moi=sc.next();
                DSTG[t].setMa_TG(Ma_TG_moi);
                System.out.println("+---------------------------------------Danh sách tác giả sau khi sửa----------------------------------------------------+");
                System.out.printf("%-18s%-25s%-12s%-30s%-30s%-15s%-30s%-20s\n","Mã tác giả","Tên tác giả","Giới tính", "Ngày, tháng, năm sinh", "Địa chỉ","Số điện thoại", "Địa chỉ email", "Note");
                System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
                for(int i=0; i<n; i++)
                DSTG[i].Xuat_TG();
                break;
            }
            case 2:{
                System.out.println("Nhập tên mới của tác giả: ");
                String Ho_ten_moi=sc.next();
                DSTG[t].setHo_ten(Ho_ten_moi);
                System.out.println("+---------------------------------------Danh sách tác giả sau khi sửa----------------------------------------------------+");
                System.out.printf("%-18s%-25s%-12s%-30s%-30s%-15s%-30s%-20s\n","Mã tác giả","Tên tác giả","Giới tính", "Ngày, tháng, năm sinh", "Địa chỉ","Số điện thoại", "Địa chỉ email", "Note");
                System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
                for(int i=0; i<n; i++)
                DSTG[i].Xuat_TG();
                break;
            }
            case 3:{
                System.out.println("Nhập địa chỉ mới của tác giả: ");
                String dia_chi_moi=sc.next();
                DSTG[t].setDia_chi(dia_chi_moi);
                System.out.println("+---------------------------------------Danh sách tác giả sau khi sửa----------------------------------------------------+");
                System.out.printf("%-18s%-25s%-12s%-30s%-30s%-15s%-30s%-20s\n","Mã tác giả","Tên tác giả","Giới tính", "Ngày, tháng, năm sinh", "Địa chỉ","Số điện thoại", "Địa chỉ email", "Note");
                System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
                for(int i=0; i<n; i++)
                DSTG[i].Xuat_TG();
                break;
            }
            case 4:{
                System.out.println("Nhập số điện thoại mới của tác giả: ");
                String sdt_moi=sc.next();
                DSTG[t].setSdt(sdt_moi);
                System.out.println("+---------------------------------------Danh sách tác giả sau khi sửa----------------------------------------------------+");
                System.out.printf("%-18s%-25s%-12s%-30s%-30s%-15s%-30s%-20s\n","Mã tác giả", "Tên tác giả","Giới tính", "Ngày, tháng, năm sinh", "Địa chỉ","Số điện thoại", "Địa chỉ email", "Note");
                System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
                for(int i=0; i<n; i++)
                DSTG[i].Xuat_TG();
                break;
            }
            case 5:{
                System.out.println("Nhập địa chỉ email mới của tác giả: ");
                String email_moi=sc.next();
                DSTG[t].setEmail(email_moi);
                System.out.println("+---------------------------------------Danh sách tác giả sau khi sửa----------------------------------------------------+");
                System.out.printf("%-18s%-25s%-12s%-30s%-30s%-15s%-30s%-20s\n","Mã tác giả", "Tên tác giả","Giới tính", "Ngày, tháng, năm sinh", "Địa chỉ","Số điện thoại", "Địa chỉ email", "Note");
                System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
                for(int i=0; i<n; i++)
                DSTG[i].Xuat_TG();
                break;
            }
        }
    }
    public void Xoa_TG(){
        if(n<=1) System.out.println("Danh sách sách rỗng.");
        else{
            System.out.println("Mời nhập (mã TG hoặc tên)tác giả cần xoá: ");
            String TG=sc.nextLine();

            for(int i=0; i<n; i++)
                if(DSTG[i].getMa_TG().equalsIgnoreCase(TG) ||DSTG[i].getHo_ten().equalsIgnoreCase(TG) || DSTG[i].getDia_chi().equalsIgnoreCase(TG) || DSTG[i].getSdt().equalsIgnoreCase(TG) || DSTG[i].getEmail().equalsIgnoreCase(TG) || DSTG[i].getNote().equalsIgnoreCase(TG))
                {
                    for(int j=i;j<n-1;j++)
                        DSTG[j]=DSTG[j+1];
                    n--;
                }
            if(n<=0) System.out.println("Danh sách tác giả rỗng.");
            else{
            System.out.println("+---------------------------------------Danh sách tác giả sau khi xoá----------------------------------------------------+");
            System.out.printf("%-18s%-25s%-12s%-30s%-30s%-15s%-30s%-20s\n","Mã tác giả", "Tên tác giả","Giới tính", "Ngày, tháng, năm sinh", "Địa chỉ","Số điện thoại", "Địa chỉ email", "Ghi chú");
            System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
            for(int i=0; i<n; i++)
            DSTG[i].Xuat_TG();
            }
        }
    }
    public static void main(String[] args){
        DS_TG dstg=new DS_TG();
        dstg.Nhap_DSTG();
        dstg.Xuat_DSTG();
        dstg.Them_TG();
        dstg.Sua_TG();
        dstg.Xoa_TG();
       
    }
}
