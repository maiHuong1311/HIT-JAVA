package week2;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào tên của bạn: ");
        String name = sc.nextLine();
        System.out.print("Nhập vào tuổi của bạn: ");
        int age = sc.nextInt();
        System.out.print("Nhập vào chiều cao của bạn: ");
        float height = sc.nextFloat();
        System.out.print("Xin chào " + name + ", bạn " + age + " tuổi và cao " + height + " mét");
        sc.close();
    }
}
