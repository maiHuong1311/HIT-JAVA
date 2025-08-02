package week4;
import java.util.Scanner;
import java.util.ArrayList;
public class studentManagement {
    public static void themSV(ArrayList<student> danhSach) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Số lượng sinh viên muốn thêm vào: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++) {
            student sv = new student();
            System.out.println("Nhập thông tin của sinh viên thứ " + (i + 1));
            sv.nhap();
            danhSach.add(sv);
        }
        System.out.println("Danh sách sau khi thêm sinh viên");
        System.out.printf("%-10s%-10s%-15s%-12s%-12s%-15s%-10s%-12s\n", "Tên", "Tuổi", "Địa chỉ", "Điểm TX1", "Điểm TX2", "Điểm KTHP", "Điểm GPA", "Số tiết nghỉ");
        for(student sv : danhSach) {
            sv.in();
        }
    }
    public static void suaThongTin(ArrayList<student> danhSach) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Số lượng sinh viên muốn sửa thông tin: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++) {
            boolean check = false;
            System.out.print("Nhập tên sinh viên muốn sửa thông tin: ");
            String name = sc.nextLine();
            for(int j = 0; j < danhSach.size(); j++) {
                if(name.equalsIgnoreCase(danhSach.get(j).getName())) {
                    System.out.println("Nhập lại thông tin của sinh viên thứ " + (i + 1));
                    danhSach.get(j).nhap();
                    check = true;
                }
            }
            if(!check)
                System.out.println("Không có tên sinh viên trong danh sách");

            else {
                System.out.println("Danh sách sinh viên sau khi sửa lại");
                System.out.printf("%-10s%-10s%-15s%-12s%-12s%-15s%-10s%-12s\n", "Tên", "Tuổi", "Địa chỉ", "Điểm TX1", "Điểm TX2", "Điểm KTHP", "Điểm GPA", "Số tiết nghỉ");
                for(student sv : danhSach)
                    sv.in();
            }
        }
    }
    public static void sxTheoTuoi(ArrayList<student> danhSach) {
        for(int i = 0; i < danhSach.size() - 1; i++) {
            for(int j = i + 1; j < danhSach.size(); j++) {
                if(danhSach.get(j).getTuoi() > danhSach.get(i).getTuoi()) {
                    student temp = danhSach.get(i);
                    danhSach.set(i, danhSach.get(j));
                    danhSach.set(j, temp);
                }
            }
        }
        System.out.println("Danh sách sinh viên sau khi sắp xếp theo tuổi");
        System.out.printf("%-10s%-10s%-15s%-12s%-12s%-15s%-10s%-12s\n", "Tên", "Tuổi", "Địa chỉ", "Điểm TX1", "Điểm TX2", "Điểm KTHP", "Điểm GPA", "Số tiết nghỉ");
        for(student sv : danhSach) {
            sv.in();
        }
    }
    public static void sxTheoGPA(ArrayList<student> danhSach) {
        for(int i = 0; i < danhSach.size() - 1; i++) {
            for(int j = i + 1; j < danhSach.size(); j++) {
                if(danhSach.get(j).getGPA() > danhSach.get(i).getGPA()) {
                    student temp = danhSach.get(i);
                    danhSach.set(i, danhSach.get(j));
                    danhSach.set(j, temp);
                }
            }
        }
        System.out.println("Danh sách sinh viên sau khi sắp xếp theo GPA");
        System.out.printf("%-10s%-10s%-15s%-12s%-12s%-15s%-10s%-12s\n", "Tên", "Tuổi", "Địa chỉ", "Điểm TX1", "Điểm TX2", "Điểm KTHP", "Điểm GPA", "Số tiết nghỉ");
        for(student sv : danhSach) {
            sv.in();
        }
    }
    public static void sxTheoTietNghi(ArrayList<student> danhSach) {
        for(int i = 0; i < danhSach.size() - 1; i++) {
            for(int j = i + 1; j < danhSach.size(); j++) {
                if(danhSach.get(j).getTietNghi() > danhSach.get(i).getTietNghi()) {
                    student temp = danhSach.get(i);
                    danhSach.set(i, danhSach.get(j));
                    danhSach.set(j, temp);
                }
            }
        }
        System.out.println("Danh sách sinh viên sau khi sắp xếp theo tiết nghỉ");
        System.out.printf("%-10s%-10s%-15s%-12s%-12s%-15s%-10s%-12s\n", "Tên", "Tuổi", "Địa chỉ", "Điểm TX1", "Điểm TX2", "Điểm KTHP", "Điểm GPA", "Số tiết nghỉ");
        for(student sv : danhSach) {
            sv.in();
        }
    }
    public static void xoaSV(ArrayList<student> danhSach) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên muốn xóa: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++) {
            System.out.print("Nhập tên sinh viên muốn xóa: ");
            String name = sc.nextLine();
            boolean check = false;
            for(int j = 0; j < danhSach.size(); j++) {
                if(name.equalsIgnoreCase(danhSach.get(j).getName())) {
                    danhSach.remove(i);
                    check = true;
                }
            }
            if(!check)
                System.out.println("Không có tên sinh viên muốn xóa");
            else {
                System.out.println("Danh sách sinh viên sau khi xóa");
                System.out.printf("%-10s%-10s%-15s%-12s%-12s%-15s%-10s%-12s\n", "Tên", "Tuổi", "Địa chỉ", "Điểm TX1", "Điểm TX2", "Điểm KTHP", "Điểm GPA", "Số tiết nghỉ");
                for(student sv : danhSach) {
                    sv.in();
                }
            }
        }
    }
}
