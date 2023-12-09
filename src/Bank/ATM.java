package Bank;

public class ATM {

    Keypade keypad;
    CashDispenser cashDespenser;
    DepositSlot depositSlot;
    UserManagment userManagment;
    BankManagment bankManagment;
    boolean isAuthenticated;
    String cardNo;

   public ATM(){
       bankManagment=new BankManagment();
       userManagment=new UserManagment();
       cashDespenser=new CashDispenser();
       depositSlot=new DepositSlot();
   }
    public void EnterKEypad(String username, String password,String Cardno)
    {

       this.cardNo=Cardno;
       isAuthenticated=   userManagment.Authenticate(username ,password);
    }
    public void Withdraw(Integer  amount)
    {

        boolean result=bankManagment.Withdraw(amount,cardNo);
        if(!result)
            System.out.println("موجودی حساب  کافی نمی باشد");
         cashDespenser.Pollout();

    }
    public void Deposit(Integer  amount)
    {
        boolean result=bankManagment.Deposit(amount,cardNo);
        if(result)
        depositSlot.GetMoney();
    }
}
