import java.lang.reflect.Array;
import java.util.Arrays;


public class TwoDArray {
    int arr[][]=null;

    public TwoDArray(int row,int col) {
        this.arr = new int[row][col];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]=Integer.MIN_VALUE;
            }
        }
    }

    public void insert(int row ,int col,int value){
        try {
            if(arr[row][col]==Integer.MIN_VALUE){
                arr[row][col]=value;
                System.out.println(Arrays.deepToString(arr));
            }else {
                System.out.println("cell is already filled");
            }

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("invalid ");
        }
    }
}
