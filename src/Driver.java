public class Driver implements IPayment{

    private int OnetimePay;

    private String name;
    private int Rate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return Rate;
    }

    public void setRate(int rate) {
        Rate = rate;
    }


    public int getOnetimePay() {
        return OnetimePay;
    }
    public void setOnetimePay(int OnetimePay) {
        this.OnetimePay = OnetimePay;
    }

    public Driver(String name, int OnetimePay, int Rate) {
        this.OnetimePay = OnetimePay;
        this.Rate = Rate;
        this.name = name;
    }


    @Override
    public int getPayment() {
        return this.OnetimePay * this.Rate;
    }
}
