package set3;

public class q10 {
    public static void main(String[]args){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int y=1; y<=5;y++){
            for(int k=5; k>=y; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
