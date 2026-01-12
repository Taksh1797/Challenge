package January.java.Basic;
import java.util.Scanner;
public class Operator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b;

        //Ar

        System.out.print("Enter First Number : ");
        a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        b = sc.nextInt();
        System.out.println("Sum of "+a+" & "+b+" : "+(a+b));
        System.out.println("Min of "+a+" & "+b+" : "+(a-b));
        System.out.println("Mul of "+a+" & "+b+" : "+(a*b));
        System.out.println("Div of "+a+" & "+b+" : "+(a/b));
        System.out.println("Mod of "+a+" & "+b+" : "+(a%b));
    }
}
