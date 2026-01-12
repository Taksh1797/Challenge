package January.java.Basic;
import java.util.Scanner;
public class ArrayAvg {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            System.out.print("Enter Value of Index "+i+" : ");
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        double avg=((double)sum/n);
        System.out.println("Avg : "+avg);
    }
}
