package lab04_2;

import java.util.Scanner;

public abstract class StudentCollege extends Student{
    float score1;
    float score2;
    float score3;
    Scanner input=new Scanner(System.in);

    public abstract float average();

    @Override
    public void hienThi() {
        StudentCollege studentCollege= new StudentCollege() {
            @Override
            public float average() {
                return 0;
            }
        };
        System.out.println("Nhap ten: ");
        name=input.nextLine();
        System.out.println("Nhap year: ");
        year=Integer.parseInt(input.nextLine());
        System.out.println("Nhap score1: ");
        score1=Integer.parseInt(input.nextLine());
        System.out.println("Nhap score2: ");
        score2=Integer.parseInt(input.nextLine());
        System.out.println("Nhap score3: ");
        score3=Integer.parseInt(input.nextLine());
        System.out.println("Diem trung binh: "+studentCollege.average(score1,score2,score3,0));
    }

    @Override
    public float average(float score1, float score2, float score3, float score4) {
        return (score1+score2+score3+score4)/3;
    }
}
