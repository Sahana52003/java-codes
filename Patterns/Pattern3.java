package Patterns;

public class Pattern3 {
    /*  public static void main(String[] args) {
    Pattern(5);
}

static void Pattern(int n){
    for(int row=1;row<=n;row++){
        for(int col=1;col<=row;col++){
            System.err.print(col + " ");
        }
        System.out.println();
    }
}
}*/
public static void main(String[] args) {
    int n=5;
    for(int row=1;row<=n;row++){
        for(int col=1;col<=row;col++){
            System.out.print(col + " ");
        }
        System.out.println();
    }
}
}