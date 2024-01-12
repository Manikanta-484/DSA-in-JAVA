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
//                System.out.println(Arrays.deepToString(arr));
            }else {
                System.out.println("cell is already filled");
            }

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("invalid ");
        }
    }

    public void accessing(int row,int col){
        System.out.println("\n Accessign Row#: "+row+" , col#: "+col);
        try {
            System.out.println(" CELL VALUE: "+ arr[row][col]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("invalid ");
        }
    }

    public void traverse(){
        System.out.println(Arrays.deepToString(arr));
//        for(int row=0;row< arr.length;row++){
//            for (int col=0;col<arr.length;col++){
//                System.out.print(arr[row][col]+ " ");
//            }

        }

    public void searchValue(int value){
        for(int row =0;row< arr.length;row++){
            for(int col=0;col<arr.length;col++){
                if(arr[row][col]==value){
                    System.out.println("value is found at row: "+ row+ ", col: "+ col);
                }
            }
        }
    }
    }

