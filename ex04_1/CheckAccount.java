package ex04_1;

public class CheckAccount extends Account{
    float feeTransfer=10.f;//phí giao dịch

    @Override
    public double deposit(double money) {
        if(money>initialize){
            return 0;
        }else {
            return initialize-money-feeTransfer;
        }
    }

    @Override
    public double withDraw(double money) {
        if(money>initialize){
            return 0;
        }else {
            return initialize-money-feeTransfer;
        }
    }

    @Override
    public double getBalance(double money) {
        return super.getBalance(money);
    }

    @Override
    public double getBalance1(double money) {
        return super.getBalance1(money);
    }
}
