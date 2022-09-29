/*
QUESTION : 
Write a program to accept an array of integers from the user. After accepting the input, arrange the elements in such a way that the largest element is at the last index and the smallest is at the 0th index. The first line of input will denote the number of elements in the array followed by the elements. Finally, output the re-arranged array in ascending order.
Example -
Input: 
5
64 1 32 978 12
Output: 
1 12 32 64 978
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
        System.out.print("The array before sorting is : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        Arrays.sort(arr);
        System.out.println();
        System.out.print("The array after sorting is : ");
        for (int i : arr ) {
            System.out.print(i + " ");
        }
    }
}

/*
SAMPLE OUTPUT : 
Enter the size of the array : 
3
Enter the elements of the array : 
12
34
2
The array before sorting is : 12 34 2 
The array after sorting is : 2 12 34 
*/
