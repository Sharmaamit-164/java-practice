package set1;

import java.util.Scanner;
public class Q5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first digit");
        int first=sc.nextInt();
        System.out.println("enter second digit");
        int second=sc.nextInt();
        int addednumber=(first+second);
        System.out.println("the add number is : " +addednumber);
    }
}
