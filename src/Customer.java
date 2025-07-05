public class Customer {
    private String name;
    private float balance;

    public Customer(String name, float balance) {
        this.name = name;
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void update_balance(float amount) {
        this.balance -= amount;
    }

    public String getName() {
        return name;
    }
}