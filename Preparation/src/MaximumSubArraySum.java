import java.util.Scanner;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
//        int[] arr = {3, -1, 2, 5, -6, 3};
        int max = arr[0], crntsum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int num = arr[i];
            crntsum = Math.max(num, crntsum + num);
            max = Math.max(crntsum, max);
        }
        System.out.println(max);
    }
}
