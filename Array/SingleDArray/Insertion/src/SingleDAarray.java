public class SingleDAarray {
    int arr[]=null;
    public SingleDAarray(int sizeofArray) {
           arr =new int[sizeofArray];
           for (int i=0;i<arr.length;i++){
               arr[i]=Integer.MIN_VALUE;
           }
    }

    public void insert(int location , int valuetobeinserted){
        try {
            if(arr[location]==Integer.MIN_VALUE){
                arr[location]=valuetobeinserted;
                System.out.println("successfully inserted");
            }else {
                System.out.println("cell is occupied");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("invalid index to access!");
        }
    }
}
