/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROJECT;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author A515-55
 */
public class DS_NCC {
    Scanner sc=new Scanner(System.in);
    protected int n;
    NHA_CUNG_CAP[] dsncc;
    public DS_NCC(){
        dsncc=null;
        n=0;
    }
    public void Nhap_DSNCC(){
        System.out.println("Mời nhập số lượng NCC cần nhập: ");
        n=Integer.parseInt(sc.nextLine());
        dsncc=new NHA_CUNG_CAP[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhập NCC thứ "+(i+1));
            dsncc[i]=new NHA_CUNG_CAP();
            dsncc[i].Nhap();
        }
    }
    public void Xuat_DSNCC()
    {
        System.out.println("+---------------------------------------------------------Danh sách NCC vừa nhập----------------------------------------------------+");
        System.out.printf("%-20s%-25s%-25s%-12s\n","Mã NCC","Tên NCC","Địa chỉ", "Phone");
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
        for(int i=0;i<n;i++)
            System.out.printf("%-20s%-25s%-25s%-12s\n",dsncc[i].MaNCC,dsncc[i].TenNCC,dsncc[i].Diachi,dsncc[i].Phone);    
    }
    public void timkiemNCC()
    {
        
        System.out.println("Nhập vào NCC cần tìm(mã hoặc tên):");
        String maNCC=sc.next();
        int k=0;
        for(int i=0; i<n; i++)
            if(dsncc[i].getMaNCC().equalsIgnoreCase(maNCC)||dsncc[i].getTenNCC().equalsIgnoreCase(maNCC))
            {
                dsncc[i].Xuat_ds_ncc();
                k=1;
            }        
        if (k==0) System.out.println("Không có NCC này.");
    }
    
    public void Them_NCC(){
        System.out.println("Mời nhập số lượng NCC cần thêm: ");
        int m=Integer.parseInt(sc.nextLine());
        System.out.println("Mời nhập NCC cần thêm: ");
        for(int i=1;i<=m;i++)
        {
            System.out.println("NCC "+i);
            NHA_CUNG_CAP ncc=new NHA_CUNG_CAP();
            ncc.Nhap();
            dsncc = Arrays.copyOf(dsncc, dsncc.length +1); 
            dsncc[n]=ncc;
            n++;
        }
        System.out.println("+---------------------------------------Danh sách NCC sau khi thêm----------------------------------------------------+");
        System.out.printf("%-20s%-25s%-25s%-12s\n","Mã NCC","Tên NCC","Địa chỉ ", "Phone");
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
        for(int i=0; i<n; i++)
        dsncc[i].Xuat();
    }
    public void Sua_NCC(){
        int t=0;
        System.out.println("Mời nhập NCC cần sửa(mã hoặc tên): ");
        String mancc=sc.nextLine();
        for(int i=0; i<n; i++)
            if(dsncc[i].getMaNCC().equalsIgnoreCase(mancc)||dsncc[i].getTenNCC().equalsIgnoreCase(mancc) )
            {
                dsncc[i].Xuat_ds_ncc();
                t=i;
            }
            else{
                System.out.println("Không có NCC đó.");
                return;
            }
        System.out.println("Bạn muốn sửa gì? ");
        System.out.println("1.Mã NCC");
        System.out.println("2.Tên NCC");
        System.out.print("Mời bạn nhập:");
        int chon=sc.nextInt();
        switch(chon){
            case 1:{
                System.out.println("Nhập mã NCC mới: ");
                String mamoi=sc.next();
                dsncc[t].setMaNCC(mamoi);
                System.out.println("+---------------------------------------Danh sách NCC sau khi sửa----------------------------------------------------+");
                System.out.printf("%-20s%-25s%-25s%-12s\n","Mã NCC","Tên NCC","Địa chỉ ", "Phone");
                System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
                for(int i=0; i<n; i++)
                dsncc[i].Xuat();
                break;
            }
            case 2:{
                System.out.println("Nhập tên NCC mới: ");
                String tenmoi=sc.nextLine();
                tenmoi=sc.nextLine();
                dsncc[t].setTenNCC(tenmoi);
                System.out.println("+---------------------------------------Danh sách NCC sau khi sửa----------------------------------------------------+");
                System.out.printf("%-20s%-25s%-25s%-12s\n","Mã NCC","Tên NCC","Địa chỉ ", "Phone");
                System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
                for(int i=0; i<n; i++)
                dsncc[i].Xuat();
                break;
            }
        }
    }
    public void Xoa_NCC(){
        if(n<1) System.out.println("Danh sách NCC rỗng.");
        else{
            System.out.println("Mời nhập NCC cần xoá(mã hoặc tên): ");
            String mancc=sc.nextLine();
            for(int i=0; i<n; i++)
                if(dsncc[i].getMaNCC().equalsIgnoreCase(mancc)||dsncc[i].getTenNCC().equalsIgnoreCase(mancc))
                {
                    for(int j=i;j<n-1;j++)
                        dsncc[j]=dsncc[j+1];
                    n--;
                }
            if(n<=0) System.out.println("Danh sách NCC rỗng.");
            else{
            System.out.println("+---------------------------------------Danh sách NCC sau khi xoá----------------------------------------------------+");
            System.out.printf("%-20s%-25s%-25s%-12s\n","Mã NCC","Tên NCC","Địa chỉ", "Phone");
            System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
            for(int i=0; i<n; i++)
            dsncc[i].Xuat();
            }
        }
    }

      public static void main(String[] args){
       
        DS_NCC danhsach=new DS_NCC();
        danhsach.Nhap_DSNCC();
        danhsach.Xuat_DSNCC();
        danhsach.Sua_NCC();
    }
}

    