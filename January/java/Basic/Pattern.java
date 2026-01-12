package January.java.Basic;

public class Pattern {
    public static void main(String args[]){
        //Normal Trianle
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++)
                System.out.print(j+" ");
            System.out.println();
        }
        //Reverse Normal Triangle
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++)
                System.out.print(j+" ");
            System.out.println();
        }
        //Up & Down Triangle
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++)
                System.out.print("  ");
            for(int j=1;j<=i;j++)
                System.out.print(j+" ");
            for(int j=i-1;j>=1;j--)
                System.out.print(j+" ");
            System.out.println();
            System.out.println();
        }
        //Making Kajukatri by use Up & Down + Down & Up Triangle
        for(int i=4;i>=1;i--){
            for(int j=1;j<=5-i;j++)
                System.out.print("  ");
            for(int j=1;j<=i;j++)
                System.out.print(j+" ");
            for(int j=i-1;j>=1;j--)
                System.out.print(j+" ");
            System.out.println();
            System.out.println();
        }
    }
}
