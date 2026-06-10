package Array;

import java.util.*;

class delSmall {

    static void deleteSmallest(int arr[]) {

        int minIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        for (int i = minIndex; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        deleteSmallest(arr);
    }
}
