package January.java.Intermediate;
import java.util.*;
public class ArraylistRev {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ArrayList Size : ");
        int n=sc.nextInt();
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.print("Enter ArrayList at index "+i+" : ");
            String temp = sc.next();
            arr.add(temp);
        }
        //Reverse
        for(int i=0;i<n/2;i++){
            String front=arr.get(i);
            String back=arr.get(n-1-i);
            arr.set(i, back);
            arr.set(n-1-i, front);
        }
        System.out.println(arr);
    }
}
