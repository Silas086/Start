package for_while_loop_practice;
//aim:print 99乘法表
public class N4 {
    public static void main(String[] args){
        print();
    }
    public static void print(){
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+" ");
            }
            System.out.println();
        }
    }
}
