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
public class MAIN {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); 
        do
        {
            System.out.println("Chào mừng bạn đến với chương trình quản lí cửa hàng sách.");
            System.out.println("Bạn muốn làm ?");
            System.out.println("1.Khách hàng");
            System.out.println("2.Nhân viên");
            System.out.println("3.Sách");
            System.out.println("4.Tác giả");
            System.out.println("5.Nhà xuất bản");
            System.out.println("6.Nhà cung cấp");
            System.out.println("7.Phiếu thuê");
            System.out.println("8.Phiếu trả");
            System.out.println("9.Phiếu bán");
            System.out.println("10.Phiếu nhập");
            int chon=sc.nextInt();
            switch(chon)
            {
                case 1 -> {
                    DS_KHACH_HANG danhsach=new DS_KHACH_HANG();
                    danhsach.Nhap_DS_KH();
                    danhsach.Xuat_DS_KH();
                    System.out.println("-----DANH SÁCH KHÁCH HÀNG-----");
                    System.out.println("1.Xoá khách hàng");
                    System.out.println("2.Sửa khách hàng");
                    System.out.println("3.Thêm khách hàng");
                    System.out.println("4.Tìm kiếm khách hàng");
                    System.out.print("Mời nhập lựa chọn:");
                    int lua=sc.nextInt();
                    while(lua>4 || lua<1) {
                        System.out.println("Mời bạn nhập lại: ");
                        lua=sc.nextInt();
                    }
                    switch(lua){
                        case 1:{ 
                            danhsach.Xoa_kh(); 
                            break;
                        }
                        case 2:{ 
                            danhsach.Sua_kh(); 
                            break;
                        }
                        case 3:{ 
                            danhsach.Them_kh();
                            break;
                        }
                        case 4:{ 
                            danhsach.timkiemkh();
                            break;
                        }
                    }
                    break;
                }
                case 2-> {
                    DS_NV danhsach=new DS_NV();
                    danhsach.Nhap_DSNV();
                    danhsach.Xuat_DSNV();
                   // danhsach.tim_kiem_NV();
                   // danhsach.tim_kiem_ma_NV();
                    //danhsach.Sua_NV();
                   // danhsach.Them_NV();
                    //danhsach.Xoa_NV();
                    System.out.println("-----DANH SÁCH NHÂN VIÊN-----");
                    System.out.println("1.Xoá nhân viên");
                    System.out.println("2.Sửa nhân viên");
                    System.out.println("3.Thêm nhân viên");
                    System.out.println("4.Tìm kiếm nhân viên");
                    System.out.print("Mời nhập lựa chọn:");
                    int lua=sc.nextInt();
                    while(lua>4 && lua<1) {
                        System.out.println("Mời bạn nhập lại: ");
                        lua=sc.nextInt();
                    }
                    switch(lua){
                        case 1:{ 
                            danhsach.Xoa_NV(); 
                            break;
                        }
                        case 2:{ 
                            danhsach.Sua_NV();     
                            break;
                        }
                        case 3:{ 
                            danhsach.Them_NV();
                            break;
                        }
                        case 4:{ 
                            danhsach.tim_kiem_NV();
                            break;
                        }
                    }
                    break;
                }
                case 3-> {
                    DS_SACH danhsach=new DS_SACH();
                    danhsach.Nhap_DSS();
                    danhsach.Xuat_DSS();
                    System.out.println("Bạn muốn thực hiện thao tác gì với danh sách sách:");
                    System.out.println("1.Xoá sách");
                    System.out.println("2.Sửa sách");
                    System.out.println("3.Thêm sách");
                    System.out.println("4.Tìm kiếm sách");
                    System.out.print("Mời nhập lựa chọn:");
                    int lua=sc.nextInt();
                    while(lua>4 && lua<1) {
                        System.out.println("Mời bạn nhập lại: ");
                        lua=sc.nextInt();
                    }
                    switch(lua){
                        case 1:{ 
                            danhsach.Xoa_sach(); 
                            break;
                        }
                        case 2:{ 
                            danhsach.Sua_sach(); 
                            break;
                        }
                        case 3:{ 
                            danhsach.Them_sach();
                            break;
                        }
                        case 4:{ 
                            danhsach.timkiemsach();
                            break;
                        }
                    }
                    break;
                }
                case 4-> {
                    DS_TG danhsach=new DS_TG();
                    danhsach.Nhap_DSTG();
                    danhsach.Xuat_DSTG();
                   // danhsach.tim_kiem_TG();
                   // danhsach.tim_kiem_ma_TG();
                    //danhsach.Sua_TG();
                   // danhsach.Them_TG();
                    //danhsach.Xoa_TG();
                    System.out.println("----DANH SÁCH TÁC GIẢ----:");
                    System.out.println("1.Xoá tác giả");
                    System.out.println("2.Sửa tác giả");
                    System.out.println("3.Thêm tác giả");
                    System.out.println("4.Tìm kiếm tác giả");
                    System.out.print("Mời nhập lựa chọn:");
                    int lua=sc.nextInt();
                    while(lua>4 && lua<1) {
                        System.out.println("Mời bạn nhập lại: ");
                        lua=sc.nextInt();
                    }
                    switch(lua){
                        case 1:{ 
                            danhsach.Xoa_TG(); 
                            break;
                        }
                        case 2:{ 
                            danhsach.Sua_TG(); 
                            break;
                        }
                        case 3:{ 
                            danhsach.Them_TG();
                            break;
                        }
                        case 4:{ 
                            danhsach.tim_kiem_TG();
                            break;
                        }
                    }
                    break;
        
                }
                case 5-> {
                    DS_NXB danhsach=new DS_NXB();
                    danhsach.Nhap_DSNXB();
                    danhsach.Xuat_DSNXB();
                    System.out.println("----DANH SÁCH NHÀ XUẤT BẢN----:");
                    System.out.println("1.Xoá nhà xuất bản");
                    System.out.println("2.Sửa nhà xuất bản");
                    System.out.println("3.Thêm nhà xuất bản");
                    System.out.println("4.Tìm kiếm nhà xuất bản");
                    System.out.print("Mời nhập lựa chọn:");
                    int lua=sc.nextInt();
                    while(lua>4 && lua<1) {
                        System.out.println("Mời bạn nhập lại: ");
                        lua=sc.nextInt();
                    }
                    switch(lua){
                        case 1:{ 
                            danhsach.Xoa_NXB(); 
                            break;
                        }
                        case 2:{ 
                            danhsach.Sua_NXB(); 
                            break;
                        }
                        case 3:{ 
                            danhsach.Them_NXB();
                            break;
                        }
                        case 4:{ 
                            danhsach.timkiemNXB();
                            break;
                        }
                    }
                    break;
                }
                case 6-> {
                    DS_NCC danhsach=new DS_NCC();
                    danhsach.Nhap_DSNCC();
                    danhsach.Xuat_DSNCC();    
                    System.out.println("----DANH SÁCH NHÀ CUNG CẤP----:");
                    System.out.println("1.Xoá nhà cung cấp");
                    System.out.println("2.Sửa nhà cung cấp");
                    System.out.println("3.Thêm nhà cung cấp");
                    System.out.println("4.Tìm kiếm nhà cung cấp");
                    System.out.print("Mời nhập lựa chọn:");
                    int lua=sc.nextInt();
                    while(lua>4 && lua<1) {
                        System.out.println("Mời bạn nhập lại: ");
                        lua=sc.nextInt();
                    }
                    switch(lua){
                        case 1:{ 
                            danhsach.Xoa_NCC(); 
                            break;
                        }
                        case 2:{ 
                            danhsach.Sua_NCC(); 
                            break;
                        }
                        case 3:{ 
                            danhsach.Them_NCC();
                            break;
                        }
                        case 4:{ 
                            danhsach.timkiemNCC();
                            break;
                        }
                    }
                    break;
                }
                case 7-> {
                    DS_PHIEUTHUE PTH = new DS_PHIEUTHUE();
                    PTH.Nhap_DSPhieuThue();
                    PTH.Xuat_DSPhieuThue();
                    System.out.println("----DANH SÁCH PHIẾU THUÊ----:");
                    System.out.println("1.Xoá phiếu thuê");
                    System.out.println("2.Sửa phiếu thuê");
                    System.out.println("3.Thêm phiếu thuê");
                    System.out.println("4.Tìm kiếm phiếu thuê");
                    System.out.print("Mời nhập lựa chọn:");
                    int lua=sc.nextInt();
                    while(lua>4 && lua<1) {
                        System.out.println("Mời bạn nhập lại: ");
                        lua=sc.nextInt();
                    }
                    switch(lua){
                        case 1:{ 
                            PTH.Xoa_PhieuThue(); 
                            break;
                        }
                        case 2:{ 
                            PTH.Sua_PhieuThue(); 
                            break;
                        }
                        case 3:{ 
                            PTH.Them_PhieuThue();
                            break;
                        }
                        case 4:{ 
                            System.out.println("Bạn muốn tìm kiếm theo:");
                            System.out.println("1.Mã phiếu thuê");
                            System.out.println("2.Mã sách");
                            System.out.println("3.Mã khách hàng");
                            System.out.println("4.Ngày thuê");
                            int tim=sc.nextInt();
                            switch(tim){
                                case 1:{PTH.timkiemmaPTH();break;}
                                case 2:{PTH.timkiemmasach();break;}
                                case 3:{PTH.timkiemmakhach();break;}
                                case 4:{PTH.timkiemngaythue();break;}
                                default:
                                {
                                    System.out.println("Bạn nhập sai, mời nhập lại: ");
                                    tim=sc.nextInt();
                                }
                            }
                            
                            break;
                        }
                    }
                    break;    
                }
                case 8-> {
                    DS_PHIEUTRA PTR = new DS_PHIEUTRA();
                    PTR.Nhap_DSPhieuTra();
                    PTR.Xuat_DSPhieuTra();
                    System.out.println("----DANH SÁCH PHIẾU THUÊ----:");
                    System.out.println("1.Xoá phiếu thuê");
                    System.out.println("2.Sửa phiếu thuê");
                    System.out.println("3.Thêm phiếu thuê");
                    System.out.println("4.Tìm kiếm phiếu thuê");
                    System.out.print("Mời nhập lựa chọn:");
                    int lua=sc.nextInt();
                    while(lua>4 && lua<1) {
                        System.out.println("Mời bạn nhập lại: ");
                        lua=sc.nextInt();
                    }
                    switch(lua){
                        case 1:{ 
                            PTR.Xoa_PhieuTra(); 
                            break;
                        }
                        case 2:{ 
                            PTR.Sua_PhieuTra(); 
                            break;
                        }
                        case 3:{ 
                            PTR.Them_PhieuTra();
                            break;
                        }
                        case 4:{ 
                            System.out.println("Bạn muốn tìm kiếm theo:");
                            System.out.println("1.Mã phiếu trả");
                            System.out.println("2.Mã sách");
                            System.out.println("3.Mã khách hàng");
                            System.out.println("4.Ngày thuê");
                            int tim=sc.nextInt();
                            switch(tim){
                                case 1:{PTR.timkiemmaptr();break;}
                                case 2:{PTR.timkiemmasach();break;}
                                case 3:{PTR.timkiemmakhach();break;}
                                case 4:{PTR.timkiemngaythue();break;}
                                default:
                                {
                                    System.out.println("Bạn nhập sai, mời nhập lại: ");
                                    tim=sc.nextInt();
                                }
                            }
                            
                            break;
                        }
                    }
                    break;    
                }
                case 9-> {
                    DS_PHIEU_BAN danhsach=new DS_PHIEU_BAN();
                    danhsach.Nhap_DSPB();
                    danhsach.Xuat_DSPB();
                    System.out.println("----DANH SÁCH PHIẾU BÁN----");
                    System.out.println("1.Xoá phiếu bán");
                    System.out.println("2.Sửa phiếu bán");
                    System.out.println("3.Thêm phiếu bán");
                    System.out.println("4.Tìm kiếm phiếu bán");
                    System.out.print("Mời nhập lựa chọn:");
                    int lua=sc.nextInt();
                    while(lua>4 && lua<1) {
                        System.out.println("Mời bạn nhập lại: ");
                        lua=sc.nextInt();
                    }
                    switch(lua){
                        case 1:{ 
                            danhsach.Xoa_PB(); 
                            break;
                        }
                        case 2:{ 
                            danhsach.Sua_PB(); 
                            break;
                        }
                        case 3:{ 
                            danhsach.Them_Ma_PB();
                            break;
                        }
                        case 4:{ 
                            System.out.println("Bạn muốn tìm theo:");
                            System.out.println("1.Mã phiếu bán");
                            System.out.println("2.Ngày bán");
                            int t=sc.nextInt();
                            switch(t){
                                case 1:{danhsach.Tim_Ma_PB();break;}
                                case 2:{danhsach.Tim_Ngay_ban();break;}
                            }
                            break;
                        }
                    }
                    break; 
                }
                case 10-> {
                    DS_PHIEU_NHAP danhsach=new DS_PHIEU_NHAP();
                    danhsach.Nhap_DSPN();
                    danhsach.Xuat_DSPN();
                    System.out.println("----DANH SÁCH PHIẾU NHẬP----");
                    System.out.println("1.Xoá phiếu nhập");
                    System.out.println("2.Sửa phiếu nhập");
                    System.out.println("3.Thêm phiếu nhập");
                    System.out.println("4.Tìm kiếm phiếu nhập");
                    System.out.print("Mời nhập lựa chọn:");
                    int lua=sc.nextInt();
                    while(lua>4 && lua<1) {
                        System.out.println("Mời bạn nhập lại: ");
                        lua=sc.nextInt();
                    }
                    switch(lua){
                        case 1:{ 
                            danhsach.Xoa_PN(); 
                            break;
                        }
                        case 2:{ 
                            danhsach.Sua_PN(); 
                            break;
                        }
                        case 3:{ 
                            danhsach.Them_Ma_PN();
                            break;
                        }
                        case 4:{ 
                            System.out.println("Bạn muốn tìm theo:");
                            System.out.println("1.Mã phiếu nhập");
                            System.out.println("2.Ngày nhập");
                            int t=sc.nextInt();
                            switch(t){
                                case 1:{danhsach.Tim_Ma_PN();break;}
                                case 2:{danhsach.Tim_Ngay_nhap();break;}
                            }
                            break;
                        }
                    }
                    break;
                }
            }
            System.out.println("Nhan bat ki de tiep tuc!Nhan t de thoat." ); 
            char c=sc.next().charAt(0);
            if ((c =='T')||(c =='t'))
                break;
        }
        while(true);
    }
       
}
