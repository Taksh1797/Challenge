package January.java.Intermediate;
import java.util.*;
public class BitManuplation {
    public static Scanner sc = new Scanner(System.in);
    public static int n,pos,c,BitMask;
    public static void getBit(){
        BitMask = 1<<pos;
        if ((BitMask & n)==0) {
            System.out.println("Bit is 0");
        }
        else{
            System.out.println("Bit is 1");
        }
    }
    public static void setBit(){
        BitMask = 1<<pos;
        int num = BitMask | n;
        System.out.println("Number after setting bit: " + num);
    }
    public static void clearBit(){
        BitMask = ~(1<<pos);
        int num = BitMask & n;
        System.out.println("Number after clearing bit: " + num);
    }
    public static void updateBit(){
        System.out.println("Enter value to update (0 or 1):");
        int v = sc.nextInt();
        if (v==0) {
            clearBit();
        }
        else{
            setBit();
        }
    }
    public static void main(String args[]){
        System.out.println("Bit Manipulation.");
        System.out.println("Enter number:");
        n=sc.nextInt();
        System.out.println("Enter position:");
        pos=sc.nextInt();
        System.out.println("1. Get Bit 2. Set Bit 3. Clear Bit 4. Update Bit");
        System.out.println("Enter your choice:");
        c=sc.nextInt();
        switch (c) {
            case 1:
                getBit();
                break;
            case 2:
                setBit();
                break;
            case 3:
                clearBit();
                break;
            case 4:
                updateBit();
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
}
