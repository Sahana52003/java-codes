package Patterns;

/*public class Pattern2 {
    public static void main(String[] args) {
        int n=5;
        /*for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row+1;col++){*/
            /*for(int row=n;row>=1;row--){
                for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}*/

class Pattern2{
    public static void main(String[] args) {
        Pattern(5);
    }
    static void Pattern(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

