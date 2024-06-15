public class BinaryTree {
    String[] arr;
    int lastUsedIndex;

    public BinaryTree(int size){//TOTAL: O(1) time ,---->O(N) space
        arr= new String[size+1];//------>O(1)
        this.lastUsedIndex=0;//------>O(1)
        System.out.println("Binary Treen of size "+ size+" has been created " );//------>O(1)
    }

    //isfull
    boolean isFull(){//O(1) time
        if(arr.length-1==lastUsedIndex) return true;
        else return false;
    }


    //insert method
    void insert(String value){// TOTAL: O(1) time and space
        if(!isFull()){//----->O(1)
            arr[lastUsedIndex+1]=value;//----->O(1)
            lastUsedIndex++;//----->O(1)
            System.out.println("the value of "+value+ " has been inserted");//----->O(1)
        }else {
            System.out.println("Binary Tree is full");//----->O(1)
        }
    }

    //Pre-order Traversal
    public void preorder(int index){//TOTAL: O(N) time and space
        if(index>lastUsedIndex){
            return;//----->O(1)
        }else{
            System.out.print(arr[index]+" ");//----->O(1)
            preorder(index*2);//----->O(N/2)
            preorder(index*2+1);//----->O(N/2)
        }
    }

    //In-order Traversal
    public void inorder(int index){//----->O(N) time and space
        if(index>lastUsedIndex){
            return;
        }else {
            inorder(index*2);//----->O(N/2)
            System.out.print(arr[index]+" ");//----->O(1)
            inorder(index*2+1);//----->O(N/2)
        }
    }

    //Post-order Traversal
    public void postorder(int index){//----->O(N) time and space
        if(index>lastUsedIndex){
            return;//----->O(1)
        }else {
            postorder(index*2);//----->O(N/2)
            postorder(index*2+1);//----->O(N/2)
            System.out.print(arr[index]+" ");//----->O(1)
        }
    }

    //Level-order Traversal
    void levelOrder(){//TOTAL: time O(N) and space O(1)
        int index=0;
        for (String val: arr){
            if(index++ == 0){
                continue;
            }
            System.out.print(val+" ");
        }
    }

    public int search(String val){
        for(int i= 1;i<=lastUsedIndex;i++){
            if(arr[i]==val){
                System.out.println("Element "+val+ " fount" );
                return i;
            }
        }
        System.out.println("Element not found");
        return -1;
    }

    //find level of the element
    public int findLevel(String value) {
        return -1;
    }

    //delete an element
    public void delete(String val){//TOTAL: O(N) time and O(1) space
        int location = search(val);//----->O(N)
        if(location==-1){
            return;//----->O(1)
        }else {
            arr[location]=arr[lastUsedIndex];//----->O(1)
            lastUsedIndex--;//----->O(1)
            System.out.println("the element is deleted");//----->O(1)
        }
    }

    //delete the tree
    public void deleteEntireTree(){//TOTAL: //----->O(1) time and space 
        try {
            arr=null;//----->O(1)
        }catch (Exception e){
            System.out.println("Error in deleting tree "+ e);//----->O(1)
        }
    }
}
