package ex04_1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Account {
     static double initialize=100;
    static double balance;


    public double deposit(double money){
        return initialize+money;
    }
    public double withDraw(double money,double money1){
        Account account= new Account() {
            @Override
            public double withDraw(double money) {
                return 0;
            }
        };
        if(money1>account.deposit(money)){
//            System.out.println("Tien rut vuot qua tien trong tai khoan");
            return 0;
        }else{
//            System.out.println("Rut thanh cong");
            return account.deposit(money)-money1;
        }
    }

    public abstract double withDraw(double money);

    public double getBalance(double money){
        Account account= new Account() {
            @Override
            public double withDraw(double money) {
                return 0;
            }
        };
//        System.out.println("so tien con trong tai khoan sau khi gui: ");
        return account.deposit(money);

    }

    public double getBalance1(double money,double money1) {
        Account account= new Account() {
            @Override
            public double withDraw(double money) {
                return 0;
            }
        };
        //System.out.println("so tien con trong tai khoan sau khi rut: ");
        return account.withDraw(money,money1);
    }
}
