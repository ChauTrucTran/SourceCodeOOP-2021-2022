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
public class DS_NV {
    Scanner sc=new Scanner(System.in);
    protected int n;
    NHAN_VIEN[] DSNV;
    public DS_NV(){
        DSNV=null;
        n=0;
    }
    public void Nhap_DSNV(){
        System.out.println("Mời bạn nhập số lượng nhân viên : ");
        n=Integer.parseInt(sc.nextLine());
        DSNV=new NHAN_VIEN[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhập nhân viên thứ "+(i+1));
            DSNV[i]=new NHAN_VIEN();
            DSNV[i].Nhap_NV();
        }
    }
    public void Xuat_DSNV()
    {
        System.out.println("+---------------------------------------------------------Danh sách nhân viên vừa nhập----------------------------------------------------+");
        System.out.printf("%-18s%-25s%-12s%-30s%-30s%-15s%-30s%-30s%-30s%-30s\n","Mã nhân viên","Tên nhân viên","Giới tính", "Ngày, tháng, năm sinh", "Địa chỉ","Số điện thoại", "Địa chỉ email", "Số giờ làm việc", " Số ngày nghỉ", "Lương tháng");
        for(int i=0;i<n;i++)
        System.out.printf("%-18s%-25s%-12s%-10s%-10s%-10s%-30s%-15s%-30s%-30s%-30s%-30s\n",DSNV[i].ma_NV, DSNV[i].ho_ten,DSNV[i].gioi_tinh,DSNV[i].ngay_thang_nam_sinh.ngay,DSNV[i].ngay_thang_nam_sinh.thang,DSNV[i].ngay_thang_nam_sinh.nam, DSNV[i].dia_chi, DSNV[i].sdt, DSNV[i].email, DSNV[i].so_gio_lam_viec, DSNV[i].so_ngay_nghi, DSNV[i].tinh_Luong());    
    }
    public void tim_kiem_NV()
    {
        
        System.out.println("Nhập vào tên nhân viên cần tìm (mã hoặc tên):");
        String NV=sc.nextLine();
        int k=0;
        for(int i=0; i<n; i++)
            if(DSNV[i].getHo_ten().equalsIgnoreCase(NV)||DSNV[i].getMa_NV().equalsIgnoreCase(NV))
            {
                DSNV[i].Xuat_NV();
                k=1;
            }        
        if (k==0) System.out.println("Không có nhân viên này!");
    }

