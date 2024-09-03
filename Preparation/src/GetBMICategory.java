import java.util.Scanner;

public class GetBMICategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        float height = sc.nextFloat();
        float BMI = weight / (height * height);
        System.out.println((int)CalcBMI(BMI));
    }

    private static float CalcBMI(float bmi) {
        if( bmi < 18) return 0;
        else if ( bmi < 25 ) return 1;
        else if ( bmi < 30 ) return 2;
        else if ( bmi < 40 ) return 3;
        return 4;
    }
}
