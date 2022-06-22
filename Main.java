package ATMProject2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Account abhaysAccount = new Account("121212",0,"Abhay","abhay@xyz.com","1212121");

        System.out.println("Enter The Amount You Want To Deposit ");
        System.out.print("Rs.");
        int c=sc.nextInt();
        System.out.print("\n");
        abhaysAccount.DepositMoney(c);

        System.out.println("\nEnter The Amount You Want To Deposit ");
        System.out.print("Rs.");
        int c1=sc.nextInt();
        System.out.println("\n");
        abhaysAccount.DepositMoney(c1);

        System.out.println("\nEnter The Amount You Want To Widraw ");
        System.out.print("Rs.");
        int d=sc.nextInt();
        abhaysAccount.WithDrawMoney(d);

            //abhaysAccount.WithDrawMoney(d);
}
}
