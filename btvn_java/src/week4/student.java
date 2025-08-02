package week4;
import java.util.Scanner;
public class student {
    private String name;
    private int namSinh;
    private String diaChi;
    private float TX1, TX2, KTHP;
    private int tietNghi;
    public student() {}
    public student(String name, int namSinh, String diaChi, float TX1, float TX2, float KTHP, int tietNghi) {
        this.name = name;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
        this.TX1 = TX1;
        this.TX2 = TX2;
        this.KTHP = KTHP;
        this.tietNghi = tietNghi;
    }
    public int age() {
        return 2025 - namSinh;
    }
    public double GPA() {
        return TX1 * 0.2 + TX2 * 0.3 + KTHP * 0.5;
    }
    public String getName() {
        return this.name;
    }
    public String getDiaChi() {
        return this.diaChi;
    }
    public int getNamSinh() {
        return this.namSinh;
    }
    public int getTietNghi() {
        return this.tietNghi;
    }
    public float getTX1() {
        return this.TX1;
    }
    public float getTX2() {
        return this.TX2;
    }
    public float getKTHP() {
        return this.KTHP;
    }
    public double getGPA() {
        return GPA();
    }
    public int getTuoi() {
        return age();
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào tên của sinh viên: ");
        this.name = sc.nextLine();
        System.out.print("Nhập vào năm sinh: ");
        this.namSinh = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập vào địa chỉ: ");
        this.diaChi = sc.nextLine();
        System.out.print("Nhập vào điểm TX1: ");
        this.TX1 = sc.nextFloat();
        System.out.print("Nhập vào điểm TX2: ");
        this.TX2 = sc.nextFloat();
        System.out.print("Nhập vào điểm KTHP: ");
        this.KTHP = sc.nextFloat();
        System.out.print("Nhập vào số tiết nghỉ: ");
        this.tietNghi = sc.nextInt();
        sc.nextLine();
    }
    public void in() {
        System.out.printf("%-10s%-10d%-15s%-12.2f%-12.2f%-15.2f%-10.2f%-12d\n",name, getTuoi(), diaChi, TX1, TX2, KTHP, getGPA(), tietNghi);
    }
}
