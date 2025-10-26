package Patterns;

public class Pattern10 {
    public static void main(String[] args) {
    int n=5;
    for(int row=1;row<=n;row++){
        for(int space=row;space<=n-1;space++){
            System.out.print("  ");
        }
        for(int col=1;col<=row*2-1;col++){
            System.out.print("* ");
        }
        System.out.println();
    }
    for(int row=n-1;row>=1;row--){
        for(int space=n-row;space>=1;space--){
            System.out.print("  ");
        }
        for(int col=1;col<=row*2-1;col++){
            System.out.print("* ");
        }
        System.out.println();
    }
}
}