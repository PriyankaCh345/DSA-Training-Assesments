package Array;

import java.util.*;

public class Diff {

    static int difference(int arr[]) {
        return arr[arr.length - 1] - arr[0];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(difference(arr));

        sc.close();
    }
}
