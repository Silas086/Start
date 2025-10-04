package comprehensive_practice;
import java.util.Scanner;
public class random_captcha {
    public static void main(String[] args){
        System.out.println("generate n—digit code:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The code is:"+getcode(n));

    }
    public static String getcode(int n){
        String code = "";
        for(int i=0;i<n;i++){
            int probability = (int)(Math.random()*3);

        switch(probability){
            case 0:
                int number = (int)(Math.random()*10);
                code += number;
                continue;
            case 1:
                int number1 = (int)(Math.random()*26);

                code += (char)('A'+number1);
            continue;
            case 2:
                int number2 = (int)(Math.random()*26);
                char ch1 = (char)('a'+number2);
                code += ch1;


            }
        }
        return code;
    }
}
