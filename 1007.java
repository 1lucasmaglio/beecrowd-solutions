import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        
        int A;
        A = input.nextInt();
        int B;
        B = input.nextInt();
        int C;
        C = input.nextInt();
        int D;
        D = input.nextInt();
        int difference;
        
        difference = (A * B - C * D);
        
        System.out.println("DIFERENCA = " + difference);
        
        input.close();
        
    }
 
}
