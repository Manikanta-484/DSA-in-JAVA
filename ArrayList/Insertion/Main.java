import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Creating ArrayList
        ArrayList<Integer> arrayList=new ArrayList<>(Arrays.asList(10,20,30,40));
        System.out.println(arrayList);

        //insertion
        arrayList.add(50);
        System.out.println(arrayList);
        arrayList.add(4,60);
        System.out.println(arrayList);
    }
}