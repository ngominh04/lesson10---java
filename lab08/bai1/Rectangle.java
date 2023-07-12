package lab08.bai1;

import java.util.Scanner;

public class Rectangle extends Shape{
    float width;
    float heght;
    Scanner input=new Scanner(System.in);
    @Override
    public void inputData() {
        System.out.println("Nhap width: ");
        width=Float.parseFloat(input.nextLine());
        System.out.println("Nhap heght: ");
        heght=Float.parseFloat(input.nextLine());
    }

    @Override
    public void calArea() {
        float area= width*heght;
        System.out.printf("Dien tich tu giac là: %.2f",area);
    }
}
