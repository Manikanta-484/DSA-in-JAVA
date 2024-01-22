import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Creating ArrayList
        ArrayList<Integer> arrayList=new ArrayList<>(Arrays.asList(10,20,30,40));//----->time complexity 0(1);
        System.out.println(arrayList);//------> space complexity 0(N);

        //insertion
        arrayList.add(50);
        System.out.println(arrayList);
        arrayList.add(4,60);//---------> time complexity is o(n);
        System.out.println(arrayList);//--------> space complexity o(1);

        //Accessing Elements
        System.out.println(arrayList.get(1));//---> time complexity o(1),space complexity 0(1)
        

    }
}