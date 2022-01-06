
package PROJECT;
import java.util.Scanner;
import java.util.Arrays;
public class DS_PHIEU_NHAP {
    Scanner sc=new Scanner(System.in);
    protected int n;
    PHIEU_NHAP[] DSPN;
    public DS_PHIEU_NHAP(){
        DSPN=null;
        n=0;
    }
    public void Nhap_DSPN(){
        System.out.println("Mời bạn nhập số lượng phiếu nhập : ");
        n=Integer.parseInt(sc.nextLine());
        DSPN = new CT_PHIEU_NHAP[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhập phiếu nhập thứ "+(i+1));
            DSPN[i]=new CT_PHIEU_NHAP();
            DSPN[i].Nhap();
        }
    }
    public void Xuat_DSPN(){
        System.out.println("Danh sách phiếu nhập vừa nhập");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n","Ma_PN","Mã TL","Mã sách","Ngay_nhap","Thang_nhap","Nam_nhap","Nhà xuất bản","Số lượng nhập","Đơn giá nhập","Thành tiền");
        System.out.println("....................................................");
        for(int i=0;i<n;i++)
            DSPN[i].Xuat();
    }
    public void Tim_Ma_PN()
    {
        System.out.println("Nhập vào mã phiếu nhập cần tim:");
        int Ma_PN = sc.nextInt();  
    }
    public void Tim_Ngay_nhap()
    {
        System.out.println("Nhập vào ngày nhập cần tìm:");
        DATE ngaytra =new DATE();
        ngaytra.Nhap(); 
        int k=0;
        System.out.println("Danh sách phiếu nhập tìm được");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n","Ma_PN","Mã TL","Mã sách","Ngay_nhap","Thang_nhap","Nam_nhap","Nhà xuất bản","Số lượng nhập","Đơn giá nhập","Thành tiền");
        for(int i=0; i<n; i++)
            if(DSPN[i].getNgay_nhap().getNgay()== ngaytra.ngay && DSPN[i].getNgay_nhap().getThang()== ngaytra.thang &&DSPN[i].getNgay_nhap().getNam()== ngaytra.nam)
            {
                DSPN[i].Xuat();
                k=1;
            } 
        if (k==0) System.out.println("Không có ngày nhập này.");
    }
    public void Them_Ma_PN(){
        System.out.println("Mời nhập số lượng phiếu nhập cần thêm: ");
        int m=Integer.parseInt(sc.nextLine());
        System.out.println("Mời nhập tên phiếu nhập cần thêm: ");
        for(int i=1;i<=m;i++)
        {
            System.out.println("MÃ PHIẾU nhập "+i);
            PHIEU_NHAP PNH=new PHIEU_NHAP();
            PNH.Nhap();
            DSPN = Arrays.copyOf(DSPN, DSPN.length +1); 
            DSPN[n]=PNH;
            n++;
        }
        System.out.println("Phiếu nhập sau khi thêm");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n","Ma_PN","Mã TL","Mã sách","Ngay_nhap","Thang_nhap","Nam_nhap","Nhà xuất bản","Số lượng nhập","Đơn giá nhập","Thành tiền");
        System.out.println(".....");
        for(int i=0; i<n; i++)
        DSPN[i].Xuat();
    }
    public void Sua_PN(){
    int t=0;
    System.out.println("Mời nhập phiếu nhập cần sửa (mã):");
    String PN=sc.nextLine();
    PN=sc.nextLine();
        for(int i=0; i<n; i++)
            if(DSPN[i].getMa_PN().equalsIgnoreCase(PN) )
            {
                DSPN[i].Xuat();
                t=i;
            }
            else{
                System.out.println("Không có phiếu nhập đó.");
                return;
            }
    System.out.println("Bạn muốn sửa gì? ");
    System.out.println("1. Mã phiếu nhập");
    System.out.println("2. Ngày nhập");
    System.out.print("Mời bạn nhập:");
    int chon=sc.nextInt();
    switch(chon){
            case 1:{
                System.out.println("Nhập mã phiếu nhập mới: ");
                String Ma_PN_moi=sc.nextLine();
                DSPN[t].setMa_PN(Ma_PN_moi);
                System.out.println("Danh sách phiếu nhập sau khi sửa");
                System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n","Ma_PN","Mã TL","Mã sách","Ngay_nhap","Thang_nhap","Nam_nhap","Nhà xuất bản","Số lượng nhập","Đơn giá nhập","Thành tiền");
                System.out.println("+....+");
                for(int i=0; i<n; i++)
                DSPN[i].Xuat();
                break;
            }
            case 2:{
                System.out.println("Nhập Ngày nhập mới : ");
                DATE Ngay = new DATE();
                Ngay.Nhap();
                DSPN[t].setNgay_nhap(Ngay);
                System.out.println(" Phiếu nhập sau khi sửa");
                System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n","Ma_PN","Mã TL","Mã sách","Ngay_nhap","Thang_nhap","Nam_nhap","Nhà xuất bản","Số lượng nhập","Đơn giá nhập","Thành tiền");
                System.out.println("....");
                for(int i=0; i<n; i++)
                DSPN[i].Xuat();
                break;
            }
            
        }
    }
    public void Xoa_PN(){
        if(n<=1) System.out.println("Danh sách sách rỗng.");
        else{
            System.out.println("Mời nhập Mã PHIẾU nhập cần xoá: ");
            String PN=sc.nextLine();
            System.out.println(" sau khi xoá");
            System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n","Ma_PN","Mã TL","Mã sách","Ngay_nhap","Thang_nhap","Nam_nhap","Nhà xuất bản","Số lượng nhập","Đơn giá nhập","Thành tiền");
            System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------------+");
            for(int i=0; i<n; i++)
            DSPN[i].Xuat();
        }
    }
    public static void main(String[] args){
        DS_PHIEU_NHAP danhsach=new DS_PHIEU_NHAP();
        danhsach.Nhap_DSPN();
        danhsach.Xuat_DSPN();
        
        danhsach.Sua_PN();
    }
}
