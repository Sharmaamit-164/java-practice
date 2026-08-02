package set1;

public class Q11 {
    public static void main(String[]args){
        long year = 2024;
        if((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.println("it is a leap year : " +year);
        }
        else{
            System.out.println("it is not a leap year : " +year);
        }
    }
}
