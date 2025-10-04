package Array;

public class print_array {
    public static void main(String[] args) {
        String[][] array = new String[][]{{"1","2"},
                                          {"a","b","c"}};
        //the first method
        for(int i=0;i<array.length;i++){
            String[] row = array[i];
            for(int j=0;j<row.length;j++){
                System.out.print(row[j]+" ");
            }
            System.out.println();
        }
        //the second method
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }
}
