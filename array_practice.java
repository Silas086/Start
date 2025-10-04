package comprehensive_practice;
//aim:generate a picture(n*n),and mess it up
public class array_practice {
    public static void main(String[] args){
        Generatea_And_Mess_Array(5);
    }
    public static void Generatea_And_Mess_Array(int n){
        int[][] array = new int[n][n];
        int count = 0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                array[i][j] = count++;
            }
        }
        printArray(array);
        System.out.println();
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                int row = (int)(Math.random()*array.length);
                int column = (int)(Math.random()*array[i].length);
                int temp = array[i][j];
                array[i][j] = array[row][column];
                array[row][column] = temp;
            }
        }
        printArray(array);
    }

    public static void printArray(int[][] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
