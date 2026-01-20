package January.java.Intermediate;
import java.util.*;
public class Sorting {
    public static int n;
    public static Scanner sc = new Scanner(System.in);
    public static void bub(int a[]){
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
    public static void sel(int a[]){
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
    public static void ins(int a[]){
        for(int i=1;i<n;i++){
            int curr=a[i];
            int j=i-1;
            while(j>=0 && a[j]>curr){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=curr;
        }
        System.out.println("Sorted by Insertion : ");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
    public static void mer(int a[]){
        div(a,0,n-1);
        System.out.println("Sorted by Merge : ");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
    private static void div(int a[],int fi,int li){
        if(fi>=li)return;
        int mid=fi+(li-fi)/2;
        div(a, fi, mid);
        div(a, mid+1, li);
        con(a, fi, mid,li);
    }
    private static void con(int a[],int fi,int mid,int li){
        int[] mer= new int[li-fi+1];
        int i1=fi;
        int i2=mid+1;
        int x=0;
        while (i1<=mid&&i2<=li) {  
            if(a[i1]<=a[i2])
                mer[x++]=a[i1++];
            else
                mer[x++]=a[i2++];
        }
        while (i1<=mid)
            mer[x++]=a[i1++];
        while (i2<=li)
            mer[x++]=a[i2++];
        for(int i=0,j=fi;i<mer.length;i++,j++){
            a[j]=mer[i];
        }
    }
    public static void main(String args[]){
        System.out.println("Enter Array length : ");
        n=sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array :");
        for(int i=0;i<n;i++){
            System.out.print("Enter element at index "+i+" : ");
            a[i]=sc.nextInt();
        }
        //bub(a);
        //sel(a);
        //ins(a); 
        //mer(a);
    }
}
