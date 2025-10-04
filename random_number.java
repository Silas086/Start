package comprehensive_practice;
import java.util.Random;
import java.util.Scanner;
//aim:generate a random number[0,100],guess it util you get it
public class random_number {
    public static void main(String[] args) {
        Random r = new Random();
        int correct_num = r.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("input your guess:");
            int guess_num = sc.nextInt();
            if(guess_num<correct_num){
                System.out.println("your guess is too small");
            }else if(guess_num>correct_num){
                System.out.println("your guess is too big");
            }else{
                System.out.println("you are right!");
                break;
            }
        }
        System.out.println("the correct number is:"+correct_num);
    }
}
