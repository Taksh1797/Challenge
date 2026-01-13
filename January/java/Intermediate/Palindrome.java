package January.java.Intermediate;
import java.util.Scanner;
public class Palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);
        String rev = sb.reverse().toString();
        System.out.println(rev+"\n"+str);
        if(str.equals(rev))
            System.out.println("String "+str+" is Palindrome.");
        else
            System.out.println("String "+str+" is not Palindrome.");
    }
}