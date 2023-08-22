package baitapbuoi5;
import java.util.Scanner;
public class bai3 {
	 private String hoTen;
	    private int maSV;
	    private float diemToan;
	    private float diemLy;
	    private float diemHoa;

	    public bai3() {
	    }

	    public bai3(String hoTen, int maSV, float diemToan, float diemLy, float diemHoa) {
	        this.hoTen = hoTen;
	        this.maSV = maSV;
	        this.diemToan = diemToan;
	        this.diemLy = diemLy;
	        this.diemHoa = diemHoa;
	    }

	    public void nhapThongTin(Scanner sc) { 
	        System.out.print("Nhap ho va ten: ");
	        hoTen = sc.nextLine();
	        
	        System.out.print("Nhap ma sinh vien: ");
	        maSV = sc.nextInt();
	        sc.nextLine();
	        System.out.print("Nhap diem Toan: ");
	        diemToan = sc.nextFloat();
	        sc.nextLine();
	        System.out.print("Nhap diem Ly: ");
	        diemLy = sc.nextFloat();
	        sc.nextLine();
	        System.out.print("Nhap diem Hoa: ");
	        diemHoa = sc.nextFloat();
	        sc.nextLine();
	    }

	    public float tinhDiemTrungBinh() {
	        return (diemToan + diemLy + diemHoa) / 3;
	    }

	    public void inThongTin() {
	        System.out.println("Ho va ten: " + hoTen);
	        System.out.println("Ma sinh vien: " + maSV);
	        System.out.println("diem Trung binh: " + tinhDiemTrungBinh());
	    }

	    public static void main(String[] args) {
	      
	       Scanner sc = new Scanner(System.in);
	       System.out.print("nhap so luong sinh vien: ");
	        int n = sc.nextInt();
	        sc.nextLine();
	        bai3[] sl = new bai3[n];
	        for (int i = 0; i < n; i++) {
	             bai3 dssv = new bai3();
	             System.out.println("nhap thong tin sv thu" + (i + 1) + ": ");
	             dssv.nhapThongTin(sc);
	             sl[i] = dssv;
	         }
		for (int i = 0; i < n; i++) {
	             sl[i].inThongTin();
	         }
	    }
}
