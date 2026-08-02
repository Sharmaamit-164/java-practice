package set1;

import java.util.Scanner;
public class Q6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the temperature in celcius");
        double temperature=sc.nextDouble();
        double F =0;
        F=30.5*(9.0/5.0)+32;
        System.out.println(" the given temperature from c is converted to f : " +F);
    }
}
