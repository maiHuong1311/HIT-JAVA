package week4;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<student> danhSach = new ArrayList<>();
        danhSach.add(new student("Hương", 2006, "Hà Nội", 8, 8, 8, 0));
        danhSach.add(new student("Vi", 2006, "Bắc Ninh", 9, 9, 8, 1));
        danhSach.add(new student("Huy", 2006, "Hà Nội", 9, 10, 7, 1));
        danhSach.add(new student("Phương", 2006, "Hà Nội", 9, 5, 10, 3));
        danhSach.add(new student("Vương", 2006, "Bắc Giang", 10, 7, 9, 2));
        System.out.printf("%-10s%-10s%-15s%-12s%-12s%-15s%-10s%-12s\n", "Tên", "Tuổi", "Địa chỉ", "Điểm TX1", "Điểm TX2", "Điểm KTHP", "Điểm GPA", "Số tiết nghỉ");
        for(student sv : danhSach) {
            sv.in();
        }
        System.out.println("--------- Quản lý sinh viên ---------");
        System.out.println("Hãy chọn chức năng");
        System.out.println("1. Thêm sinh viên mới");
        System.out.println("2. Sửa thông tin sinh viên");
        System.out.println("3. Sắp xếp sinh viên theo tuổi");
        System.out.println("4. Sắp xếp sinh viên theo GPA");
        System.out.println("5. Sắp xếp sinh viên theo số tiết nghỉ");
        System.out.println("6. Xóa sinh viên ra khỏi danh sách");
        System.out.println("7. Thoát");
        while(true) {
            int choose;
            do
            {
                System.out.print("Nhập vào lựa chọn của bạn: ");
                choose = sc.nextInt();
            }
            while(choose < 1 || choose > 7);
            switch(choose) {
                case 1: {
                    studentManagement.themSV(danhSach);
                    break;
                }
                case 2:{
                    studentManagement.suaThongTin(danhSach);
                    break;
                }
                case 3:{
                    studentManagement.sxTheoTuoi(danhSach);
                    break;
                }
                case 4:{
                    studentManagement.sxTheoGPA(danhSach);
                    break;
                }
                case 5:{
                    studentManagement.sxTheoTietNghi(danhSach);
                    break;
                }
                case 6:{
                    studentManagement.xoaSV(danhSach);
                    break;
                }
                case 7:{
                    return;
                }
            }
        }
    }
}