/*
QUESTION :
Play a little prank with your friends and swap their names in the attendance website. Use Java to code a program to perform this. Keep in mind that you do not have any additional space for more variables. Use just two.
Example -
Input: a = "Harry", b = "Drake"
Output: a = "Drake", b = "Harry"
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of friend A : ");
        String s1 = sc.next();
        System.out.println("Enter the name of friend B : ");
        String s2 = sc.next();
        s1 = s1 + s2;
        s2 = s1.substring(0,s1.length()-s2.length());
        s1 = s1.substring(s2.length());
        System.out.println("The name of friend A is : " + s1);
        System.out.println("The name of friend B is : " + s2);
    }
}

/*
SAMPLE OUTPUT : 
Enter the name of friend A : 
Aarekh 
Enter the name of friend B : 
Kanav
The name of friend A is : Kanav
The name of friend B is : Aarekh
*/
