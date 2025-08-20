public class AccountTest {
    private static SavingAccount account2;

    public static void main(String[] args) {
        
        SavingAccount account1 = new SavingAccount();
        account1.balance = 2000;
        account1.balance += account1.calculateInterest();
        account1.name  = "Hadi";
        account1.interestRate = 0.02;
        account1.displayCustomer();

        SavingAccount account2 = new SavingAccount();
        account2.balance = 5000;
        account2.balance += account2.calculateInterest();
        account2.name  = "Dimas";
        account2.interestRate = 0.02;
        account2.displayCustomer();

        double quotient = account2.balance / account1.balance;
        System.out.println("Hasil dari saldo " + account2.name + " dibagi dengan saldo " + account1.name + " : " + quotient);
    }
}
