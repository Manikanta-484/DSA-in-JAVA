
import java.time.format.SignStyle;
import java.util.LinkedList;
import java.util.Queue;


public class BinaryTreeLinedList {
    BinaryNode root;

   public BinaryTreeLinedList(){
        this.root=null;//--------- o(1) time and space complexity
    }
    //pre-order Traversal
    void preorder(BinaryNode node){//TOTAL: O(N) time and space
       if(node==null){//------>O(1)
           return;//------>O(1)
       }
       System.out.println(node.value+ " ");//------>O(1)
       preorder(node.left);//------>O(N/2)
       preorder(node.right);//------>O(N/2)
    }

    //In-order Traversal
    void Inorder(BinaryNode node){//TOTAL: O(N) TIME AND SPACE
       if(node==null){//------>O(1)
           return;//------>O(1)
       }
       Inorder(node.left);//------>O(N/2)
       System.out.print(node.value);//------>O(1)
       Inorder(node.right);//------>O(N/2)
    }

    //Post-order Traversal
    void Postorder(BinaryNode node){//TOTAL: O(N) TIME AND SPACE
       if(node==null){//------>O(1)
           return;//------>O(1)
       }
       Postorder(node.left);//------>O(N/2)
       Postorder(node.right);//------>O(N/2)
       System.out.print(node.value);//------>O(1)
    }

    //Level-order Traversal(queue)//always performs well so we use it for searching
    void Levelorder(){//TOTAL: O(N)
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();//------>O(1)
        queue.add(root);//------>O(1)
        while (!queue.isEmpty()){//------>O(N)
            BinaryNode presentnode = queue.remove();//------>O(1)
            System.out.print(presentnode.value+" ");//------>O(1)
            if(presentnode.left!=null){//------>O(1)
                queue.add(presentnode.left);//------>O(1)
            }
            if(presentnode.right!=null){//------>O(1)
                queue.add(presentnode.right);//------>O(1)
            }
        }
    }

    void Search(String val) {//TOTAL: O(N) time and space
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentnode = queue.remove();
            if (presentnode.value == val) {
                System.out.println("Value fount " + val + " in Treee");
                return;
            } else {
                if (presentnode.left != null) {
                    queue.add(presentnode.left);
                }
                if (presentnode.right != null) {
                    queue.add(presentnode.right.right);
                }
            }
        }
        System.out.println("Value not found");
    }

    void insert(String val){
       BinaryNode newnode = new BinaryNode();
       newnode.value= val;
       if(root==null){
           root=newnode;
           System.out.println("inserted new node at root");
           return;
       }
       Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
       queue.add(root);
       while (!queue.isEmpty()){
           BinaryNode presentnode = queue.remove();
           if(presentnode.left==null){
               presentnode.left=newnode;
               System.out.println("Successfully Inserted");
               break;
           }else  if(presentnode.right==null){
               presentnode.right=newnode;
               System.out.println("Successfully Inserted");
               break;
           }else {
               queue.add(presentnode.left);
               queue.add(presentnode.right);
           }
        }
    }

    //get Deepest node
    public BinaryNode getDeepestNode(){
       Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
       queue.add(root);
       BinaryNode presentnode= null;
       while (!queue.isEmpty()){
           presentnode=queue.remove();
           if(presentnode.left!=null){
               queue.add(presentnode.left);
           }
       if(presentnode.right!=null){
           queue.add(presentnode.right);
          }
       }
       return presentnode;
    }

    // Delete the deepestnode
    void deleteDepestNode() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode presentnode = null,previousnode = null;
        while (!queue.isEmpty()) {
            presentnode=queue.remove();
            previousnode=presentnode;

            if (presentnode.left == null) {
                previousnode.right = null;
                return;
            }else if (presentnode.right == null) {
                previousnode.left = null;
                return;
            }
            queue.add(presentnode.left);
            queue.add(presentnode.right);

        }
    }

    //Delete the given node
    void deleteNode(String val){//TOTAL: O(N) time and space
       Queue<BinaryNode> queue = new LinkedList<BinaryNode>();//------>O(1)
       queue.add(root);//------>O(1)
       while (!queue.isEmpty()){//------>O(N)
           BinaryNode presentnode= queue.remove();//------>O(1)
           if(presentnode.value==val){
               presentnode.value= getDeepestNode().value;//------>O(N)
               deleteDepestNode();//------>O(N)
               System.out.println("the node is dleted");//------>O(1)
               return;
           }else{
               if(presentnode.left!=null){
                   queue.add(presentnode.left);//------>O(1)
               }
               if(presentnode.right!=null){
                   queue.add(presentnode.right);//------>O(1)
               }
           }
       }
    }

    //Delete an entire Binary tree
    void deleteEntireTree(){
       root=null;//------>O(1)
        System.out.println("Binary Tree been successfully deleted!!");//------>O(1)
    }


}
