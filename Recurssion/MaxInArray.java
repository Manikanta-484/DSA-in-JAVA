import static java.lang.Math.max;
public class Main {
    public static void main(String[] args) {
        int arr[]={1,10,3,5};
        int max=FindMax(arr,3);
        System.out.println(max);
    }

    public static int FindMax(int[] arr,int index){
        if(index== 1){
            return arr[0];
        }
        return max(arr[index-1],FindMax(arr,index-1));
    }
}