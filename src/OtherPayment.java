public class OtherPayment implements IPayment{
    private int MonthlyRentalRate;
    private int UnitOfUse;
    private int rate;
    private int MonthlySubscriptionRate;

    private int Rental;

    private int Electricity;

    private int InternetAccess;

    public OtherPayment(int MonthlyRentalRate, int UnitOfUse, int rate, int MonthlySubscriptionRate) {
        this.MonthlyRentalRate = MonthlyRentalRate;
        this.UnitOfUse = UnitOfUse;
        this.rate = rate;
        this.MonthlySubscriptionRate = MonthlySubscriptionRate;
        this.Rental = this.MonthlyRentalRate;
        this.Electricity = this.UnitOfUse * this.rate;
        this.InternetAccess = this.MonthlySubscriptionRate;
    }

    public int getMonthlyRentalRate() {
        return MonthlyRentalRate;
    }

    public void setMonthlyRentalRate(int monthlyRentalRate) {
        MonthlyRentalRate = monthlyRentalRate;
    }

    public int getUnitOfUse() {
        return UnitOfUse;
    }

    public void setUnitOfUse(int unitOfUse) {
        UnitOfUse = unitOfUse;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setMonthlySubscriptionRate(int monthlySubscriptionRate) {
        MonthlySubscriptionRate = monthlySubscriptionRate;
    }

    public int getMonthlySubscriptionRate() {
        return MonthlySubscriptionRate;
    }
    public int getRental() {
        return Rental;
    }

    public void setRental(int rental) {
        Rental = rental;
    }

    public int getElectricity() {
        return Electricity;
    }

    public void setElectricity(int electricity) {
        Electricity = electricity;
    }

    public int getInternetAccess() {
        return InternetAccess;
    }

    public void setInternetAccess(int internetAccess) {
        InternetAccess = internetAccess;
    }

    @Override
    public int getPayment() {
        return this.Rental + this.Electricity + this.InternetAccess;
    }


}
