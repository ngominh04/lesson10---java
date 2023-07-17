package ex04_1;

public class CheckAccount extends Account{
    double feeTransfer=2;//phí giao dịch

    @Override
    public double deposit(double money) {
        return (initialize+money-feeTransfer);
    }

    @Override
    public double withDraw(double money,double money1) {
        CheckAccount checkAccount=new CheckAccount();
        if(money1>checkAccount.deposit(money)){
            return 0;
        }else {
            return checkAccount.deposit(money)-money1-feeTransfer;
        }
    }

    @Override
    public double withDraw(double money) {
        return 0;
    }

    @Override
    public double getBalance(double money) {
        CheckAccount checkAccount=new CheckAccount();
        return checkAccount.deposit(money);
    }

    @Override
    public double getBalance1(double money,double money1) {
        CheckAccount checkAccount=new CheckAccount();
        return checkAccount.withDraw(money,money1);
    }
}
