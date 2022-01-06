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
public class DS_PHIEUTRA {
    Scanner sc=new Scanner(System.in);
    protected int n;
    PHIEU_TRA[] dsptr;
    public DS_PHIEUTRA(){
        dsptr=null;
        n=0;
    }
    public void Nhap_DSPhieuTra(){
        System.out.println("Mời nhập số lượng phiếu trả cần nhập: ");
        n=Integer.parseInt(sc.nextLine());
        dsptr=new PHIEU_TRA[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhập phiếu trả thứ "+(i+1));
            dsptr[i]=new PHIEU_TRA();
            dsptr[i].Nhap();
        }
    }
    public void Xuat_DSPhieuTra()
    {
        System.out.println("+---------------------------------------------------------Danh sách sách vừa nhập----------------------------------------------------+");
        System.out.printf("%-20s%-20s%-20s%-30s%-20s%-20s%-20s%-30s\n","Mã phiếu trả","Mã khách hàng","Mã sách","Ngày trả","Số lượng trả","Thời gian thuê","Tình trạng trả" ,"Xử phạt");
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
        for(int i=0;i<n;i++)
        System.out.printf("%-20s%-20s%-20s%-10s%-10s%-10s%-20s%-20s%-20s%-30s\n",dsptr[i].MaPTR,dsptr[i].Ma_KH,dsptr[i].Ma_sach,dsptr[i].ngayTra.ngay,dsptr[i].ngayTra.thang,dsptr[i].ngayTra.nam,dsptr[i].soluongTra,dsptr[i].thoigianThue,dsptr[i].tinhtrangTra,dsptr[i].xuphat);
    }
    public void timkiemmasach()
    {
        
        System.out.println("Nhập vào mã sách cần tìm:");
        String maSach=sc.nextLine();
        int k=0;
        for(int i=0; i<n; i++)
            if(dsptr[i].getMa_sach().equalsIgnoreCase(maSach))
            {
                dsptr[i].Xuat_ds_ptr();
                k=1;
            }        
        if (k==0) System.out.println("Không có mã sách này.");
    }
    public void timkiemmakhach()
    {
        
        System.out.println("Nhập vào mã khách hàng cần tìm:");
        String maKhach=sc.nextLine();
        int k=0;
        for(int i=0; i<n; i++)
            if(dsptr[i].getMa_KH().equalsIgnoreCase(maKhach))
            {
                dsptr[i].Xuat_ds_ptr();
                k=1;
            } 
        if (k==0) System.out.println("Không có mã khách hàng này.");
    }
        public void timkiemmaptr()
    {
        
        System.out.println("Nhập vào mã phiếu trả cần tìm:");
        String maptr=sc.nextLine();
        int k=0;
        for(int i=0; i<n; i++)
            if(dsptr[i].getMaPTR().equalsIgnoreCase(maptr))
            {
                dsptr[i].Xuat_ds_ptr();
                k=1;
            } 
        if (k==0) System.out.println("Không có mã phiếu trả này.");
    }
    public void timkiemngaythue()
    {
        
        System.out.println("Nhập vào ngày thuê cần tìm:");
        DATE ngaytra =new DATE();
        ngaytra.Nhap(); 
        int k=0;
        for(int i=0; i<n; i++)
            if(dsptr[i].getNgayTra().getNgay()== ngaytra.ngay && dsptr[i].getNgayTra().getThang()== ngaytra.thang &&dsptr[i].getNgayTra().getNam()== ngaytra.nam)
            {
                dsptr[i].Xuat_ds_ptr();
                k=1;
            } 
        if (k==0) System.out.println("Không có ngày thuê này.");
    }
    public void Them_PhieuTra(){
        System.out.println("Mời nhập số lượng phiếu trả cần thêm: ");
        int m=Integer.parseInt(sc.nextLine());
        System.out.println("Mời nhập phiếu trả cần thêm: ");
        for(int i=1;i<=m;i++)
        {
            System.out.println("PhieuTra "+i);
           PHIEU_TRA ptr=new PHIEU_TRA();
            ptr.Nhap();
            dsptr = Arrays.copyOf(dsptr, dsptr.length +1); 
            dsptr[n]=ptr;
            n++;
        }
        System.out.println("+---------------------------------------Danh sách sách sau khi thêm----------------------------------------------------+");
        System.out.printf("%-20s%-20s%-20s%-30s%-20s%-20s%-20s%-30s\n","Mã phiếu trả","Mã khách hàng","Mã sách","Ngày trả","Số lượng trả","Thời gian thuê","Tình trạng trả" ,"Xử phạt");
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
        for(int i=0; i<n; i++)
        dsptr[i].Xuat_PhieuTra();
    }
    public void Sua_PhieuTra(){
        int t=0;
        System.out.println("Mời nhập phiếu trả cần sửa");
        String maptr=sc.nextLine();
        for(int i=0; i<n; i++)
            if(dsptr[i].getMaPTR().equalsIgnoreCase(maptr)||dsptr[i].getMa_sach().equalsIgnoreCase(maptr)||dsptr[i].getMa_KH().equalsIgnoreCase(maptr) )  
            {
                dsptr[i].Xuat_PhieuTra();
                t=i;
            }
            else{
                System.out.println("Không có mã phiếu trả (hoặc mã KH) đó!");
                System.exit(0);
            }
        System.out.println("Bạn muốn sửa gì? ");
        System.out.println("1.Mã sách ");
        System.out.println("2.Tên khách hàng");
        System.out.println("3.Ngày trả");
        System.out.println("4.Xử phạt");
        System.out.println("5.Mã phiếu trả");
        System.out.print("Mời bạn nhập:");
        int chon=sc.nextInt();
        switch(chon){
            case 1:{
                System.out.println("Nhập mã sách mới: ");
                String mamoi=sc.next();
                mamoi=sc.next();
                dsptr[t].setMa_sach(mamoi);
                System.out.println("+---------------------------------------Danh sách sách sau khi sửa----------------------------------------------------+");
                System.out.printf("%-20s%-20s%-20s%-30s%-20s%-20s%-20s%-30s\n","Mã phiếu trả","Mã khách hàng","Mã sách","Ngày trả","Số lượng trả","Thời gian thuê","Tình trạng trả" ,"Xử phạt");
                System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
                for(int i=0; i<n; i++)
                dsptr[i].Xuat_PhieuTra();
                break;
            }
            case 2:{
                System.out.println("Nhập mã khách hàng mới: ");
                String tenmoi=sc.next();
                tenmoi=sc.next();
                dsptr[t].setMa_KH(tenmoi);
                System.out.println("+---------------------------------------Danh sách sách sau khi sửa----------------------------------------------------+");
                System.out.printf("%-20s%-20s%-20s%-30s%-20s%-20s%-20s%-30s\n","Mã phiếu trả","Mã khách hàng","Mã sách","Ngày trả","Số lượng trả","Thời gian thuê","Tình trạng trả" ,"Xử phạt");
                System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
                for(int i=0; i<n; i++)
                dsptr[i].Xuat_PhieuTra();
                break;
            }
            case 3:{
                System.out.println("Nhập ngày trả mới: ");
                dsptr[t].setNgayTra();
                System.out.println("+---------------------------------------Danh sách sách sau khi sửa----------------------------------------------------+");
                System.out.printf("%-20s%-20s%-20s%-30s%-20s%-20s%-20s%-30s\n","Mã phiếu trả","Mã khách hàng","Mã sách","Ngày trả","Số lượng trả","Thời gian thuê","Tình trạng trả" ,"Xử phạt");
                System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
                for(int i=0; i<n; i++)
                dsptr[i].Xuat_PhieuTra();
                break;
            } 
            case 4:{
                System.out.println("Nhập hình thức xử phạt mới: ");
                String tenmoi=sc.next();
                tenmoi=sc.next();
                dsptr[t].setXuphat(tenmoi);
                System.out.println("+---------------------------------------Danh sách sách sau khi sửa----------------------------------------------------+");
                System.out.printf("%-20s%-20s%-20s%-30s%-20s%-20s%-20s%-30s\n","Mã phiếu trả","Mã khách hàng","Mã sách","Ngày trả","Số lượng trả","Thời gian thuê","Tình trạng trả" ,"Xử phạt");
                System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
                for(int i=0; i<n; i++)
                dsptr[i].Xuat_PhieuTra();
                break;
            } 
            case 5:{
                System.out.println("Nhập mã phiếu trả mới: ");
                String mptmoi=sc.nextLine();
                mptmoi=sc.nextLine();
                dsptr[t].setMaPTR(mptmoi);
                System.out.println("+---------------------------------------Danh sách sách sau khi sửa----------------------------------------------------+");
                System.out.printf("%-20s%-20s%-20s%-30s%-20s%-20s%-20s%-30s\n","Mã phiếu trả","Mã khách hàng","Mã sách","Ngày trả","Số lượng trả","Thời gian thuê","Tình trạng trả" ,"Xử phạt");
                System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
                for(int i=0; i<n; i++)
                dsptr[i].Xuat_PhieuTra();
                break;
            }
        }
    } 
public void Xoa_PhieuTra(){
    if(n<1) System.out.println("Danh sách phiếu trả  rỗng.");
    else{
        System.out.println("Mời nhập phiếu trả cần xoá: ");
        String maptr=sc.nextLine();

        for(int i=0; i<n; i++)
            if(dsptr[i].getMaPTR().equalsIgnoreCase(maptr)||dsptr[i].getMa_sach().equalsIgnoreCase(maptr)||dsptr[i].getMa_KH().equalsIgnoreCase(maptr))
            {
                for(int j=i;j<n-1;j++)
                    dsptr[j]=dsptr[j+1];
                n--;
            }
        if(n<=0) System.out.println("Danh sách phiếu trả rỗng.");
        else{
        System.out.println("+---------------------------------------Danh sách sách sau khi xoá----------------------------------------------------+");
        System.out.printf("%-20s%-20s%-20s%-30s%-20s%-20s%-20s%-30s\n","Mã phiếu trả","Mã khách hàng","Mã sách","Ngày trả","Số lượng trả","Thời gian thuê","Tình trạng trả" ,"Xử phạt");
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
        for(int i=0; i<n; i++)
        dsptr[i].Xuat_PhieuTra();
        }
    }
}
public static void main(String[] args){
       
    DS_PHIEUTRA danhsach=new DS_PHIEUTRA();
        danhsach.Nhap_DSPhieuTra();
        danhsach.Xuat_DSPhieuTra();
       
        danhsach.Xoa_PhieuTra();
    }
}

