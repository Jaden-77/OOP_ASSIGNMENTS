/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class bank_account {
    
   private int accountNum;
   private float accountBal;
   private String customer;
   private String email;
   private int phoneNum;
    
    
    public bank_account(int accountNum, float accountBal, String customer, String email, int phoneNum){
        this.accountNum = accountNum;
        this.accountBal = accountBal;
        this.customer = customer;
        this.email = email;
        this.phoneNum = phoneNum;
    }
    
    
    public float getAccountBal(){
        return accountBal;
    }
    
    public int getAccountNum(){
        return accountNum;
    }
    
     public String getCustomer(){
        return customer;
    }
    
    public String getEmail(){
        return email;
    }
    
    public int getPhoneNum(){
        return phoneNum;
    }
    
    
    public void setAccountNum(int accountNum){
        this.accountNum = accountNum;
    }
    
    public void setAccountBal(float accountBal){
        this.accountBal = accountBal;
    }
    
    public void setCustomer(String customer){
        this.customer = customer;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setPhoneNum(int phoneNum){
        this.phoneNum = phoneNum;
    }
    
    
    public boolean depoAmount(double amount){
        if(amount > 0){
            accountBal += amount;
            System.out.println("Deposite succesful, account balnce is P"+accountBal);
            return true;
        }
        else{
            System.out.println("Deposite insuccesful, account balnce is P"+accountBal);
            return false;
        }
    }
    
    
    public boolean withdrawAmount(double amount){
        if(accountBal >= amount){
            accountBal -= amount;
            System.out.println("Withdraw succesful, account balnce is P"+accountBal);
            return true;
        }
        else{
            System.out.println("Withdraw insuccesful, account balnce is P"+accountBal);
            return false;
        }
    }
}
