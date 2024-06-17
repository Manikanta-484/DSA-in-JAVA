import java.lang.invoke.VarHandle;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class BinarySearchTree {
    BinaryNode root;

    public BinarySearchTree() {//TOTAL O(1)  time and space
        this.root = null;//-----> O(1)
    }

   public BinaryNode insert(BinaryNode currentnode,int val) {//-----> O(Log N) time and space
       if (currentnode == null) {//-----> O(1)
           BinaryNode newnode = new BinaryNode();//-----> O(1)
           newnode.value = val;//-----> O(1)
         //  System.out.println("the value is successfully inserted");//-----> O(1)
           return newnode;//-----> O(1)
       } else if (val <= currentnode.value) {//-----> O(1)
           currentnode.left = insert(currentnode.left, val);//-----> O(N/2)
           return currentnode;//-----> O(1)
       } else {
           currentnode.right = insert(currentnode.right, val);//-----> O(N/2)
           return currentnode;//-----> O(1)
       }
   }

   void insert(int val){
      root=insert(root,val);//-----> O(N)
   }

  public void preorder(BinaryNode node){
        if(node==null){
            return;
        }else{
            System.out.print(node.value+ " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

  public void inorder(BinaryNode node){
        if(node==null){
            return;
        }else{
            inorder(node.left);
            System.out.print(node.value+" ");
            inorder(node.right);
        }
  }

  public void postorder(BinaryNode node){
        if(node==null){
            return;
        }else {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.value+ " ");
        }
  }

  public void levelorder(){//TOTAL: O(N) time and space
      Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
      queue.add(root);

      while (!queue.isEmpty()){
          BinaryNode presentnode= queue.remove();
          System.out.print(presentnode.value+" ");
          if(presentnode.left!=null){
              queue.add(presentnode.left);
          }
      if(presentnode.right!=null){
          queue.add(presentnode.right);
         }

      }
  }

  //search
    public BinaryNode search(BinaryNode node, int val){//TOTAL: O(Log N ) time and space
        if(node==null){
            System.out.println("value "+ val+" not found in BST");
            return null;
        } else if (node.value==val) {
            System.out.println("value"+ val + " found in BST");
            return node;
        }else if(val<node.value){
            return search(node.left,val);
        }else {
            return search(node.right,val);
        }
    }
    public static BinaryNode minimumNode(BinaryNode root){
        if(root.left==null){
            return root;
        }else {
            return minimumNode(root.left);
        }
    }

    //Delete node
    public BinaryNode deletenode(BinaryNode root,int val){//TOTAL: O(Log N) time and space
        if(root==null){
            System.out.println("value not found !!");//----->O(1)
            return null;//----->O(1)
        }
        if(val<root.value){
            root.left=deletenode(root.left,val);//----->O(N/2)
        } else if (val>root.value) {
            root.right=deletenode(root.right,val);//----->O(N/2)
        }else {
            //delete for node with two children  (Find the inorder successor ie: minimum node in the right subtree)
            if(root.left!=null && root.right!=null){//----->O(1)
                BinaryNode temp = root;//----->O(1)
                BinaryNode minimumright= minimumNode(root.right);//----->O(Log N)
                root.value=minimumright.value;//----->O(1)
                root.right=deletenode(root.right,minimumright.value);//----->O(N/2)
            }else if(root.left!= null) {
                //for only one child
                root=root.left;//----->O(1)
            } else if (root.right!=null) {
                root=root.right;//----->O(1)
            }else{
                //for leaf node condition
                root= null;//----->O(1)
            }
        }
            return root;//----->O(1)
    }

    public void deleteEntireTree(){//Total: O(1) time and spaces
        root=null;
        System.out.println("BST deleted successfully !!");
    }


}
