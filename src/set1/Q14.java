package set1;

import java.util.Scanner;
public class Q14 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the positive number (N) : ");
        int N =sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i<=N){
            sum = sum+i;
            i++;
        }
        System.out.println("the sum of natural numbers from 1 to " + N + " is : " +sum);
    }

}