    public void Them_NV(){
        int m;
        System.out.println("Mời nhập số lượng nhân viên cần thêm: ");
        m=sc.nextInt();
        System.out.println("Mời nhập tên nhân viên cần thêm: ");
        for(int i=1;i<=m;i++)
        {
            System.out.println("NHÂN VIÊN "+i);
            NHAN_VIEN NV=new NHAN_VIEN();
            NV.Nhap_NV();
            DSNV = Arrays.copyOf(DSNV, DSNV.length +1); 
            DSNV[n]=NV;
            n++;
        }
        System.out.println("+---------------------------------------Danh sách nhân viên sau khi thêm----------------------------------------------------+");
        System.out.printf("%-18s%-25s%-12s%-30s%-30s%-15s%-30s%-30s%-30s%-30s\n","Mã nhân viên","Tên nhân viên","Giới tính", "Ngày, tháng, năm sinh", "Địa chỉ","Số điện thoại", "Địa chỉ email", "Số giờ làm việc", " Số ngày nghỉ", "Lương tháng");
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
        for(int i=0; i<n; i++)
        DSNV[i].Xuat_NV();
    }
        public void Sua_NV(){
        int t=0;
        System.out.println("Mời nhập nhân viên cần sửa (mã hoặc tên)");
        String NV=sc.nextLine();
        for(int i=0; i<n; i++)
            if(DSNV[i].getMa_NV().equalsIgnoreCase(NV) ||DSNV[i].getHo_ten().equalsIgnoreCase(NV) || DSNV[i].getDia_chi().equalsIgnoreCase(NV) || DSNV[i].getSdt().equalsIgnoreCase(NV) || DSNV[i].getEmail().equalsIgnoreCase(NV))
            {
                DSNV[i].Xuat_NV();
                t=i;
            }
            else{
                System.out.println("Không có NV đó!");
                System.exit(0);
            }
        System.out.println("Bạn muốn sửa gì? ");
        System.out.println("1. Mã nhân viên");
        System.out.println("2. Tên nhân viên");
        System.out.println("3. Địa chỉ nhân viên");
        System.out.println("4. Số điện thoại của nhân viên");
        System.out.println("5. Địa chỉ email của nhân viên");
        System.out.print("Mời bạn nhập:");
        int chon=sc.nextInt();
        switch(chon){
            case 1:{
                System.out.println("Nhập mã nhân viên mới: ");
                String Ma_NV_moi=sc.next();
                DSNV[t].setMa_NV(Ma_NV_moi);
                System.out.println("+---------------------------------------Danh sách nhân viên sau khi sửa----------------------------------------------------+");
                System.out.printf("%-18s%-25s%-12s%-30s%-30s%-15s%-30s%-30s%-30s%-30s\n","Mã nhân viên","Tên nhân viên","Giới tính", "Ngày, tháng, năm sinh", "Địa chỉ","Số điện thoại", "Địa chỉ email", "Số giờ làm việc", " Số ngày nghỉ", "Lương tháng");
                System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
                for(int i=0; i<n; i++)
                DSNV[i].Xuat_NV();
                break;
            }
            case 2:{
                System.out.println("Nhập tên mới của nhân viên: ");
                String Ho_ten_moi=sc.next();
                DSNV[t].setHo_ten(Ho_ten_moi);
                System.out.println("+---------------------------------------Danh sách nhân viên sau khi sửa----------------------------------------------------+");
                System.out.printf("%-18s%-25s%-12s%-30s%-30s%-15s%-30s%-30s%-30s%-30s\n","Mã nhân viên","Tên nhân viên","Giới tính", "Ngày, tháng, năm sinh", "Địa chỉ","Số điện thoại", "Địa chỉ email", "Số giờ làm việc", " Số ngày nghỉ", "Lương tháng");
                System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
                for(int i=0; i<n; i++)
                DSNV[i].Xuat_NV();
                break;
            }
            case 3:{
                System.out.println("Nhập địa chỉ mới của nhân viên: ");
                String dia_chi_moi=sc.next();
                DSNV[t].setDia_chi(dia_chi_moi);
                System.out.println("+---------------------------------------Danh sách nhân viên sau khi sửa----------------------------------------------------+");
                System.out.printf("%-18s%-25s%-12s%-30s%-30s%-15s%-30s%-30s%-30s%-30s\n","Mã nhân viên","Tên nhân viên","Giới tính", "Ngày, tháng, năm sinh", "Địa chỉ","Số điện thoại", "Địa chỉ email", "Số giờ làm việc", " Số ngày nghỉ", "Lương tháng");
                System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
                for(int i=0; i<n; i++)
                DSNV[i].Xuat_NV();
                break;
            }
            case 4:{
                System.out.println("Nhập số điện thoại mới của nhân viên: ");
                String sdt_moi=sc.next();
                DSNV[t].setSdt(sdt_moi);
                System.out.println("+---------------------------------------Danh sách nhân viên sau khi sửa----------------------------------------------------+");
                System.out.printf("%-18s%-25s%-12s%-30s%-30s%-15s%-30s%-30s%-30s%-30s\n","Mã nhân viên","Tên nhân viên","Giới tính", "Ngày, tháng, năm sinh", "Địa chỉ","Số điện thoại", "Địa chỉ email", "Số giờ làm việc", " Số ngày nghỉ", "Lương tháng");
                System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
                for(int i=0; i<n; i++)
                DSNV[i].Xuat_NV();
                break;
            }
            case 5:{
                System.out.println("Nhập địa chỉ email mới của nhân viên: ");
                String email_moi=sc.next();
                DSNV[t].setEmail(email_moi);
                System.out.println("+---------------------------------------Danh sách nhân viên sau khi sửa----------------------------------------------------+");
                System.out.printf("%-18s%-25s%-12s%-30s%-30s%-15s%-30s%-30s%-30s%-30s\n","Mã nhân viên","Tên nhân viên","Giới tính", "Ngày, tháng, năm sinh", "Địa chỉ","Số điện thoại", "Địa chỉ email", "Số giờ làm việc", " Số ngày nghỉ", "Lương tháng");
                System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
                for(int i=0; i<n; i++)
                DSNV[i].Xuat_NV();
                break;
            }
        }
    }
    public void Xoa_NV(){
        if(n<1) System.out.println("Danh sách nhân viên rỗng.");
        else{
            System.out.println("Mời nhập (mã TG hoặc tên)nhân viên cần xoá: ");
            String NV=sc.nextLine();

            for(int i=0; i<n; i++)
                if(DSNV[i].getMa_NV().equalsIgnoreCase(NV) ||DSNV[i].getHo_ten().equalsIgnoreCase(NV) || DSNV[i].getDia_chi().equalsIgnoreCase(NV) || DSNV[i].getSdt().equalsIgnoreCase(NV) || DSNV[i].getEmail().equalsIgnoreCase(NV))
                {
                    for(int j=i;j<n-1;j++)
                        DSNV[j]=DSNV[j+1];
                    n--;
                }
            
            if(n<=0) System.out.println("Danh sách nhân viên rỗng.");
            else{
            System.out.println("+---------------------------------------Danh sách nhân viên sau khi xoá----------------------------------------------------+");
            System.out.printf("%-18s%-25s%-12s%-30s%-30s%-15s%-30s%-30s%-30s%-30s\n","Mã nhân viên","Tên nhân viên","Giới tính", "Ngày, tháng, năm sinh", "Địa chỉ","Số điện thoại", "Địa chỉ email", "Số giờ làm việc", " Số ngày nghỉ", "Lương tháng");
            System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
            for(int i=0; i<n; i++)
            DSNV[i].Xuat_NV();
            }
                    
        }
    }
    public static void main(String[] args){
        DS_NV danhsach=new DS_NV();
        danhsach.Nhap_DSNV();
        danhsach.Xuat_DSNV();
        danhsach.tim_kiem_NV();
       
        danhsach.Sua_NV();
        danhsach.Them_NV();
        danhsach.Xoa_NV();
    }
}
