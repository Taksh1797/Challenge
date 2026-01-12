package January.java.Basic;
import java.util.Scanner;
public class MaxInN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many number you have : ");
        int n=sc.nextInt();
        int[] a = new int[n];
        int max=0;
        for(int i=0;i<n;i++){
            System.out.print("Enter Digit "+(i+1)+" : ");
            a[i]=sc.nextInt();
            if(i==0)
                max=a[0];
            else if(a[i]>max)
                max=a[i];
        }
        System.out.println("Max : "+max);
    }
}
