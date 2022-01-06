/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROJECT;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class TAI_KHOAN {
    public String Ma_TK;
    public String Ten_TK;
    public String Phan_quyen;
    public String Ma_NV;
    Scanner sc=new Scanner(System.in);
    public TAI_KHOAN(){
        
        Ma_TK = "";
        Ten_TK = "";
        Phan_quyen = "";
        
    }
    
    public TAI_KHOAN(String ma_NV,String Ma_TK, String Ten_TK, String Phan_quyen){
        this.Ma_NV = ma_NV;
        this.Ma_TK = Ma_TK;
        this.Ten_TK = Ten_TK;
        this.Phan_quyen = Phan_quyen;
        
    }

    public String getMa_NV() {
        return Ma_NV;
    }

    public void setMa_NV(String Ma_NV) {
        this.Ma_NV = Ma_NV;
    }
    public void setMa_NV() {
        System.out.println("Mời bạn nhập mã nhân viên: ");
        Ma_NV = sc.nextLine();
    }
    public String getMa_TK() {
        return Ma_TK;
    }

    public void setMa_TK(String Ma_TK) {
        this.Ma_TK = Ma_TK;
    }
    public void setMa_TK(){
        System.out.println("Mời bạn nhập mã tài khoản: ");
        Ma_TK = sc.nextLine();
    }

    public String getTen_TK() {
        return Ten_TK;
    }

    public void setTen_TK(String Ten_TK) {
        this.Ten_TK = Ten_TK;
    }

    public void setTen_TK(){
        System.out.println("Mời bạn nhập tên tài khoản: ");
        Ten_TK = sc.nextLine();
    }

    public String getPhan_quyen() {
        return Phan_quyen;
    }

    public void setPhan_quyen(String Phan_quyen) {
        this.Phan_quyen = Phan_quyen;
    }
     public void setPhan_quyen() {
        System.out.println("Mời bạn nhập phân quyền: ");
        System.out.println("Admin(Ad)");
         System.out.println("Nhân viên(NV)");
         System.out.println("Quản lí(QL)"); 
        Phan_quyen = sc.nextLine();
        switch(Phan_quyen){
            case "Ad":{Phan_quyen_Ad();}
            case "NV":{Phan_quyen_NV();}
            case "QL":{Phan_quyen_QL();}
            default:{System.out.println("Mời bạn nhập lại: ");Phan_quyen = sc.nextLine();};
        }
    }
    
    public void Phan_quyen_Ad(){
        System.out.println("Bạn có thể chỉnh sửa tất cả.");
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
                }
                default -> {
                    System.out.println("Mời bạn nhập lại: ");
                    chon=sc.nextInt();
                }
                
            }
            System.out.println("Nhan bat ki de tiep tuc!Nhan t de thoat." ); 
            char c=sc.next().charAt(0);
            if ((c =='T')||(c =='t'))
                break;
        }
        while(true);
    
    }
    /*-----------------------------------------------------------------------------------------------------------------------------------------------------*/
    public void Phan_quyen_NV(){
        System.out.println("Bạn có thể chỉnh sửa  phiếu bán, phiếu thuê, phiếu trả, khách hàng.");
                do
        {
            System.out.println("Chào mừng bạn đến với chương trình quản lí cửa hàng sách.");
            System.out.println("Bạn muốn làm ?");
            System.out.println("1.Khách hàng");                 
            System.out.println("7.Phiếu thuê");
            System.out.println("8.Phiếu trả");
            System.out.println("9.Phiếu bán");
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
                default -> {
                    System.out.println("Mời bạn nhập lại: ");
                    chon=sc.nextInt();
                } 
            }
            System.out.println("Nhan bat ki de tiep tuc!Nhan t de thoat." ); 
            char c=sc.next().charAt(0);
            if ((c =='T')||(c =='t'))
                break;
        }
        while(true);
                
    }
/*---------------------------------------------------------------------------------------------------------------------------------------*/    
    public void Phan_quyen_QL(){
        System.out.println("Bạn có thể chỉnh sửa phiếu nhập, phiếu bán, phiếu thuê, phiếu trả, khách hàng, nhân viên .");
                do
        {
            System.out.println("Chào mừng bạn đến với chương trình quản lí cửa hàng sách.");
            System.out.println("Bạn muốn làm ?");
            System.out.println("1.Khách hàng");
            System.out.println("2.Nhân viên");
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
                default -> {
                    System.out.println("Mời bạn nhập lại: ");
                    chon=sc.nextInt();
                }
            }
            System.out.println("Nhan bat ki de tiep tuc!Nhan t de thoat." ); 
            char c=sc.next().charAt(0);
            if ((c =='T')||(c =='t'))
                break;
        }
        while(true);
    
    }
    public void Nhap_TK(){
        setMa_NV();
        setMa_TK();
        setTen_TK();
        setPhan_quyen();
    }
    public void Xuat_TK(){    
        System.out.println("+------------------Thông tin mà bạn vừa nhập---------------------+");
        System.out.println("Mã NV: "+ Ma_NV +"\n"+"\n"+ "Mã tài khoản: "+ Ma_TK +"\n"+"\n"+ "Tên tài khoản: "+ Ten_TK +" Phân quyền: "+Phan_quyen);
        //System.out.println(this.tinhLuong());
    }
    public static void main(String[]args){
        TAI_KHOAN A = new TAI_KHOAN();
        A.Nhap_TK();
        A.Xuat_TK();
    }
}
