/*
Accept an array from a user, duplicate it by creating a similar array and then try to compare it by equating both arrays (using the == operator). The result will be false as the duplicate arrays won't be equal to each other. Try to find the reason behind it and also make the same by using a different function
*/

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int arr2[] = new int[n];
        for (int i=0; i<n; i++) {
            arr2[i] = arr[i];
        }
        if (arr2 == arr) {
            System.out.println("The output is true on equal comparator.");
        } else {
            System.out.println("Output is false on equal comparator.");
        }
        if (Arrays.equals(arr,arr2)) {
            System.out.println("The output is true on using equals method.");
        } else {
            System.out.println("The output is false on using equals method.");
        }
    }
}

/*
SAMPLE OUTPUT :
Enter the size of the array : 
3
Enter the elements of the array : 
10
20
30
Output is false on equal comparator.
The output is true on using equals method.
*/
