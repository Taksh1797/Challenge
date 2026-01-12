package January.java.Basic;
import java.util.Scanner;
public class StringRev {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);
        int length = str.length();
        for(int i=0;i<length/2;i++){
            char frontTemp = str.charAt(i);
            char backTemp = str.charAt(length-i-1);
            sb.delete(i,i+1);
            sb.insert(i, backTemp);
            sb.delete(length-i-1,length-i);
            sb.insert(length-i-1,frontTemp);
        }
        str = sb.toString();
        System.out.println("Rev : "+str);
        //Simple way
        sb.reverse();
        str = sb.toString();
        System.out.println("Re Rev : "+str);
    }
}