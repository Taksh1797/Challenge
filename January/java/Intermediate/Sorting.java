package January.java.Intermediate;
import java.util.*;
public class Sorting {
    public static int n;
    public static Scanner sc = new Scanner(System.in);
    public static int[] a;
    public static void bub(){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){  
                if(a[j]>a[j+1]){
                    a[j]=a[j]+a[j+1];
                    a[j+1]=a[j]-a[j+1];
                    a[j]-=a[j+1];
                }
            }
        }
        System.out.println("Sorted by Bubble : ");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
    public static void sel(){
        for(int i=0;i<n;i++){
            int min=a[i];
            for(int j=i;j<n;j++){  
                if(min>a[j]){
                    min+=a[j];
                    a[j]=min-a[j];
                    min-=a[j];
                }
            }
            min+=a[i];
            a[i]=min-a[i];
            min-=a[i];
        }
        System.out.println("Sorted by Selection : ");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
    public static void ins(){
        for(int i=1;i<n;i++){
            int curr=a[i];
            int j=i-1;
            while(j>=0 && a[j]>curr){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=curr;
        }
        System.out.println("Sorted by Selection : ");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
    public static void main(String args[]){
        System.out.println("Enter Array length : ");
        n=sc.nextInt();
        a = new int[n];
        System.out.println("Enter array :");
        for(int i=0;i<n;i++){
            System.out.print("Enter element at index "+i+" : ");
            a[i]=sc.nextInt();
        }
        //bub();
        //sel();
        ins(); 
    }
}
