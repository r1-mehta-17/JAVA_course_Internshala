/*
Calculate the area of different figures like rectangle, square, circle. Input the operands by the user for side length or radius. For performing the same create a different class Area and make the methods for the different figures. Then in the Main class, use the Area class to perform these operations.
Example -
Input: Radius = 3
Output: 28.26
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = 0;
        while(ch != 4) {
            System.out.println("Choose from the following : ");
            System.out.println("  1. Rectangle");
            System.out.println("  2. Square");
            System.out.println("  3. Circle");
            System.out.println("  4. Exit");
            System.out.println("Enter your choice : ");
            ch = sc.nextInt();
            switch(ch) {
                case 1 :
                    Area rectangle = new Area();
                    System.out.println("Enter the length : ");
                    float l = sc.nextFloat();
                    System.out.println("Enter the breadth : ");
                    float b = sc.nextFloat();
                    System.out.println("Area of the rectangle : " + rectangle.area(l,b));
                    break;
                case 2 :
                    Area square = new Area();
                    System.out.println("Enter the side of the square : ");
                    float s = sc.nextFloat();
                    System.out.println("Area of the square is : " + square.area(s));
                    break;
                case 3 :
                    Area circle = new Area();
                    System.out.println("Enter the radius of the circle : ");
                    double r = sc.nextDouble();
                    System.out.println("Area of the circle is : " + circle.area(r));
                    break;
                case 4 :
                    break;
                default :
                    System.out.println("Enter valid prompt.");
            }
        }
    }
}

class Area {
    public float area (float l, float b) {
        return l * b;
    }
    public float area (float s) {
        return s * s;
    }
    public double area (double r) {
        return 3.14 * r * r;
    }
}

/*
SAMPLE INPUT AND OUTPUT : 
Choose from the following : 
  1. Rectangle
  2. Square
  3. Circle
  4. Exit
Enter your choice : 
1
Enter the length : 
4.5
Enter the breadth : 
2
Area of the rectangle : 9.0
Choose from the following : 
  1. Rectangle
  2. Square
  3. Circle
  4. Exit
Enter your choice : 
2
Enter the side of the square : 
5.5
Area of the square is : 30.25
Choose from the following : 
  1. Rectangle
  2. Square
  3. Circle
  4. Exit
Enter your choice : 
3
Enter the radius of the circle : 
2.2
Area of the circle is : 15.197600000000003
Choose from the following : 
  1. Rectangle
  2. Square
  3. Circle
  4. Exit
Enter your choice : 
5
Enter valid prompt.
Choose from the following : 
  1. Rectangle
  2. Square
  3. Circle
  4. Exit
Enter your choice : 
4

Process finished with exit code 0
*/
