package basics;

import java.util.Scanner;

    public class Q5{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            System.out.println("Before Swapping: a = " + a + ", b = " + b);
            int temp = a;
            a = b;
            b = temp;
            System.out.println("After Swapping: a = " + a + ", b = " + b);

        }
    }

