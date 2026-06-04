import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);
        
        double A;
        A = input.nextDouble();
        double B;
        B = input.nextDouble();
        double average;
        
        
        average = (A * 3.5 + B * 7.5) / (3.5 + 7.5);
        
        System.out.printf("MEDIA = %.5f\n", average);
        
        
 
    }
 
}
