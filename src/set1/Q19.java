package set1;

import java.util.Scanner;
public class Q19 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num =sc.nextInt();
        int fact = 1;
        for (int i=1;i<=num;i++){
            fact =fact*i;
        }
        System.out.println("the factroial of the given number is : " +fact);
    }
}
