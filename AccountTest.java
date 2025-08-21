public class AccountTest {
    public static void main(String[] args) {
        CheckingAccount account1 = new CheckingAccount();
        account1.nama = "Aldo";
        account1.saldo = 1000.0;
        account1.bunga = 0.02;
        account1.cetak();
        account1.deposit(15000);
        account1.withdraw();
        account1.calkulateInterest();


CheckingAccount account2 = new CheckingAccount();
      account2.nama = "andrew";
        account2.saldo = 1000.0;
        account2.bunga = 0.02;
        account2.cetak();
        account2.deposit(15000);
        account2.withdraw();
        account2.calkulateInterest();
   
        
    

    }
}
