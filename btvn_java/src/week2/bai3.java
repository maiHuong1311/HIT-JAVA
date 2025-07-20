package week2;

import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên a: ");
        int a = sc.nextInt();
        System.out.print("Nhập vào số nguyên b: ");
        int b = sc.nextInt();
        System.out.println("Tổng của hai số là: " + (a + b));
        System.out.println("Hiệu của hai số là: " + (a - b));
        System.out.println("Tích của hai số là: " + (a * b));
        System.out.println("Thương của hai số là: " + ((float) a / b));
        System.out.println("Chia lấy dư của hai số là: " + (a % b));
        if(a == b)
            System.out.println("Hai số bằng nhau");
        else
            System.out.println("Hai số không bằng nhau");
        sc.close();
    }
}
