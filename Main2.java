package ATMProject2;
import java.util.*;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Main2 sc1=new Main2();
        Account UserAccount = new Account("25360455",0,"Ankita Das","abhay@xyz.com","9330000000");
        //System.out.println("Enter The Amount You Want To Deposit ");
        //System.out.print("Rs.");
        int[] c=new int[20];
        System.out.println("Do you want to deposit any amount?"+UserAccount.getName());
        System.out.println("If YES -> Press 1\nIf NO press 2 ");
        int s=sc.nextInt();
int n=0,i=0;
int flag=0,sum=0;

                switch (s) {

                    case 1:
                        System.out.println("Enter The Amount You Want To Deposit ");
                        System.out.print("Rs.");
                        //int c1 = sc1.nextInt();
                        c[i + n] = sc.nextInt(); //0+0
                        // System.out.println("Money now " + c);
                        //System.out.println("c[ " + (i+n)+"] = "+c[i + n]);
                        break;
                    case 2:
                        System.out.println("Thanks for Visiting Us ");
                        break;
                    default:
                        System.out.println("You Entered Incorrect Choice ");
                        break;
                }
                n++;//n=1

        if(s==1){
            /*System.out.print("i is ."+i); //0
            System.out.print("n is ."+n); //1
                i=i+n;
            System.out.print("Now i is ."+i);//1*/
                System.out.println("Do you want to deposit any more amount?");
                System.out.println("If YES -> Press 1\nIf NO press 2 ");
            int s1=sc.nextInt();

            switch (s1) {

                case 1:
                    System.out.println("Enter The Amount You Want To Deposit ");
                    System.out.print("Rs.");
                    //int c1 = sc1.nextInt();
                    c[i + n] = sc.nextInt(); //0+1
                     //System.out.println("c[ " + (i+n)+"] = "+c[i + n]);
                    break;
                case 2:
                    System.out.println("Thanks for Visiting Us ");
                    break;
                default:
                    System.out.println("You Entered Incorrect Choice ");
                    break;


            }

                }
        n++;

            do {
                System.out.println("Do you really want to deposit any more amount?\n This is the last chance for today to deposit.");
                System.out.println("If YES -> Press 1\nIf NO press 2 ");
                int s2=sc.nextInt();
                switch (s2) {

                    case 1:
                        System.out.println("Enter The Amount You Want To Deposit ");
                        System.out.print("Rs.");
                        c[i+n] = sc.nextInt();
                        //System.out.println(" here c[ " + (i+n)+"] = "+c[i + n]);
                        break;
                    case 2:
                        System.out.println("Thanks for Visiting Us ");
                        break;
                    default:
                        System.out.println("You Entered Incorrect Choice ");
                        break;
                }

            }while(s>2);

        int length = c.length;
        for(i=0;i<length;i++) {
            //System.out.println("Sum at i"+i+"=> "+sum);
            sum=sum+c[i];
        }
        UserAccount.DepositMoney(sum);
        System.out.println("FINAL VALUE OF MONEY DEPOSITED "+sum);

            System.out.println("Do you want to withdraw any amount?");
            System.out.println("If YES -> Press 1\nIf NO press 2 ");
            int s1 = sc.nextInt();
            switch (s1) {
                case 1:
                    System.out.println("Enter The Amount You Want To Withdraw");
                    System.out.print("Rs.");
                    int d = sc.nextInt();
                    UserAccount.WithDrawMoney(d);
                    break;
                case 2:
                    d = 0;
                    UserAccount.WithDrawMoney(d);
                    System.out.println("Thanks for Visiting Us ");
                    break;

                default:
                    System.out.println("You Entered Incorrect Choice ");
            }
        }

    }

