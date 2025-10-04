package comprehensive_practice;
import java.util.Scanner;
public class simple_calculator {
    public static void main(String[] args) {
        System.out.println("input the first number:");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();

        System.out.println("input the operator:");
        String operator = sc.next();

        System.out.println("input the second number:");
        double num2 = sc.nextDouble();

        System.out.println("the result is:"+ calculate(num1, operator, num2));

    }
    public static double calculate(double num1, String operator, double num2) {
        double result = 0;
        switch(operator){
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator");
        }
        return result;
    }
}
