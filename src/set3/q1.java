package set3;

import java.util.Scanner;
public class q1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the year ");
        double year = sc.nextDouble();
        if(( year%4==0 && year%100!=0 ) || ( year%400==0)){
            System.out.println(" the year is a leap year : " + year);
        }
        else{
            System.out.println(" the year is not a leap year : " + year);
        }}}
