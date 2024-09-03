import java.util.*;

class CountNoofToggles {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String[] sarr = sc.nextLine().split(" ");
        int n = sarr.length;
        int[] arr = new int[n];
        int count = 0;
        for(int i =0; i < n; i++ ) arr[i] = Integer.parseInt(sarr[i]);
        int i = 0;
        while (i < n) {
            if(arr[i] == 0) {
                count++;
                toggle(arr , i);
            }
            i++;
        }
        System.out.print(count);
    }
    public static void toggle(int[] arr, int n ) {
        for (int i = n; i < arr.length; i++)
            arr[i] = arr[i] == 0 ? 1 : 0;
    }
}