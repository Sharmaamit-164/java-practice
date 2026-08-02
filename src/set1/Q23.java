package set1;

import java.util.Scanner;
public class Q23 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the name ");
        String input = sc.nextLine();
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("number of vowels:" + vowels);
        System.out.println("number of consonants : " + consonants);
    }
}
