package ATMProject2;
import java.util.*;
public class Account {
    private String Number;
    private double Balance;
    private String Name;
    private String Email;
    private String PhoneNumber;

    public Account(String Number,double Balance,String Name,String Email
            ,String PhoneNumber){
        this.Number = Number;
        this.Balance = Balance;
        this.Name = Name;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
    }

    public void DepositMoney(double DepositedMoney){
        this.Balance=DepositedMoney;
        System.out.println("Deposit is Successful, new Balance is " +this.Balance);
    }

    public void WithDrawMoney(double WithdrawalMoney){
        if(this.Balance - WithdrawalMoney < 0){
            System.out.println("WithDraw Unseccessful only " + this.Balance+" is left");
        }
        else if(WithdrawalMoney == 0){
            //this.Balance-=WithdrawalMoney;
            System.out.println("You haven't Withdraw anything. So Your Balance " + this.Balance);
        }
        else {
           // System.out.print("\nthis balance before"+this.Balance);
            this.Balance-=WithdrawalMoney;
            /*System.out.print("\n");
            System.out.print("this balance after"+this.Balance);
            System.out.print("Withdraw"+WithdrawalMoney);*/
            System.out.println("Withdraw successful, Current Balance is "+this.Balance);
        }

    }

    /*public void Deposit(int s, int c,int flag,int c3) {
        //Scanner sc1=new Scanner();

        switch (s) {
            case 1:
                System.out.println("Enter The Amount You Want To Deposit ");
                System.out.print("Rs.");
                //int c1 = sc1.nextInt();
                System.out.println("Money now " + c3);
                DepositMoney(100);
                flag = 0;
                break;
            case 2:
                System.out.println("Thanks for Visiting Us ");
                flag = 0;
                break;
            default:
                System.out.println("You Entered Incorrect Choice ");
                flag = 1;
                break;
        }
    }*/

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

}
