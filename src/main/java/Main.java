import java.time.Duration;
import java.time.Instant;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Operations[] operations = Operations.values();

        System.out.printf("Enter the number of tests\n");
        int n = scanner.nextInt();

        System.out.printf("Enter the epsilon");
        double e = scanner.nextDouble();

        System.out.printf("Enter the maximum value of the variable: ");
        int max = scanner.nextInt();

        for(int i = 0; i<n; i++){
            int num1 = random.nextInt(0, max);
            int num2 = random.nextInt(0, max);
            Operations operation = operations[random.nextInt(operations.length)];
            String operator;
            double result = switch(operation){
                case ADD:
                    operator = "+";
                    yield num1 + num2;
                case SUB:
                    operator = "-";
                    yield num1 - num2;
                case MUL:
                    operator = "*";
                    yield num1 * num2;
                case DIV:
                    operator = "/";
                    if(num2 == 0) num2=1;
                    yield (double)num1 / num2;
                case MOD:
                    operator = "%";
                    yield num1 % num2;
            };

            System.out.println("Calculate " + num1 + operator + num2);
            System.out.println(result);
            Instant before = Instant.now();

            double answer = scanner.nextDouble();
            while( e < Math.abs(answer - result)){
                System.out.println("Wrong result!\nCalculate " + num1 + operator + num2);
                answer = scanner.nextDouble();
            }
            Duration difference = Duration.between(before, Instant.now());
            System.out.format("Your calculation time is %d.%d seconds!",difference.toSecondsPart(), difference.toMillisPart());
        }

    }
}