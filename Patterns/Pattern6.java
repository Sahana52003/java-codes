 package Patterns;

public class Pattern6 {
    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=n;row++){
            for(int j=1;j<=row;j++){
                System.out.print("  ");
            }
            for(int j=row;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}