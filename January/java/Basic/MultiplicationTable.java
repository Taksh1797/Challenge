package January.java.Basic;
import java.util.Scanner;
public class MultiplicationTable {
    Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Table : ");
        int a = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(a+" X "+i+" = "+(a*i));
        }
    }
}