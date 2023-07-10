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
    public double withDraw(double money) {
        return super.withDraw(money);
    }

    @Override
    public double getBalance(double money) {
        return super.getBalance(money);
    }

    @Override
    public double getBalance1(double money) {
        return super.getBalance1(money);
    }

    public void getInterest(double money){
        SavingAccount savingAccount = new SavingAccount();
        double lai = 0;
        lai = rate*getBalance(money);
        System.out.println("so tien lai sau 1 nam khi gui la: "+lai);

        double lai1 = 0;
        lai1 = rate*getBalance1(money);
        System.out.println("so tien lai sau 1 nam khi rut la: "+lai1);

    }
}
