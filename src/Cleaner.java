public class Cleaner implements IPayment{

    private int DailyPay;
    private int Rate;
    private String name;

    public int getDailyPay() {
        return DailyPay;
    }

    public void setDailyPay(int dailyPay) {
        DailyPay = dailyPay;
    }

    public int getRate() {
        return Rate;
    }

    public void setRate(int rate) {
        Rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cleaner(String name, int DailyPay, int Rate) {
        this.DailyPay = DailyPay;
        this.Rate = Rate;
        this.name = name;
    }

    @Override
    public int getPayment() {
        return this.DailyPay * this.Rate;
    }
}
