package January.java.Basic;
import java.util.Scanner;
public class Operator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b;

        //Arithmetic Operators

        System.out.print("Enter First Number : ");
        a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        b = sc.nextInt();
        System.out.println(a+" + "+b+" : "+(a+b));
        System.out.println(a+" - "+b+" : "+(a-b));
        System.out.println(a+" * "+b+" : "+(a*b));
        System.out.println(a+" / "+b+" : "+(a/b));
        System.out.println(a+" % "+b+" : "+(a%b));

        //Relational Operators

        System.out.println(a+" > "+b+" : "+(a>b));
        System.out.println(a+" < "+b+" : "+(a<b));
        System.out.println(a+" = "+b+" : "+(a==b));
        System.out.println(a+" != "+b+" : "+(a!=b));

        //Bitwise Operators

        System.out.println(a+" AND "+b+" : "+(a&b));
        System.out.println(a+" OR "+b+" : "+(a|b));
        System.out.println(a+" XOR "+b+" : "+(a^b));
        System.out.println(a+" NOT "+b+" : "+(~b));
        System.out.println(a+" Left Shift : "+(a<<2));
        System.out.println(b+" Left Shift : "+(b<<2));
        System.out.println(a+" Right Shift : "+(a>>2));
        System.out.println(b+" Right Shift : "+(b>>2));
    }
}
