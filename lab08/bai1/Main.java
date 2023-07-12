package lab08.bai1;

import lab04_1.MainClass;

import java.util.Scanner;

public class Main {
    public void tinhDT(Shape hinh){
        hinh.inputData();
        hinh.calArea();
    }
    public static void main(String[] args) {
        Main main=new Main();
        do {
            int chon;
            Scanner input=new Scanner(System.in);
            System.out.println("---------menu-----------\n1. Tinh DT hinh tron\n2. Tinh DT hinh tu giac:\n3. Tinh Dt hinh tam giac\n4.Exit\nChon tu 1->4");
            chon=Integer.parseInt(input.nextLine());
            switch (chon){
                case 1:
                    main.tinhDT(new Cricle());
                    System.out.println("");
                    break;
                case 2:
                    main.tinhDT(new Rectangle());
                    System.out.println("");
                    break;
                case 3:
                    main.tinhDT(new Tritangle());
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Chuong trinh ket thuc.");
                    return;
            }

        }while (true);
    }
}
