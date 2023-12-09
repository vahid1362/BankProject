import Bank.ATM;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ATM atm=new ATM();
        atm.EnterKEypad("123","123","6219");
       // atm.Withdraw(1000);
        atm.Deposit(2000);
    }
}