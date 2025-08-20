
public class SavingAccount {
    public double balance;
    public double interestRate;
    public String name;
    public String nama;
    public double saldo;
    public double bunga;

    public void displayCustomer() {
        System.out.println("Customer: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Interest Earned: " + (balance * interestRate));
        System.out.println("-------------------------------");
        System.out.println("Total Balance after Interest: " + (balance + (balance * interestRate)));
        System.out.println("-------------------------------");
        System.out.println("Thank you for banking with us!");
    }

    // Method to calculate monthly interest
    public double calculateInterest() {
        double interest = balance * interestRate / 12;
        return interest;
    }

    public void cetak() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cetak'");
    }
}