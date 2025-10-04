package comprehensive_practice;
import java.util.Scanner;
public class Health_calculator {
    //aim:输入身高，体重，年龄，性别并计算BMI和BMR
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身高（cm）：");
        double height = sc.nextDouble();

        System.out.println("请输入体重（kg）：");
        double weight = sc.nextDouble();

        System.out.println("请输入年龄：");
        int age = sc.nextInt();

        System.out.println("请输入性别：");
        String sex = sc.next();

        double bmi = calculator_BMI(height, weight);
        System.out.println("BMI:"+bmi);
        double bmr = calculator_BMR(height, weight, age, sex);
        System.out.println("BMR:" + bmr+"KJ");
        if(bmi<18.5){
            System.out.println("有点细了");
        }else if(bmi>=18.5&&bmi<24.9){
            System.out.println("正常");
        }else if(bmi>=24.9&&bmi<30){
            System.out.println("有点胖");
        } else if (bmi>=30&&bmi<80) {
            System.out.println("接近良子");
        }else{
            System.out.println("超越良子");
        }
    }

    public static double calculator_BMI(double height, double weight) {
        return weight / ((0.01*height) * (height*0.01));

    }
    public static double calculator_BMR(double height, double weight, int age, String sex) {
        if ("男".equals(sex)){
            return (10 * weight) + (6.25 * height) - (5 * age)+5;
        }else{
            return (10 * weight) + (6.25 * height) - (5 * age)-161;
        }
    }
}

