/*
QUESTION : 
BUILD A TAX CALCULATOR APP THAT TAKES A SPECIFIC NUMBER OF INPUTS OF NAMES AND INCOMES, AND RETURNS THE AMOUNT OF TAX THAT EACH OF THE PERSON HAS TO PAY.
QUESTION LINK : 
https://trainings.internshala.com/uploads/java/content_media/Leveraging_basic_concepts_assignment.pdf
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tax Calculator App");
        System.out.println("----- WELCOME -----");
        System.out.println();
        System.out.println("Enter total person count : ");
        int personCount = sc.nextInt();
        String[] names = new String[personCount];
        long[] salary = new long[personCount];
        for(int i=0; i<personCount; i++) {
            System.out.println();
            System.out.println("Enter name " + (i+1) + " : ");
            names[i] = sc.next();
            System.out.println("Enter " + names[i] + "'s Annual Income : ");
            salary[i] = sc.nextLong();
        }
        System.out.println();
        calculateTax(names, salary, personCount);
    }

    public static void calculateTax (String[] names, long[] salary, int personCount) {
        long[] tax = new long[personCount];
        for (int i=0; i<personCount; i++) {
            if(salary[i] >= 300000) {
                tax[i] = salary[i] / 5;
            } else if(salary[i] >= 100000 && salary[i] < 300000) {
                tax[i] = salary[i] / 10;
            } else {
                tax[i] = 0;
            }
        }
        System.out.println("Names with liable taxes");
        System.out.println("-----------------------");
        for (int i=0; i<personCount; i++) {
            System.out.println(names[i] + " : \u20B9 " + tax[i]);
        }
    }
}

/*
SAMPLE OUTPUT : 
Tax Calculator App
----- WELCOME -----

Enter total person count : 
3

Enter name 1 : 
Aarekh
Enter Aarekh's Annual Income : 
1500000

Enter name 2 : 
Kanav
Enter Kanav's Annual Income : 
70000

Enter name 3 : 
Dishant
Enter Dishant's Annual Income : 
150000

Names with liable taxes
-----------------------
Aarekh : ₹ 300000
Kanav : ₹ 0
Dishant : ₹ 15000
*/
