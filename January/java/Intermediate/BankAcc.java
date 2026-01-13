package January.java.Intermediate;
import java.util.Scanner;
public class BankAcc {
    private int Balance = 56000;
    Scanner sc = new Scanner(System.in);
    public void Display(){
        System.out.println("Your Balance : "+Balance);
    }
    public void Withdraw(){
        System.out.print("Enter Withdrawing ammount : ");
        int ammount = sc.nextInt();
        if(Balance<ammount){
            System.out.println("Ammount is Lower than Withdrawing ammount ...");
            return;
        }
        Balance-=ammount;
        System.out.println("Withdraw ammount : "+ammount);
        System.out.println("Balance : "+Balance);
    }
    public static void main(String args[]){
        System.out.println("1.Display 2.Withdraw 3.Exit");
        BankAcc obj = new BankAcc();
        Scanner sc = new Scanner(System.in);
        int c;
        while(true){
            System.out.print("Enter Choice : ");
            c = sc.nextInt();
            switch (c) {
                case 1:
                    obj.Display();
                    break;
                case 2:
                    obj.Withdraw();
                    break;
                case 3:
                    System.out.println("Exit...");
                    return;
                default:
                    System.out.println("Invalid Choice.");
                    break;
            }
        }
    }
}