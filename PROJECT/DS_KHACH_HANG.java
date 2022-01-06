
package PROJECT;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author HP
 */
public class DS_KHACH_HANG {
    Scanner sc=new Scanner(System.in);
    protected int n;
    KHACH_HANG[] dskh;
    public DS_KHACH_HANG(){
        dskh=null;
        n=0;
    }
    public void Nhap_DS_KH(){
        System.out.println("Mời nhập danh sách KH");
        System.out.println("Mời nhập số lượng KH cần nhập: ");
        n=Integer.parseInt(sc.nextLine());
        dskh=new KHACH_HANG[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhập khách hàng thứ "+(i+1));
            dskh[i]=new KHACH_HANG();
            dskh[i].Nhap_KH();
            
        }
    }
    public void Xuat_DS_KH()
    {
        System.out.println("+---------------------------------------------------------Danh sách sách vừa nhập----------------------------------------------------+");
        System.out.printf("%-25s%-30s%-30s%-30s%-10s%-25s%-50s\n","Mã KH","Họ tên KH","Ngày sinh","Giới tính","Địa chỉ", "Số điện thoại", "Địa chỉ email");
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
        for(int i=0;i<n;i++)
            dskh[i].Xuat_KH();
            /*System.out.printf("%-25s%-30s%-10s%-10s%-10s%-30s%-25s%-50s\n",dss[i].Ma_TL,dss[i].Ma_sach,dss[i].Ten_sach,dss[i].NXB, dss[i].Ma_TG);    
    */}
    public void timkiemkh()
    {
        System.out.println("Nhập vào tên khách hàng cần tìm(mã hoặc tên):");
        String khachhang=sc.nextLine();
        khachhang=sc.nextLine();
        int k=0;
        for(int i=0; i<n; i++)
            if(dskh[i].getHo_ten().equalsIgnoreCase(khachhang)||dskh[i].getMa_KH().equalsIgnoreCase(khachhang))
            {
                dskh[i].Xuat_ds_tk();
                k=1;
            }        
        if (k==0) System.out.println("Không có tên khách hàng này.");
    }
    public void Them_kh(){
        System.out.println("Mời nhập số lượng khách hàng cần thêm: ");
        int m=Integer.parseInt(sc.nextLine());
        System.out.println("Mời nhập khách hàng cần thêm(mã hoặc tên): ");
        for(int i=1;i<=m;i++)
        {
            System.out.println("Khách hàng "+i);
            KHACH_HANG kh=new KHACH_HANG();
            kh.Nhap_KH();
            dskh = Arrays.copyOf(dskh, dskh.length +1); 
            dskh[n]=kh;
            n++;
        }
        System.out.println("+---------------------------------------Danh sách khách hàng sau khi thêm----------------------------------------------------+");
        System.out.printf("%-25s%-30s%-30s%-30s%-10s%-25s%-50s\n","Mã KH","Họ tên KH","Ngày sinh","Giới tính","Địa chỉ", "Số điện thoại", "Địa chỉ email");
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
        for(int i=0; i<n; i++)
        dskh[i].Xuat_KH();
    }
    public void Sua_kh(){
        int t=0;
        System.out.println("Mời nhập khách hàng cần sửa(mã hoặc tên)");
        String mkh=sc.nextLine();
        
        for(int i=0; i<n; i++)
            if(dskh[i].getMa_KH().equalsIgnoreCase(mkh)||dskh[i].getHo_ten().equalsIgnoreCase(mkh) )
            {
                dskh[i].Xuat_KH();
                t=i;
            }
            else{
                System.out.println("Không có KH đó!");
                System.exit(0);
            }
        System.out.println("Bạn muốn sửa gì? ");
        System.out.println("1.Mã khách hàng");
        System.out.println("2.Tên khách hàng");
        System.out.println("3.Địa chỉ khách hàng");
        System.out.println("4.Số điện thoại khách hàng");
        System.out.println("5.Địa chỉ email khách hàng");
        System.out.print("Mời bạn nhập:");
        int chon=sc.nextInt();
        while(chon>5 || chon<1) {
            System.out.println("Mời bạn nhập lại: ");
            chon=sc.nextInt();
        }
        switch(chon){
            case 1: {
                System.out.println("Nhập mã khách hàng mới: ");
                String makhmoi=sc.next();
                dskh[t].setMa_KH(makhmoi);
                System.out.println("+---------------------------------------Danh sách sách sau khi sửa----------------------------------------------------+");
                System.out.printf("%-25s%-30s%-30s%-30s%-10s%-25s%-50s\n","Mã KH","Họ tên KH","Ngày sinh","Giới tính","Địa chỉ", "Số điện thoại", "Địa chỉ email");
                System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
                for(int i=0; i<n; i++)
                dskh[i].Xuat_KH();
                break;
                
            }
            case 2: {
                System.out.println("Nhập tên khách hàng mới: ");
                String tenkhmoi=sc.next();
                dskh[t].setHo_ten(tenkhmoi);
                System.out.println("+---------------------------------------Danh sách sách sau khi sửa----------------------------------------------------+");
                System.out.printf("%-25s%-30s%-30s%-30s%-10s%-25s%-50s\n","Mã KH","Họ tên KH","Ngày sinh","Giới tính","Địa chỉ", "Số điện thoại", "Địa chỉ email");
                System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
                for(int i=0; i<n; i++)
                dskh[i].Xuat_KH();
                break;
               
            }
            case 3: {
                System.out.println("Nhập địa chỉ mới của khách hàng: ");
                String dcmoi=sc.nextLine();
                dskh[t].setDia_chi(dcmoi);
                System.out.println("+---------------------------------------Danh sách sách sau khi sửa----------------------------------------------------+");
                System.out.printf("%-25s%-30s%-30s%-30s%-10s%-25s%-50s\n","Mã KH","Họ tên KH","Ngày sinh","Giới tính","Địa chỉ", "Số điện thoại", "Địa chỉ email");
                System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
                for(int i=0; i<n; i++)
                dskh[i].Xuat_KH();
                break;
               
            }
            
            case 4: {
                System.out.println("Nhập số điện thoại mới của khách hàng: ");
                String sdtmoi=sc.next();
                dskh[t].setSdt(sdtmoi);
                System.out.println("+---------------------------------------Danh sách sách sau khi sửa----------------------------------------------------+");
                System.out.printf("%-25s%-30s%-30s%-30s%-10s%-25s%-50s\n","Mã KH","Họ tên KH","Ngày sinh","Giới tính","Địa chỉ", "Số điện thoại", "Địa chỉ email");
                System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
                for(int i=0; i<n; i++)
                dskh[i].Xuat_KH();
                break;
               
            }
            
            case 5: {
                System.out.println("Nhập địa chỉ email mới của khách hàng: ");
                String emailmoi=sc.next();
                dskh[t].setEmail(emailmoi);
                System.out.println("+---------------------------------------Danh sách sách sau khi sửa----------------------------------------------------+");
                System.out.printf("%-25s%-30s%-30s%-30s%-10s%-25s%-50s\n","Mã KH","Họ tên KH","Ngày sinh","Giới tính","Địa chỉ", "Số điện thoại", "Địa chỉ email");
                System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
                for(int i=0; i<n; i++)
                dskh[i].Xuat_KH();
                break;
                
            }
            
        }
    }
    public void Xoa_kh(){
        if(n<1) System.out.println("Danh sách khách hàng rỗng.");
        else{
            System.out.println("Mời nhập khách hàng cần xoá (mã hoặc tên): ");
            String xoakh=sc.nextLine();
            xoakh=sc.nextLine();
            for(int i=0; i<n; i++)
                if(dskh[i].getMa_KH().equalsIgnoreCase(xoakh)||dskh[i].getHo_ten().equalsIgnoreCase(xoakh))
                {
                    for(int j=i;j<n-1;j++)
                        dskh[j]=dskh[j+1];
                    n--;
                }
            
            if(n<=0) System.out.println("Danh sách rỗng");
            else{
            System.out.println("+---------------------------------------Danh sách sách sau khi xoá----------------------------------------------------+");
            System.out.printf("%-25s%-30s%-30s%-30s%-10s%-25s%-50s\n","Mã KH","Họ tên KH","Ngày sinh","Giới tính","Địa chỉ", "Số điện thoại", "Địa chỉ email");
            System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
            for(int i=0; i<n; i++)
            dskh[i].Xuat_KH();
            }
        }
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        DS_KHACH_HANG danhsach=new DS_KHACH_HANG();
        danhsach.Nhap_DS_KH();
        danhsach.Xuat_DS_KH();
        System.out.println("Bạn muốn thực hiện thao tác gì với danh sách khách hàng:");
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
}

