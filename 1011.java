import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        
        double R;
        R = input.nextDouble();
        double pi = 3.14159;
        double volume;
        
        volume = (4.0 / 3) * pi * Math.pow(R, 3);
        
        System.out.printf("VOLUME = %.3f\n", volume);
        
        input.close();
 
    }
 
}
