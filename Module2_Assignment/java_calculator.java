/*
Let's create a basic calculator using Java. The calculator will have the following functions:
Addition
Subtraction
Multiplication
Division
Remainder
Make sure that while performing division the denominator is not zero. And if any user inputs zero, appropriate message should be displayed instead of a break in execution. First ask the user to input the two operands and then output the results of all the functions separately.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();
        System.out.println("Enter the operation you want to perform on these values - ");
        System.out.println("  1. Addition");
        System.out.println("  2. Subtraction");
        System.out.println("  3. Multiplication");
        System.out.println("  4. Division");
        System.out.println("  5. Remainder");
        int ch = sc.nextInt();
        int result = 0;
        switch (ch) {
            case 1 :
                result = a + b;
                System.out.println("The result of addition of a and b is " + result);
                break;
            case 2 :
                result = a - b;
                System.out.println("The result of subtraction of a and b is " + result);
                break;
            case 3 :
                result = a * b;
                System.out.println("The result of multiplication of a and b is " + result);
                break;
            case 4 :
                if(b == 0) {
                    System.out.println("Division by 0 is not possible.");
                    break;
                }
                result = a / b;
                System.out.println("The result of division of a and b is " + result);
                break;
            case 5 :
                if(b == 0) {
                    System.out.println("Division by 0 is not possible.");
                    break;
                }
                result = a % b;
                System.out.println("The remainder when a is divided by b is " + result);
                break;
            default :
                System.out.println("Choose from the available 4 options only.");
        }
    }
}

/*
SAMPLE OUTPUT 1 : 
Enter the value of a : 
10
Enter the value of b : 
5
Enter the operation you want to perform on these values - 
  1. Addition
  2. Subtraction
  3. Multiplication
  4. Division
  5. Remainder
4
The result of division of a and b is 2

SAMPLE OUTPUT 2 : 
Enter the value of a : 
3
Enter the value of b : 
7
Enter the operation you want to perform on these values - 
  1. Addition
  2. Subtraction
  3. Multiplication
  4. Division
  5. Remainder
1
The result of addition of a and b is 10
*/
