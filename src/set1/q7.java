package set1;

import java.util.Scanner;
public class q7 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int a=sc.nextInt();
        System.out.println("enter the second number");
        int b=sc.nextInt();
        int c = (a+b);
        int d = (a-b);
        int e = (a*b);
        int f = (a/b);
        int g = (a%b);
        System.out.println("the arithemic opertors are as follow ");
        System.out.println("the added number is : " +c);
        System.out.println("the sub number is : " +d);
        System.out.println("the mult number is : " +e);
        System.out.println("the divided number is : " +f);
        System.out.println("the modulo number is : " +g);

    }
}
