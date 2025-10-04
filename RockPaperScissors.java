package comprehensive_practice;
import java.util.Scanner;
//编写一个石头剪刀布游戏程序，玩家可以与电脑进行对战，先赢得3局的玩家获胜。
public class RockPaperScissors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] computer = new String[]{"石头","剪刀","布"};
        int count_player = 0;
        int count_computer = 0;
        int i = 1;

       while(count_computer<3 && count_player<3){
           System.out.println("第"+ i +"局:");
           int n = (int)(Math.random()*3);
           String computer_choice = computer[n];
           String player_choice = sc.next();
           i = Judgement(player_choice, computer,i);
           System.out.println("your choice: " + player_choice);
           System.out.println("computer choice: " + computer_choice);
           if(player_choice.equals(computer_choice)){
               System.out.println("平局");
           }else{
               if(player_choice.equals("石头")){
                   if(computer_choice.equals("剪刀")){
                       System.out.println("Player wins");
                       count_player++;
                   }else{
                       System.out.println("Computer wins");
                       count_computer++;
                   }
               }else if(player_choice.equals("剪刀")){
                   if(computer_choice.equals("布")){
                       System.out.println("Player wins");
                       count_player++;
                   }else{
                       System.out.println("Computer wins");
                       count_computer++;
                   }
               }else if(player_choice.equals("布")){
                   if(computer_choice.equals("石头")){
                       System.out.println("Player wins");
                       count_player++;
                   }else{
                       System.out.println("Computer wins");
                       count_computer++;
                   }
               }
           }

        }
        if(count_player>count_computer){
            System.out.println("Player wins finally");
        }else{
            System.out.println("Computer wins finally");
        }
    }
    public static int Judgement(String result,String[] arr,int j){
            if(result.equals(arr[0]) || result.equals(arr[1]) || result.equals(arr[2])){
                j++;

            }else{
                System.out.println("数据不符合常规，请重新输入");

            }
            return j;
        }
}
