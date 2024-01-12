import java.lang.reflect.Array;

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

    public void traverseArray(){
        try {
            for(int num : arr){
                System.out.print(num+" ");
            }
        }catch (Exception e){
            System.out.println("Array no longer exists");
        }
    }

    public void searchInArray(int valueToSearch){
        for(int i=0;i<arr.length;i++){
            if(arr[i] ==valueToSearch){
                System.out.println("value is found at index "+ i);
            }
        }
    }

    public void deletevalue(int valuetodeleteindex){
        try{
            arr[valuetodeleteindex]=Integer.MIN_VALUE;
            System.out.println("the value has been deleted");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
