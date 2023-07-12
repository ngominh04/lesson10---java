package lab08.bai1;

import java.util.Scanner;

public class Tritangle extends Shape{
    float heght;
    float bottom;
    Scanner input=new Scanner(System.in);
    @Override
    public void inputData() {
        System.out.println("Nhap heght: ");
        heght=Float.parseFloat(input.nextLine());
        System.out.println("Nhap bottom: ");
        bottom=Float.parseFloat(input.nextLine());
    }

    @Override
    public void calArea() {
        float area=(bottom*heght)/2;
        System.out.printf("Dien tich tam giac la: %.2f",area);
    }
}
