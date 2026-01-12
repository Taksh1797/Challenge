package January.java.Basic;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First how many number you want to display : ");
        int n=sc.nextInt();
        int a=0,b=1,temp;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            temp = a;
            a = b;
            b += temp;
        }
    }
}