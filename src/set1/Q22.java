package set1;

import java.util.Scanner;
public class Q22 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter thr number of element");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter: ="+n+"integer");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("sorted element");
        for(int num:arr){

            System.out.println(num + " ");
        }
    }
}
