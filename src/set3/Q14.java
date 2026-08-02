package set3;

import java.util.Scanner;
public class Q14 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the five values of floats ");
        float arr[]=new float[5];
        float sum=0;
        for(int i=0;i<5;i++){
            arr[i]=sc.nextFloat();
            sum=sum+arr[i];
        }
        System.out.println("the sum of float value is : " +sum);
    }
}
