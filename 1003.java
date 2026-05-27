import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner input = new Scanner(System.in);
       
       int A;
       int B;
       int SOMA;
       
       A = input.nextInt();
       B = input.nextInt();
       SOMA = A + B;
       
       System.out.println("SOMA = " + SOMA);
 
    }
}
