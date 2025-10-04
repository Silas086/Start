package BasicGrammar;
import java.util.Random;
public class random {
    public static void main(String[] args) {
        // Math.random():[0,1)之间的小数
        int a = (int)(Math.random() * 10);//[0,10)间的整数
        System.out.println(a);

        //此方法需要导包
        Random random = new Random();
        int number1 = random.nextInt(10);//[0,10)间的整数
        double number2 = random.nextDouble();
        System.out.println(number1);
        System.out.println(number2);
    }


}
