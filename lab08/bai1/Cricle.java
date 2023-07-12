package lab08.bai1;

import java.util.Scanner;

public class Cricle extends Shape{
    float radius;
    Scanner input=new Scanner(System.in);
    @Override
    public void inputData() {
        System.out.println("Nhap ban kinh hinh tron: ");
        radius=Float.parseFloat(input.nextLine());
    }

    @Override
    public void calArea() {
        float area=(float) (radius*radius*Math.PI);
        System.out.printf("Dien tich hinh tron la: %.2f",area);
    }
}
