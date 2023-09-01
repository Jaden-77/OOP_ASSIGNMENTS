
public class main {
    
    public static void main(String[] args) {
        
        bank_account account = new bank_account(2380, 1300, "jaden", "jaden@email", 12345);
        System.out.println("Current bank information:");
        System.out.println("Account Number:" + account.getAccountNum());
        System.out.println("Account balance:" + account.getAccountBal());
        System.out.println("Customer name:" + account.getCustomer());
        System.out.println("Email:" + account.getEmail());
        System.out.println("Phone number:" + account.getPhoneNum());

        boolean depositSuccess = account.depoAmount(100.00);
        
        if(depositSuccess){
            System.out.println("deposite was successful");
        }
        else{
            System.out.println("deposite was not successful");
        }
        
        account.withdrawAmount(200.00);
    }
    
}
