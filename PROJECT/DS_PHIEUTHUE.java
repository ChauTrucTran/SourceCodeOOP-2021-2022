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
public class DS_PHIEUTHUE {
    Scanner sc=new Scanner(System.in);
    protected int n;
    PHIEU_THUE[] dspth;
    public DS_PHIEUTHUE(){
        dspth=null;
        n=0;
    }
    public void Nhap_DSPhieuThue(){
        System.out.println("Mời nhập số lượng phiếu thuê cần nhập: ");
        n=Integer.parseInt(sc.nextLine());
        dspth=new PHIEU_THUE[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhập phiếu thuê thứ "+(i+1));
            dspth[i]=new PHIEU_THUE();
            dspth[i].Nhap();
        }
    }
    public void Xuat_DSPhieuThue()
    {
        System.out.println("+---------------------------------------------------------Danh sách sách vừa nhập----------------------------------------------------+");
        System.out.printf("%-20s%-20s%-20s%-30s%-20s%-20s%-20s%-30s\n","Mã phiếu thuê","Mã khách hàng","Mã sách","Ngày thuê","Số lượng thuê","Thời gian thuê","Giá tiền","Tình trạng thuê" );
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
        for(int i=0;i<n;i++)                                              
            System.out.printf("%-20s%-20s%-20s%-10s%-10s%-10s%-20s%-20s%-20s%-30s\n",dspth[i].MaPTH,dspth[i].Ma_KH,dspth[i].Ma_sach,dspth[i].ngayThue.ngay,dspth[i].ngayThue.thang,dspth[i].ngayThue.nam,dspth[i].soluongThue,dspth[i].thoigianThue,dspth[i].giaTien,dspth[i].tinhtrangThue);    
    }
    public void timkiemmasach()
    {
        System.out.println("Nhập vào ma sach cần tim:");
        String maSach=sc.next();
        int k=0;
        for(int i=0; i<n; i++)
            if(dspth[i].getMa_sach().equalsIgnoreCase(maSach))
            {
                dspth[i].Xuat_ds_pt();
                k=1;
            }        
        if (k==0) System.out.println("Không có phiếu thuê này.");
    }
    public void timkiemmakhach()
    {
        
        System.out.println("Nhập vào mã khách hàng cần tìm:");
        String maKhach=sc.nextLine();
        int k=0;
        for(int i=0; i<n; i++)
            if(dspth[i].getMa_KH().equalsIgnoreCase(maKhach))
            {
                dspth[i].Xuat_ds_pt();
                k=1;
            } 
        if (k==0) System.out.println("Không có mã khách hàng này.");
    }
    public void timkiemngaythue()
    {
        
        System.out.println("Nhập vào ngày thuê cần tìm:");
        DATE ngaythue =new DATE();
        ngaythue.Nhap(); 
        int k=0;
        for(int i=0; i<n; i++)
            if(dspth[i].getNgayThue().getNgay()== ngaythue.ngay && dspth[i].getNgayThue().getThang()== ngaythue.thang &&dspth[i].getNgayThue().getNam()== ngaythue.nam)
            {
                dspth[i].Xuat_ds_pt();
                k=1;
            } 
        if (k==0) System.out.println("Không có ngày thuê này.");
    }
        public void timkiemmaPTH()
    {
        
        System.out.println("Nhập vào mã phiếu thuê cần tìm:");
        String maPTH=sc.nextLine();
        int k=0;
        for(int i=0; i<n; i++)
            if(dspth[i].getMa_KH().equalsIgnoreCase(maPTH))
            {
                dspth[i].Xuat_ds_pt();
                k=1;
            } 
        if (k==0) System.out.println("Không có mã phiếu thuê này.");
    }
    public void Them_PhieuThue(){
        System.out.println("Mời nhập số lượng phiếu thuê cần thêm: ");
        int m=Integer.parseInt(sc.nextLine());
        System.out.println("Mời nhập phiếu thuê cần thêm: ");
        for(int i=1;i<=m;i++)
        {
            System.out.println("PhieuThue "+i);
            PHIEU_THUE pth=new PHIEU_THUE();
            pth.Nhap();
            dspth = Arrays.copyOf(dspth, dspth.length +1); 
            dspth[n]=pth;
            n++;
        }
        System.out.println("+---------------------------------------Danh sách sách sau khi thêm----------------------------------------------------+");
        System.out.printf("%-20s%-20s%-20s%-30s%-20s%-20s%-20s%-30s\n","Mã phiếu thuê","Mã khách hàng","Mã sách","Ngày thuê","Số lượng thuê","Thời gian thuê","Giá tiền","Tình trạng thuê" );
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
        for(int i=0; i<n; i++)
        dspth[i].Xuat_PhieuThue();
    }
    public void Sua_PhieuThue(){
        int t=0;
        System.out.println("Mời nhập mã phiếu thuê hoặc mã khách hàng cần sửa");
        String mapth=sc.nextLine();
        for(int i=0; i<n; i++)
            if(dspth[i].getMaPTH().equalsIgnoreCase(mapth)||dspth[i].getMa_KH().equalsIgnoreCase(mapth))
            {
                dspth[i].Xuat_PhieuThue();
                t=i;
            }
            else{
                System.out.println("Không có mã phiếu thuê hoặc mã khách hàng đó!");
                System.exit(0);
            }
        System.out.println("Bạn muốn sửa gì? ");
        System.out.println("1.Mã Sách ");
        System.out.println("2.Mã khách hàng ");
        System.out.println("3.Ngày thuê");
        System.out.println("4.Mã phiếu thuê");
        System.out.print("Mời bạn nhập:");
        int chon=sc.nextInt();
        switch(chon){
            case 1:{
                System.out.println("Nhập mã sách mới: ");
                String mamoi=sc.nextLine();
                mamoi=sc.nextLine();
                dspth[t].setMa_sach(mamoi);
                System.out.println("+---------------------------------------Danh sách sách sau khi sửa----------------------------------------------------+");
                System.out.printf("%-20s%-20s%-20s%-30s%-20s%-20s%-20s%-30s\n","Mã phiếu thuê","Mã khách hàng","Mã sách","Ngày thuê","Số lượng thuê","Thời gian thuê","Giá tiền","Tình trạng thuê" );
                System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
                for(int i=0; i<n; i++)
                dspth[i].Xuat_PhieuThue();
                break;
            }
            case 2:{
                System.out.println("Nhập mã khách hàng  mới: ");
                String tenmoi=sc.nextLine();
                tenmoi=sc.nextLine();
                dspth[t].setMa_KH(tenmoi);
                System.out.println("+---------------------------------------Danh sách sách sau khi sửa----------------------------------------------------+");
                System.out.printf("%-20s%-20s%-20s%-30s%-20s%-20s%-20s%-30s\n","Mã phiếu thuê","Mã khách hàng","Mã sách","Ngày thuê","Số lượng thuê","Thời gian thuê","Giá tiền","Tình trạng thuê" );
                System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
                for(int i=0; i<n; i++)
                dspth[i].Xuat_PhieuThue();
                break;
            }
            case 3:{
                System.out.println("Nhập ngày thuê mới: ");
                dspth[t].setNgayThue();
                System.out.println("+---------------------------------------Danh sách sách sau khi sửa----------------------------------------------------+");
                System.out.printf("%-20s%-20s%-20s%-30s%-20s%-20s%-20s%-30s\n","Mã phiếu thuê","Mã khách hàng","Mã sách","Ngày thuê","Số lượng thuê","Thời gian thuê","Giá tiền","Tình trạng thuê" );
                System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
                for(int i=0; i<n; i++)
                dspth[i].Xuat_PhieuThue();
                break;
            } 
            case 4:{
                System.out.println("Nhập mã phiếu thuê mới: ");
                String mptmoi=sc.nextLine();
                mptmoi=sc.nextLine();
                dspth[t].setMaPTH(mptmoi);
                System.out.println("+---------------------------------------Danh sách sách sau khi sửa----------------------------------------------------+");
                System.out.printf("%-20s%-20s%-20s%-30s%-20s%-20s%-20s%-30s\n","Mã phiếu thuê","Mã khách hàng","Mã sách","Ngày thuê","Số lượng thuê","Thời gian thuê","Giá tiền","Tình trạng thuê" );
                System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
                for(int i=0; i<n; i++)
                dspth[i].Xuat_PhieuThue();
                break;
            }
        }
    }
    public void Xoa_PhieuThue(){
        if(n<1) System.out.println("Danh sách phiếu thuê rỗng.");
        else{
            System.out.println("Mời nhập mã phiếu thuê, mã khách hàng hoặc mã sách cần xoá: ");
            String mapth=sc.nextLine();
            for(int i=0; i<n; i++)
                if(dspth[i].getMaPTH().equalsIgnoreCase(mapth)||dspth[i].getMa_sach().equalsIgnoreCase(mapth)||dspth[i].getMa_KH().equalsIgnoreCase(mapth))
                {
                    for(int j=i;j<n-1;j++)
                        dspth[j]=dspth[j+1];
                    n--;
                }
            if(n<=0) System.out.println("Danh sách phiếu thuê rỗng.");
            else{
            System.out.println("+---------------------------------------Danh sách sách sau khi xoá----------------------------------------------------+");
            System.out.printf("%-20s%-20s%-20s%-30s%-20s%-20s%-20s%-30s\n","Mã phiếu thuê","Mã khách hàng","Mã sách","Ngày thuê","Số lượng thuê","Thời gian thuê","Giá tiền","Tình trạng thuê");
            System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
            for(int i=0; i<n; i++)
            dspth[i].Xuat_PhieuThue();
            }
        }
    }
    public static void main(String[] args){
       
        DS_PHIEUTHUE danhsach=new DS_PHIEUTHUE();
        danhsach.Nhap_DSPhieuThue();
        danhsach.Xuat_DSPhieuThue();
        danhsach.Xoa_PhieuThue();
    }
}

