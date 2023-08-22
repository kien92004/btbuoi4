package baitapbuoi5;
import java.util.Scanner;
public class bai1 {
	private String maSach;
    private String tenSach;
    private String tenTacGia;
    private String nhaXuatBan;
    private int namXuatBan;

    public bai1(String maSach, String tenSach, String tenTacGia, String nhaXuatBan, int namXuatBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tenTacGia = tenTacGia;
        this.nhaXuatBan = nhaXuatBan;
        this.namXuatBan = namXuatBan;
    }
    public bai1() {
    }

     public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    
    public void nhapThongTinSach(Scanner sc) {
        System.out.print("Nhap ma sach: ");
        maSach = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        tenSach = sc.nextLine();
        System.out.print("Nhap tac gia: ");
        tenTacGia = sc.nextLine();
        System.out.print("Nhap nha xuat ban: ");
        nhaXuatBan = sc.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        namXuatBan = sc.nextInt();
        sc.nextLine();
    }

    public void xuatThongTinSach() {
         
    	System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Ten tac gia: " + tenTacGia);
        System.out.println("Nha xuat ban: " + nhaXuatBan);
        System.out.println("Nam xuat ban: " + namXuatBan);
    }

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    	 System.out.print("Nhap so luong sach: ");
         int n = sc.nextInt();
         sc.nextLine();

         bai1[] sl = new bai1[n];
         for (int i = 0; i < n; i++) {
             bai1 sach = new bai1();
             System.out.println("" + (i + 1) + ": ");
             sach.nhapThongTinSach(sc);
             sl[i] = sach;
         }
	for (int i = 0; i < n; i++) {
             sl[i].xuatThongTinSach();
         }

}
}