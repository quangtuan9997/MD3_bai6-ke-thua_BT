package bai4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập vào lần lượt 3 cạnh cua tam giác:");
        double side1=scanner.nextDouble();
        double side2=scanner.nextDouble();
        double side3=scanner.nextDouble();
        System.out.println("nhập vào màu của tam giác:");
        String color=scanner.next();
        Triangle triangle=new Triangle(color,side1,side2,side3);
        System.out.println(triangle.toString());
    }
}
