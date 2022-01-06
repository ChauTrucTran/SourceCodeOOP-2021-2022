
package PROJECT;
import java.util.Scanner;
import java.util.Arrays;
public class DS_PHIEU_BAN {
    Scanner sc=new Scanner(System.in);
    protected int n;
    PHIEU_BAN[] DSPB;
    public DS_PHIEU_BAN(){
        DSPB=null;
        n=0;
    }
    public void Nhap_DSPB(){
        System.out.println("Mời bạn nhập số lượng phiếu bán : ");
        n=Integer.parseInt(sc.nextLine());
        DSPB=new CT_PHIEU_BAN[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhập phiếu bán thứ "+(i+1));
            DSPB[i]=new CT_PHIEU_BAN();
            DSPB[i].Nhap();
        }
    }
    public void Xuat_DSPB()
    {
        System.out.println("Danh sách phiếu bán vừa nhập");
        System.out.printf("%-25s%-25s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-25s\n","Ma_PB","Ma_TL","Ma_sach","Ma_NV","Ngay_ban","Thang_ban","Nam_ban","So_luong_ban","Don_gia_ban","Thanh_tien");
        System.out.println("......");
        for(int i=0;i<n;i++)
            DSPB[i].Xuat();
    }
    public void Tim_Ma_PB()
    {
        System.out.println("Nhập vào mã phiếu bán cần tìm:");
        String Ma_Pb = sc.nextLine();
        int k=0;
        for(int i=0; i<n; i++)
            if(DSPB[i].getMa_PB().equalsIgnoreCase(Ma_Pb))
            {
                DSPB[i].Xuat_ds_PB();
                k=1;
            }        
        if (k==0) System.out.println("Không có phiếu bán này.");
    }
    public void Tim_Ngay_ban()
    {
        System.out.println("Nhập vào ngày bán cần tìm:");
        DATE ngaytra =new DATE();
        ngaytra.Nhap(); 
        int k=0;
        for(int i=0; i<n; i++)
            if(DSPB[i].getNgay_ban().getNgay()== ngaytra.ngay && DSPB[i].getNgay_ban().getThang()== ngaytra.thang &&DSPB[i].getNgay_ban().getNam()== ngaytra.nam)
            {
                DSPB[i].Xuat_ds_PB();
                k=1;
            } 
        if (k==0) System.out.println("Không có ngày bán này.");
    }
    public void Them_Ma_PB(){
        System.out.println("Mời nhập số lượng phiếu bán cần thêm: ");
        int m=Integer.parseInt(sc.nextLine());
        System.out.println("Mời nhập tên phiếu bán cần thêm: ");
        for(int i=1;i<=m;i++)
        {
            System.out.println("MÃ PHIẾU BÁN "+i);
            PHIEU_BAN PB=new PHIEU_BAN();
            PB.Nhap();
            DSPB = Arrays.copyOf(DSPB, DSPB.length +1); 
            DSPB[n]=PB;
            n++;
        }
        System.out.println("Phiếu bán sau khi thêm");
        System.out.printf("%-25s%-25s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-25s\n","Ma_PB","Ma_TL","Ma_sach","Ma_NV","Ngay_ban","Thang_ban","Nam_ban","So_luong_ban","Don_gia_ban","Thanh_tien");
        System.out.println(".....");
        for(int i=0; i<n; i++)
        DSPB[i].Xuat();
    }
        public void Sua_PB(){
        int t=0;
        System.out.println("Mời nhập phiếu bán cần sửa");
        String PB=sc.nextLine();
        System.out.println("Bạn muốn sửa gì? ");
        System.out.println("1. Mã phiếu bán");
        System.out.println("2. Ngày Bán");
        System.out.println("3. Tháng Bán");
        System.out.println("4. Năm bán");
        System.out.print("Mời bạn nhập:");
        int chon=sc.nextInt();
        switch(chon){
            case 1:{
                System.out.println("Nhập mã phiếu bán mới: ");
                String Ma_PB_moi=sc.next();
                DSPB[t].setMa_PB(Ma_PB_moi);
                System.out.println("Danh sách phiếu bán sau khi sửa");
                System.out.printf("%-25s%-25s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-25s\n","Ma_PB","Ma_TL","Ma_sach","Ma_NV","Ngay_ban","Thang_ban","Nam_ban","So_luong_ban","Don_gia_ban","Thanh_tien");
                System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
                for(int i=0; i<n; i++)
                DSPB[i].Xuat();
                break;
            }
            case 2:{
                System.out.println("Nhập Ngày bán mới : ");
                String Ngay_ban_moi=sc.next();
                DSPB[t].setNgay_ban(Ngay_ban_moi);
                System.out.println(" Phiếu bán sau khi sửa");
                System.out.printf("%-25s%-25s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-25s\n","Ma_PB","Ma_TL","Ma_sach","Ma_NV","Ngay_ban","Thang_ban","Nam_ban","So_luong_ban","Don_gia_ban","Thanh_tien");
                System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
                for(int i=0; i<n; i++)
                DSPB[i].Xuat();
                break;
            }
            case 3:{
                System.out.println("Nhập Tháng bán mới : ");
                String Thang_ban_moi=sc.next();
                DSPB[t].setThang_ban(Thang_ban_moi);
                System.out.println(" Phiếu bán sau khi sửa");
                System.out.printf("%-25s%-25s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-25s\n","Ma_PB","Ma_TL","Ma_sach","Ma_NV","Ngay_ban","Thang_ban","Nam_ban","So_luong_ban","Don_gia_ban","Thanh_tien");
                System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
                for(int i=0; i<n; i++)
                DSPB[i].Xuat();
                break;
            }
            case 4:{
                 System.out.println("Nhập Năm bán mới : ");
                String Nam_ban_moi=sc.next();
                DSPB[t].setNam_ban(Nam_ban_moi);
                System.out.println(" Phiếu bán sau khi sửa");
                System.out.printf("%-25s%-25s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-25s\n","Ma_PB","Ma_TL","Ma_sach","Ma_NV","Ngay_ban","Thang_ban","Nam_ban","So_luong_ban","Don_gia_ban","Thanh_tien");
                System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
                for(int i=0; i<n; i++)
                DSPB[i].Xuat();
                break;
            }
        }
    }
    public void Xoa_PB(){
        if(n<1) System.out.println("Danh sách phiếu bán rỗng.");
        else{
            System.out.println("Mời nhập Mã Phiếu Bán cần xoá: ");
            String PN=sc.nextLine();
            for(int i=0; i<n; i++)
                if(DSPB[i].getMa_PB().equalsIgnoreCase(PN))
                {
                    for(int j=i;j<n-1;j++)
                        DSPB[j]=DSPB[j+1];
                    n--;
                }
            if(n<=0) System.out.println("Danh sách phiếu bán rỗng");
            else{
            System.out.println(" Sau khi xoá");
            System.out.printf("%-25s%-25s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-25s\n","Ma_PB","Ma_TL","Ma_sach","Ma_NV","Ngay_ban","Thang_ban","Nam_ban","So_luong_ban","Don_gia_ban","Thanh_tien");
            System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
            for(int i=0; i<n; i++)
            DSPB[i].Xuat();
            }
        }
    }
    public static void main(String[] args){
        DS_PHIEU_BAN danhsach=new DS_PHIEU_BAN();
        danhsach.Nhap_DSPB();
        danhsach.Xuat_DSPB();
        danhsach.Tim_Ma_PB();
        
    }
}
