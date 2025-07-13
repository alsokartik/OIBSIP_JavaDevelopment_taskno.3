import java.util.*;

public class ATM {
    
    float Balance;
    
    int PIN=6969;
    
    public void checkpin(){
        
        System.out.println("Enter your PIN: ");
        
        Scanner scanner = new Scanner(System.in);
        
        int enteredpin= scanner.nextInt();
        
        if(PIN==enteredpin){
            
            Menu();
        }
        
        else{
            
            System.out.println("Enter a valid PIN.");
        }
    }
    
    public void Menu(){
    
        System.out.println("Enter your Choice: ");
    
        System.out.println("1. Check A/C Balance");
    
        System.out.println("2. Withdraw Money");
    
        System.out.println("3. Deposit Money");
    
        System.out.println("4. Exit");

    Scanner scanner= new Scanner(System.in);
    
    int opt = scanner.nextInt();
    
    if(opt==1){
    
        CheckBalance();
    }
    
    else if(opt==2){
    
        WithdrawMoney();
    }
    
    else if(opt==3){
    
        DepositMoney();
    }
    
    else if(opt==4){
    
        return;
    }
    
    else{
    
        System.out.println("Enter a valid choice");
    
        Menu();
    }
}
    public void CheckBalance(){
        
        System.out.println("Balance: " + Balance);
        
        Menu(); 
    }
    
    public void WithdrawMoney(){

        System.out.println("Enter amount to withdraw: ");
        
        Scanner scanner = new Scanner(System.in);
        
        float amount = scanner.nextFloat();
        
        if(amount>Balance){
        
            System.out.println("Insufficient Balance");
        }
        
        else{
        
            Balance = Balance - amount;
        
            System.out.println("Money Withdraw Successful");
        
            System.out.println("Your current balance: " + Balance);
        
        }Menu();
    }
    
    public void DepositMoney(){
            System.out.println("Enter the amount: ");
            
            Scanner scanner = new Scanner(System.in);
            
            float amount = scanner.nextFloat();
            
            Balance= Balance + amount;
            
            System.out.println("Money deposited succesfully");
        }
    public static void main(String[] args){
        
        ATM obj = new ATM();
        
        obj.checkpin();
    }
}
