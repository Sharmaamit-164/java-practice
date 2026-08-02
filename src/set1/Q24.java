package set1;

import java.util.Scanner;
public class Q24 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the integer value: ");
        int a = sc.nextInt();
        System.out.println("original int value: " +a);

        double b = a;
        System.out.println("after implicit casting to double: " +b);

        int c = (int)b;
        System.out.println(" after explicit casting back to int : " +c);

    }
}
