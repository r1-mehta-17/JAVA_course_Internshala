/* 
Question : 
Accept a three digit number from the user (100 to 999). First, check that the number has only three digits. Then separate each digit of the number and then arrange them in the reverse order such that the middle digit remains the same and first and third digit are swapped.
Example -
Input: 347
Output: 743 
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a 3 digit number : ");
        int a = sc.nextInt();
        if(a > 999) {
            System.out.println("Error!! Please enter a 3 digit number.");
            return;
        }
        System.out.println("The entered number is : " + a);
        int b = 0;
        b += (a % 10) * 100;
        a /= 10;
        b += (a % 10) * 10;
        a /= 10;
        b += (a % 10);
        System.out.println("The reversed number is : " + b);
    }
}

/*
SAMPLE OUTPUT : 
Please enter a 3 digit number : 
102
The entered number is : 102
The reversed number is : 201
*/
