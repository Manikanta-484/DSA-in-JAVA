public class BinaryHeap {
    int[] arr;
    int sizeoftree;
    public BinaryHeap(int size){//TOTAL: O(1) time and O(N) space
        arr=new int[size+1];//---->o(1)
        this.sizeoftree=0;//---->o(1)
        System.out.println("Binary heap has been created");//---->o(1)
    }

    public Boolean isEmpty(){
        if(sizeoftree == 0){
            return true;
        }
        return false;
    }
    public Integer peek(){//---->O(1) time and space
        if(isEmpty()){
            System.out.println("Binary heap is Empty");//---->O(1)
            return null;//---->O(1)
        }
        return arr[1];//---->O(1)
    }

    public int sizeofBH(){//---->O(1) time and space
        return sizeoftree;
    }

    public void levelorder(){//TOTAL: O(N) time and O(1) space
        for (int i = 1; i <= sizeoftree; i++) { // ---->O(N)
            System.out.print(arr[i] + " "); // ---->O(1)
        }
        System.out.println();
        }



    //Heapify for insert  (bottom to top)
    public void heapifyBottomToTop(int index,String heapType){//O(log N) time and space
        int parent=index/2;//---->O(1)
        if(index<=1){//---->O(1)
            return;
        }
        if(heapType=="Min"){//---->O(1)
            if(arr[index]<arr[parent]){//---->O(1)
                int temp=arr[index];
                arr[index]=arr[parent];
                arr[parent]=temp;
            }
        }else if(heapType=="Max"){//---->O(1)
            if(arr[index]>arr[parent]){//---->O(1)
                int temp=arr[index];
                arr[index]=arr[parent];
                arr[parent]=temp;
            }
        }
        heapifyBottomToTop(parent,heapType);//---->O(Log N)
    }

    public void insert(int value,String heaptype){//O(Log N) time and space
        arr[sizeoftree+1]=value;//---->O(1)
        sizeoftree++;//---->O(1)
        heapifyBottomToTop(sizeoftree,heaptype);//---->O(Log N)
        System.out.println(value+" successfully inserted!");//---->O(1)
    }

    //In Binary Heap we can only extract the root of the tree
    public void heapifyTopTOBottom(int index,String heaptype){//TOTAL: O(Log N) time and space
        int leftchild=index*2;
        int rightchild=index*2+1;
        int swapchild=0;
        if(sizeoftree<leftchild){
            return;
        }
        if(heaptype=="Max"){
            if(sizeoftree==leftchild){
                if(arr[index]<arr[leftchild]){
                    int temp=arr[index];
                    arr[index]=arr[leftchild];
                    arr[leftchild]=temp;
                }
                return;
            }else{
                if(arr[leftchild]>arr[rightchild]){
                    swapchild=leftchild;
                }else {
                    swapchild=rightchild;
                }
                if(arr[index]<arr[swapchild]){
                    int temp=arr[index];
                    arr[index]=arr[swapchild];
                    arr[swapchild]=temp;
                }
            }
        } else if (heaptype=="Min") {
            if(sizeoftree==leftchild){
                if(arr[index]>arr[leftchild]){
                    int temp=arr[index];
                    arr[index]=arr[leftchild];
                    arr[leftchild]=temp;
                }
                return;
            }else{
                if(arr[leftchild]<arr[rightchild]){
                    swapchild=leftchild;
                }else {
                    swapchild=rightchild;
                }
                if(arr[index]>arr[swapchild]){
                    int temp=arr[index];
                    arr[index]=arr[swapchild];
                    arr[swapchild]=temp;
                }
            }
        }
        heapifyTopTOBottom(swapchild,heaptype);
    }

    //extract head of heap
    public int extractHeadOfBH(String heapType){//TOTAL: O(Log N) time and space
        if(isEmpty()){
            return -1;
        }else {
            int extractedValue = arr[1];
            arr[1]=arr[sizeoftree];
            arr[sizeoftree]=0;//clear the last element
            sizeoftree--;
            heapifyTopTOBottom(1,heapType);
            return extractedValue;
        }
    }
    public void deleteEntireBH(){//TOTAL: O(1) time and space
        arr=null;
        System.out.println("Binary Heap is successfully Deleted!!");
    }


}
