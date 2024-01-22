import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

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

        //traversal of Arraylist Elements
          //Approach 1
          for(int i=0;i<arrayList.size();i++){//------->time complexity o(N);
              int num=arrayList.get(i);
              System.out.println(num);//-------space complexity o(1);
          }
          //Approach 2
          for(int num: arrayList){
              System.out.println(num);
          }
          //Approach 3
        Iterator<Integer> iterator= arrayList.iterator();
            while(iterator.hasNext()){
                int num = iterator.next();
                System.out.println(num);
            }

            //Searching an Element in ArrayList
        //Approach 1
        for(int num : arrayList){//--------> time complexity o(N);
            if(num==30){
                System.out.println("Element is found ");//---------> space complexity o(1);
                break;
            }
        }
        //Approach 2
        int index=arrayList.indexOf(30);
        System.out.println("Element is found at the index of "+ index);


    }
}