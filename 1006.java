import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        
        double A;
        A = input.nextDouble();
        double B;
        B = input.nextDouble();
        double C;
        C = input.nextDouble();
        double average;
        
        average = (A * 2 + B * 3 + C * 5) / (2 + 3 + 5);
        
        System.out.printf("MEDIA = %.1f\n", average);
    }
 
}
