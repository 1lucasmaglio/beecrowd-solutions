import java.util.Scanner;
import java.io.IOException;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        
        int A;
        A = input.nextInt();
        int B;
        B = input.nextInt();
        int prod;
        prod = A * B;
        
        System.out.println("PROD = " + prod);
        
        input.close();
    }
 
}
