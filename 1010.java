import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        // PRODUCT 1
        
        Scanner input = new Scanner(System.in);
        
        double product1;
        product1 = input.nextDouble();
        int units1;
        units1 = input.nextInt();
        double price1;
        price1 = input.nextDouble();
        
        product1 = units1 * price1;
        
        // PRODUCT 2
        
        double product2;
        product2 = input.nextDouble();
        int units2;
        units2 = input.nextInt();
        double price2;
        price2 = input.nextDouble();
        
        product2 = units2 * price2;
        
        double sum;
        sum = (units1 * price1) + (units2 * price2);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", sum);
        
        input.close();
 
    }
 
}
