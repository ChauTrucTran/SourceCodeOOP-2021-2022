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
public class DS_NXB {
    Scanner sc=new Scanner(System.in);
    protected int n;
    NHA_XUAT_BAN[] dsnxb;
    public DS_NXB(){
        dsnxb=null;
        n=0;
    }
    public void Nhap_DSNXB(){
        System.out.println("Mời nhập số lượng NXB cần nhập: ");
        n=Integer.parseInt(sc.nextLine());
        dsnxb=new NHA_XUAT_BAN[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhập NXB thứ "+(i+1));
            dsnxb[i]=new NHA_XUAT_BAN();
            dsnxb[i].Nhap();
        }
    }
    public void Xuat_DSNXB()
    {
        System.out.println("+---------------------------------------------------------Danh sách NXB vừa nhập----------------------------------------------------+");
        System.out.printf("%-20s%-25s%-25s%-50s\n","Mã NCC","Tên NCC","Địa chỉ", "Email");
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
        for(int i=0;i<n;i++)
            System.out.printf("%-20s%-25s%-25s%-50s\n",dsnxb[i].MaNXB,dsnxb[i].TenNXB,dsnxb[i].Diachi,dsnxb[i].Email);    
    }
    public void timkiemNXB()
    {
        
        System.out.println("Nhập vào NXB cần tìm (mã hoặc tên):");
        String maNXB=sc.nextLine();
        int k=0;
        for(int i=0; i<n; i++)
            if(dsnxb[i].getMaNXB().equalsIgnoreCase(maNXB)||dsnxb[i].getTenNXB().equalsIgnoreCase(maNXB))
            {
                dsnxb[i].Xuat();
                k=1;
            }        
        if (k==0) System.out.println("Không có NXB này.");
    }
    
    public void Them_NXB(){
        System.out.println("Mời nhập số lượng NXB cần thêm: ");
        int m=Integer.parseInt(sc.nextLine());
        System.out.println("Mời nhập NXB cần thêm: ");
        for(int i=1;i<=m;i++)
        {
            System.out.println("NXB "+i);
            NHA_XUAT_BAN nxb=new NHA_XUAT_BAN();
            nxb.Nhap();
            dsnxb = Arrays.copyOf(dsnxb, dsnxb.length +1); 
            dsnxb[n]=nxb;
            n++;
        }
        System.out.println("+---------------------------------------Danh sách NXB sau khi thêm----------------------------------------------------+");
        System.out.printf("%-20s%-25s%-25s%-50s\n","Mã NXB","Tên NXB","Địa chỉ ", "Email");
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
        for(int i=0; i<n; i++)
        dsnxb[i].Xuat();
    }
    public void Sua_NXB(){
        int t=0;
        System.out.println("Mời nhập NXB cần sửa(mã hoặc tên): ");
        String manxb=sc.nextLine();
        for(int i=0; i<n; i++)
            if(dsnxb[i].getMaNXB().equalsIgnoreCase(manxb)||dsnxb[i].getTenNXB().equalsIgnoreCase(manxb) )
            {
                dsnxb[i].Xuat();
                t=i;
            }
            else{
                System.out.println("Không có NCC đó.");
                return;
            }
        System.out.println("Bạn muốn sửa gì? ");
        System.out.println("1.Mã NXB");
        System.out.println("2.Tên NXB");
        System.out.print("Mời bạn nhập:");
        int chon=sc.nextInt();
        switch(chon){
            case 1:{
                System.out.println("Nhập mã NXB mới: ");
                String mamoi=sc.nextLine();
                mamoi=sc.nextLine();
                dsnxb[t].setMaNXB(mamoi);
                System.out.println("+---------------------------------------Danh sách NXB sau khi sửa----------------------------------------------------+");
                System.out.printf("%-20s%-25s%-25s%-50s\n","Mã NXB","Tên NXB","Địa chỉ ", "Email");
                System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
                for(int i=0; i<n; i++)
                dsnxb[i].Xuat();
                break;
            }
            case 2:{
                System.out.println("Nhập tên NXB mới: ");
                String tenmoi=sc.nextLine();
                tenmoi=sc.nextLine();
                dsnxb[t].setTenNXB(tenmoi);
                System.out.println("+---------------------------------------Danh sách NXB sau khi sửa----------------------------------------------------+");
                System.out.printf("%-20s%-25s%-25s%-50s\n","Mã NXB","Tên NXB","Địa chỉ ", "Email");
                System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
                for(int i=0; i<n; i++)
                dsnxb[i].Xuat();
                break;
            }
        }
    }
    public void Xoa_NXB(){
        if(n<1) System.out.println("Danh sách NXB rỗng.");
        else{
            System.out.println("Mời nhập NXB cần xoá(mã hoặc tên): ");
            String manxb=sc.nextLine();
            for(int i=0; i<n; i++)
                if(dsnxb[i].getMaNXB().equalsIgnoreCase(manxb)||dsnxb[i].getTenNXB().equalsIgnoreCase(manxb))
                {
                    for(int j=i;j<n-1;j++)
                        dsnxb[j]=dsnxb[j+1];
                    n--;
                }
            if(n<=0) System.out.println("Danh sách NXB rỗng ");
            else {
            System.out.println("+---------------------------------------Danh sách NXB sau khi xoá----------------------------------------------------+");
            System.out.printf("%-20s%-25s%-25s%-50s\n","Mã NXB","Tên NXB","Địa chỉ", "Email");
            System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
            for(int i=0; i<n; i++)
            dsnxb[i].Xuat();
            }
        }
    }
    public static void main(String[] args){
       
        DS_NXB danhsach=new DS_NXB();
        danhsach.Nhap_DSNXB();
        danhsach.Xuat_DSNXB();
        danhsach.Xoa_NXB();
    }
}
