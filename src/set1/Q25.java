package set1;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Q25 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st value");
        int a=sc.nextInt();
        System.out.println("enter 2nd value");
        int b=sc.nextInt();
        a=(a+b);
        b=(a-b);
        a=(a-b);
        System.out.println("after the swap the 1st value: " +a);
        System.out.println("after the swap the 2nd value: " +b);
    }
}
