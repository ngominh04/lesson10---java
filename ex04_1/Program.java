package ex04_1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double money;
        SavingAccount savingAccount =new SavingAccount();
        System.out.println("Thuc hien SavingAccount: ");
        System.out.println("Nhap so tien muon gui: ");
        money=Double.parseDouble(input.nextLine());
        savingAccount.deposit(money);
        System.out.println("So tien con trong tai khoan: "+savingAccount.getBalance(money)+" VNĐ");
        System.out.println("Nhap so tien muon rut: ");
        money=Double.parseDouble(input.nextLine());
        savingAccount.withDraw(money);
        System.out.println("So tien con trong tai khoan: "+savingAccount.getBalance1(money)+" VNĐ");

        CheckAccount checkAccount= new CheckAccount();
        System.out.println("Thuc hien CheckAccount: ");
        System.out.println("Nhap so tien muon gui (co tinh phi giao dich) : ");
        money=Double.parseDouble(input.nextLine());
        checkAccount.deposit(money);
        System.out.println("So tien con trong tai khoan: "+checkAccount.getBalance(money)+" VNĐ");
        System.out.println("Nhap so tien muon rut (co tinh phi giao dich): ");
        money=Double.parseDouble(input.nextLine());
        checkAccount.withDraw(money);
        System.out.println("So tien con trong tai khoan: "+checkAccount.getBalance1(money)+" VNĐ");

    }
}
