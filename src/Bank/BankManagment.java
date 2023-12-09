package Bank;

public class BankManagment {

    BankManagment()
    {
        cardManagment=new CardManagment();
    }
    CardManagment cardManagment;
    boolean Withdraw(Integer amount,String cardNo)
    {
        Account account=cardManagment.GetACccount(cardNo);
        if(account!=null)
        {
            if(account.Balance> amount) {
                account.Balance -= amount;
                return  true;
            }
     return false;
        }
        return  false;
    }
    boolean Deposit(Integer amount,String cardNo)
    {
        Account account=cardManagment.GetACccount(cardNo);
        if(account!=null)
        {
            account.Balance+=amount;
            return  true;
        }
        else
        {
            System.out.println("شماره کارت  نامعتبر است");
            return false;
        }
    }
}
