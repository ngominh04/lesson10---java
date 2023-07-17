package ex04_1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SavingAccount extends Account{
    float rate=0.008f;

    @Override
    public double deposit(double money) {
        return super.deposit(money);
    }

    @Override
    public double withDraw(double money,double money1) {
        return super.withDraw(money,money1);
    }

    @Override
    public double withDraw(double money) {
        return 0;
    }

    @Override
    public double getBalance(double money) {
        return super.getBalance(money);
    }

    @Override
    public double getBalance1(double money,double money1) {
        return super.getBalance1(money,money1);
    }

    public void getInterest(double money,double money1){
        SavingAccount savingAccount = new SavingAccount();
        double lai = 0;
        lai = rate*getBalance(money);
        System.out.println("so tien lai sau 1 nam khi gui la: "+lai);

        double lai1 = 0;
        lai1 = rate*getBalance1(money,money1);
        System.out.println("so tien lai sau 1 nam khi rut la: "+lai1);

    }
}
