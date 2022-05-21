import java.util.Scanner;

public class SpeedConverter {
    public static void inputThenPrintSUmAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long ang = 0;
        int n = 0;
        while(scanner.hasNextInt()){
            int lol = scanner.nextInt();
            sum+=lol;
            n++;
        }
        ang = Math.round(((double)sum)/((double)n));
        System.out.println("SUM = "+sum+" AVG = "+ang);
    }
}
