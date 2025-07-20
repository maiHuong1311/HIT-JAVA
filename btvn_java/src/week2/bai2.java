package week2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào tên của học sinh: ");
        String name = sc.nextLine();
        System.out.print("Nhập vào tuổi của học sinh: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập vào lớp của học sinh: ");
        String Class = sc.nextLine();
        System.out.print("Nhập vào GPA của học sinh: ");
        float GPA = sc.nextFloat();
        System.out.print("Tên: " + name + " - tuổi: " + age + " - lớp: " + Class + " - GPA: " + GPA);
        sc.close();

    }
}
