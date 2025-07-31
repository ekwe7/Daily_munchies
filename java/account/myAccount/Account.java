public class Account {
    int balance = 0;
//    String accountPin = "12345";

    public int getbalance() {
        return balance;

    }

    public int deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
        return balance;
    }

    public int withdraw(int amount) {
        return balance -= amount;
    }

}



