import java.util.Scanner;
import java.io.IOException;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner (System.in);
        
        int number;
        number = input.nextInt();
        int hoursMonth;
        hoursMonth = input.nextInt();
        double perHour;
        perHour = input.nextDouble();
        double salary;
        
        salary = (hoursMonth * perHour);
        
        
        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f\n", salary);
        
        input.close();
 
    }
 
}
