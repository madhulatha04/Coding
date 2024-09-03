import java.util.Scanner;

public class ReplaceZeroWithFives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c == '0')
                res.append('5');
            else
                res.append(c);
        }
        System.out.println(Integer.parseInt(res.toString()));
    }
}
