package week2;

import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mang = new int[5];
        System.out.println("Nhập vào 5 giá trị của mảng");
        for(int i = 0; i < 5; i++) {
            System.out.print("Giá trị thứ " + (i + 1) + ": ");
            mang[i] = sc.nextInt();
        }
        System.out.print("Mảng vừa nhập là: ");
        for(int i = 0; i < 5; i++)
            System.out.print(mang[i] + " ");
        System.out.println();
        int tong = 0;
        for(int i = 0; i < 5; i++)
            tong += mang[i];
        System.out.println("Tổng các giá trị trong mảng: " + tong);
        int max = mang[0];
        for(int i = 1; i < 5; i++) {
            if(mang[i] > max)
                max = mang[i];
        }
        System.out.print("Giá trị lớn nhất của mảng là: " + max);
        sc.close();
    }
}
