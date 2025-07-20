package week2;

import java.util.Scanner;
public class bai5 {
    public static void main(String[] args) {
        System.out.println("Bảng cửu chương của 5:");
        for(int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }
        int tong = 0;
        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 0)
                tong += i;
        }
        System.out.print("Tổng các số chẵn từ 1 đến 100 là: " + tong);
    }
}
