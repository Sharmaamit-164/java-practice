package set1;

import java.util.Scanner;
public class Q15 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the integer number");
        int num=sc.nextInt();
        int reversed =0;
        while (num!=0){
            int digit = num%10;
            reversed = reversed*10+digit;
            num = num/10;
        }
        System.out.println("the reversed number is : " +reversed);

    }


}
