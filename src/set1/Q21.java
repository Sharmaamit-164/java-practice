package set1;

import java.util.Scanner;
public class Q21 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the five integer value");
        int arr []=new int[5];
        int sum=0;
        for(int i =0; i<5; i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("sum is: " +sum);
    }

}
