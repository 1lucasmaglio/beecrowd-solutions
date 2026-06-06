import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();

        int maiorAB = (A + B + Math.abs(A - B)) / 2;
        int maiorFinal = (maiorAB + C + Math.abs(maiorAB - C)) / 2;

        System.out.println(maiorFinal + " eh o maior");

        input.close();
    }
}
