package lab04_2;

import java.util.Scanner;

public class StudentUniversity extends StudentCollege{
    float score4;
    Scanner input=new Scanner(System.in);
    @Override
    public float average(float score1, float score2, float score3, float score4) {
        return (score1+score2+score3+score4)/4;
    }
    @Override
    public float average() {
        return 0;
    }

    @Override
    public void hienThi() {
        StudentUniversity studentUniversity=new StudentUniversity();
        System.out.println("Nhap ten: ");
        name=input.nextLine();
        System.out.println("Nhap year: ");
        year=Integer.parseInt(input.nextLine());
        System.out.println("Nhap score1: ");
        score1=Float.parseFloat(input.nextLine());
        System.out.println("Nhap score2: ");
        score2=Float.parseFloat(input.nextLine());
        System.out.println("Nhap score3: ");
        score3=Float.parseFloat(input.nextLine());
        System.out.println("Nhap score4: ");
        score4=Float.parseFloat(input.nextLine());
        System.out.println("Diem trung binh: "+studentUniversity.average(score1,score2,score3,score4));
    }
}
