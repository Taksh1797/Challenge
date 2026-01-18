package January.java.Intermediate;
import java.util.*;
/*
    1.Write a program to find if a number is a power of 2 or not.
    2.Write a program to toggle a bit a position = “pos” in a number “n”.
    3.Write a program to count the number of 1’s in a binary representation of the number.
    4.Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another.
*/
public class PracticeBit {
    public static Scanner sc = new Scanner(System.in);
    public static int n,pos,BitMask;
    public static void powerOfTwo(){
        if((n&(n-1))==0){
            System.out.println(n + " is a power of 2");
        }
        else{
            System.out.println(n + " is not a power of 2");
        }
    }
    public static void toggleBit(){
        System.out.println("Enter Position : ");
        pos=sc.nextInt();
        BitMask = 1<<pos;
        int num = BitMask ^ n;
        System.out.println("Number after toggling bit: " + num);
    }
    public static void count1(){
        int c=0,temp=n;
        do{
            if((temp&1)!=0)
                c++;
            temp>>=1;
        }while(temp!=0);
        System.out.println("Count of 1 : "+c);
    }
    public static void decimalToBinary(){
        int temp=n,x=0;
        System.out.print("Binary : ");
        for(int i=0;temp!=0;i++){
            BitMask=1;
            int ans=1;
            if((temp&BitMask)!=0){
                for(int j=0;j<i;j++){
                    ans*=10;
                }
                x=x+ans;
            }
            temp>>=1;
        }
        System.out.println(x);
    }
    public static void binaryToDecimal(){
        System.out.print("Enter a Binary number : ");
        int b=sc.nextInt();
        int x=0;
        for(int i=0;b!=0;i++){
            int ans = 1;
            for(int j=0;j<i;j++){
                ans*=2;
            }
            if(b%10==1){
                x+=ans;
            }
            b/=10;
        }
        System.out.println("Decimal : "+x);
    }
    public static void main(String args[]){
        System.out.println("Enter Number : ");
        n=sc.nextInt();
        powerOfTwo();
        toggleBit();
        count1();
        decimalToBinary();
        binaryToDecimal();
    }
}
