package baitapbuoi5;
import java.util.Scanner;
public class bai2 {
	private int chieuDai;
    private int chieuRong;

    public bai2() {
    }

    public bai2(int chieuDai, int chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public void nhap() {
    	 Scanner sc =new Scanner(System.in);
         System.out.print("nhap chieu dai: ");
         chieuDai=sc.nextInt();
          System.out.print("nhap chieu rong: ");
         chieuRong=sc.nextInt();
    }

    public void veHCN() {
    	 for (int i = 0; i < chieuRong; i++) {
             for (int j = 0; j < chieuDai; j++) {
                 System.out.print("*");
             }
             System.out.println();
         }
    }

    public int dienTich() {
        return chieuDai * chieuRong;
    }

    public int chuVi() {
        return 2 * (chieuDai + chieuRong);
    }

    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }
    
    public static void main(String[] args) {
      bai2 hcn = new bai2();
      hcn.nhap();
      System.out.println("chieu dai cua hinh chu nhat la: " + hcn.chieuDai);
      System.out.println("chieu rong cua hinh chu nhat la: " + hcn.chieuRong);
      System.out.println("Dien tich: " + hcn.dienTich());
      System.out.println("Chu vi: " + hcn.chuVi());
      hcn.veHCN();
    }
    
}
