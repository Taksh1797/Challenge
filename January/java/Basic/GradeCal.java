package January.java.Basic;
import java.util.Scanner;
public class GradeCal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] sub = {"Maths","Science","English","Social Science","Gujrati"};
        int[] marks = new int[5];
        for (int i=0;i<5;i++) {
            System.out.print("Enter Marks of "+sub[i]+" : ");
            marks[i] = sc.nextInt();
            if(marks[i]>100 || marks[i]<0){
                System.out.println("Invalid Marks ");
                return;
            }
        }
        for (int i=0;i<5;i++) {
            String str;
            if(marks[i]>=90)str="A";
            else if(marks[i]>=80)str="B";
            else if(marks[i]>=70)str="C";
            else if(marks[i]>=60)str="D";
            else if(marks[i]>=50)str="E";
            else str="F";
            System.out.println("Grade of "+sub[i]+" : "+str);
        }
    }
}