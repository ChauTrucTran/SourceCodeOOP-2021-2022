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
public class DS_SACH {
    Scanner sc=new Scanner(System.in);
    protected int n;
    SACH[] dss;
    public DS_SACH(){
        dss=null;
        n=0;
    }
    public void Nhap_DSS(){
        System.out.println("Mời nhập danh sách sách:");
        System.out.println("Mời nhập số lượng sách cần nhập: ");
        n=Integer.parseInt(sc.nextLine());
        dss=new SACH[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhập sách thứ "+(i+1));
            System.out.println("Bạn muốn nhập thể loại nào: ");
            System.out.println("1.Tiểu thuyết.");
            System.out.println("2.Truyện tranh.");
            System.out.println("3.Văn học.");
            int t=sc.nextInt();
            while(t>3 || t<1){
            System.out.println("Mời bạn nhập lại: ");
            t=sc.nextInt();
            }
            switch(t){
                case 1:{
                    dss[i]=new TIEU_THUYET();
                    dss[i].Nhap_sach();
                    break;
                }
                case 2:{
                    dss[i]=new TRUYEN_TRANH();
                    dss[i].Nhap_sach();
                    break;
                }
                case 3:{
                    dss[i]=new VAN_HOC();
                    dss[i].Nhap_sach();
                    break;
                }
            }
            
        }
    }
    public void Xuat_DSS()
    {
        System.out.println("+---------------------------------------------------------Danh sách sách vừa nhập----------------------------------------------------+");
        System.out.printf("%-25s%-25s%-50s%-25s%-25s\n","Mã thể loại","Mã sách","Tên sách","Mã NXB", "Mã tác giả");
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
        for(int i=0;i<n;i++)
            dss[i].Xuat_sach();
            /*System.out.printf("%-25s%-25s%-50s%-25s%-25s\n",dss[i].Ma_TL,dss[i].Ma_sach,dss[i].Ten_sach,dss[i].NXB, dss[i].Ma_TG);    
    */}
    public void timkiemsach()
    {
        System.out.println("Nhập vào tên sách cần tìm (mã hoặc tên):");
        String sach=sc.nextLine();
        sach=sc.nextLine();
        int k=0;
        System.out.println("+---------------------------------------Danh sách sách đã tìm kiếm----------------------------------------------------+");
        System.out.printf("%-25s%-25s%-50s%-25s%-25s\n","Mã thể loại","Mã sách","Tên sách","Mã NXB", "Mã tác giả");
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
        for(int i=0; i<n; i++)
            if(dss[i].getTen_sach().equalsIgnoreCase(sach)||dss[i].getMa_sach().equalsIgnoreCase(sach))
            {
                dss[i].Xuat_sach();
                k=1;
            }        
        if (k==0) System.out.println("Không có tên sách này.");
    }
    public void Them_sach(){
        System.out.println("Mời nhập số lượng sách cần thêm: ");
        int m=sc.nextInt();
        System.out.println("Mời nhập sách cần thêm: ");
        for(int i=1;i<=m;i++)
        {
            System.out.println("Sách "+i);
            System.out.println("Bạn muốn nhập thể loại nào: ");
            System.out.println("1.Tiểu thuyết.");
            System.out.println("2.Truyện tranh.");
            System.out.println("3.Văn học.");
            int t=sc.nextInt();
            while(t>3 || t<1){
            System.out.println("Mời bạn nhập lại: ");
            t=sc.nextInt();
            }
            switch(t){
                case 1:{
                    SACH sach=new TIEU_THUYET();
                    sach.Nhap_sach();
                    dss = Arrays.copyOf(dss, dss.length +1); 
                    dss[n]=sach;
                    n++;
                    break;
                }
                case 2:{
                    SACH sach=new TRUYEN_TRANH();
                    sach.Nhap_sach();
                    dss = Arrays.copyOf(dss, dss.length +1); 
                    dss[n]=sach;
                    n++;
                    break;
                }
                case 3:{
                    SACH sach=new VAN_HOC();
                    sach.Nhap_sach();
                    dss = Arrays.copyOf(dss, dss.length +1); 
                    dss[n]=sach;
                    n++;
                    break;
                }
            }  
        }
        System.out.println("+---------------------------------------Danh sách sách sau khi thêm----------------------------------------------------+");
        System.out.printf("%-25s%-25s%-50s%-25s%-25s\n","Mã thể loại","Mã sách","Tên sách","Mã NXB", "Mã tác giả");
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
        for(int i=0; i<n; i++)
        dss[i].Xuat_sach();
    }
    public void Sua_sach(){
        int t=0;
        System.out.println("Mời nhập sách cần sửa (mã hoặc tên):");
        String ms=sc.nextLine();
        ms=sc.nextLine();
        for(int i=0; i<n; i++)
            if(dss[i].getMa_sach().equalsIgnoreCase(ms)||dss[i].getTen_sach().equalsIgnoreCase(ms) )
            {
                dss[i].Xuat_sach();
                t=i;
            }
            else{
                System.out.println("Không có sách này.");
                return;
            }
        System.out.println("Bạn muốn sửa gì? ");
        System.out.println("1.Mã sách");
        System.out.println("2.Tên sách");
        System.out.print("Mời bạn nhập:");
        int chon=sc.nextInt();
        while(chon>2 || chon<1) {
            System.out.println("Mời bạn nhập lại: ");
            chon=sc.nextInt();
        }
        switch(chon){
            case 1 -> {
                System.out.println("Nhập mã sách mới: ");
                String mamoi=sc.next();
                dss[t].setMa_sach(mamoi);
                System.out.println("+---------------------------------------Danh sách sách sau khi sửa----------------------------------------------------+");
                System.out.printf("%-25s%-25s%-50s%-25s%-25s\n","Mã thể loại","Mã sách","Tên sách","Mã NXB", "Mã tác giả");
                System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
                for(int i=0; i<n; i++)
                dss[i].Xuat_sach();
                break;
            }
            case 2 -> {
                System.out.println("Nhập tên sách mới: ");
                String tenmoi=sc.next();
                dss[t].setTen_sach(tenmoi);
                System.out.println("+---------------------------------------Danh sách sách sau khi sửa----------------------------------------------------+");
                System.out.printf("%-25s%-25s%-50s%-25s%-25s\n","Mã thể loại","Mã sách","Tên sách","Mã NXB", "Mã tác giả");
                System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
                for(int i=0; i<n; i++)
                dss[i].Xuat_sach();
                break;
            }
        }
    }
    public void Xoa_sach(){
        if(n<1) System.out.println("Danh sách sách rỗng.");
        else{
            System.out.println("Mời nhập sách cần xoá (mã hoặc tên): ");
            String mas=sc.nextLine();
            mas=sc.nextLine();
            for(int i=0; i<n; i++)
                if(dss[i].getMa_sach().equalsIgnoreCase(mas)||dss[i].getTen_sach().equalsIgnoreCase(mas))
                {
                    for(int j=i;j<n-1;j++)
                        dss[j]=dss[j+1];
                    n--;
                }
            
            if(n<=0) System.out.println("Danh sách rỗng.");
            else{
            System.out.println("+---------------------------------------Danh sách sách sau khi xoá----------------------------------------------------+");
            System.out.printf("%-25s%-25s%-50s%-25s%-25s\n","Mã thể loại","Mã sách","Tên sách","Mã NXB", "Mã tác giả");
            System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
            for(int i=0; i<n; i++)
            dss[i].Xuat_sach();
            }
        }
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
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
        while(lua>4 || lua<1) {
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
    }

