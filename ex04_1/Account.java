package ex04_1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
     static double initialize=10000000;
    static double balance;

    public double deposit(double money){
        if (money>initialize){
//            System.out.println("Tien gui vuot qua tien trong tai khoan");
            return 0;
        }else{
//            System.out.println("Gui thanh cong.");
            return initialize-money;
        }
    }

    public double withDraw(double money){
        if(money>initialize){
//            System.out.println("Tien rut vuot qua tien trong tai khoan");
            return 0;
        }else{
//            System.out.println("Rut thanh cong");
            return initialize-money;
        }
    }
    public double getBalance(double money){
        Account account=new Account();
//        System.out.println("so tien con trong tai khoan sau khi gui: ");
        return account.deposit(money);

    }

    public double getBalance1(double money) {
        Account account=new Account();
        //System.out.println("so tien con trong tai khoan sau khi rut: ");
        return account.withDraw(money);
    }
}
