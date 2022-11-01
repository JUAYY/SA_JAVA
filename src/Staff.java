public abstract class Staff implements IPayment {
    protected int salary;
    protected String name;
    protected double tax;



    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public double getTax() {
        return this.tax;
    }

    public void setTax(double tax) {
       this.tax = tax;
    }

    public Staff(String name, int salary, double tax) {
        this.name = name;
        this.salary = salary;
        this.tax = (3.00/100.00)*this.salary;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getPayment() {
        return 0;
    }
}
