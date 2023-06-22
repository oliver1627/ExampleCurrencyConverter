package Currency;

public class Customer {
    private String name;
    private double usdAmount;

    public Customer(String name, double usdAmount) {
        this.name = name;
        this.usdAmount = usdAmount;
    }

    public String getName() {
        return name;
    }

    public double getUsdAmount() {
        return usdAmount;
    }

    public void setUsdAmount(double usdAmount) {
        this.usdAmount = usdAmount;
    }
}
