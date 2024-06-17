import javax.swing.plaf.PanelUI;
import java.util.LinkedList;
import java.util.Queue;

public class AVLTree {
    BinaryNode root;
    AVLTree(){
        root=null;
    }

    public void preorder(BinaryNode node){
        if(node==null){
            return;
        }
        System.out.println(node.value+" ");
        preorder(node.left);
        preorder(node.right);
    }
    public void inorder(BinaryNode node){
        if(node==null){
            return;
        }
        inorder(node.left);
        System.out.println(node.value+" ");
        inorder(node.right);
    }
    public void postorder(BinaryNode node){
        if(node==null){
            return;
        }
        System.out.println(node.value+" ");
        postorder(node.left);
        postorder(node.right);
    }

    public void levelorder(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);

        while (!queue.isEmpty()){
            BinaryNode presentnode = queue.remove();
            System.out.print(presentnode.value+" ");
            if(presentnode.left!=null){
                queue.add(presentnode.left);
            }
            if(presentnode.right!=null){
                queue.add(presentnode.right);
            }
        }
    }

    public BinaryNode search(BinaryNode node, int val){
        if(node==null){
            return null;
        }else if(node.value==val){
            System.out.println("value found ");
            return node;
        }else if(val<node.value){
            return search(node.left,val);
        }else if(val>node.value){
            return search(node.right,val);
        }
        return node;
    }
    /**
     * Rotations for AVL Tree Balancing:
     *
     * 1. Left-Left (LL) Rotation:
     *    - Condition: Insert into the left subtree of the left child.
     *    - Action: Perform a right rotation.
     *
     * 2. Left-Right (LR) Rotation:
     *    - Condition: Insert into the right subtree of the left child.
     *    - Action: Perform a left rotation on the left child, then a right rotation on the node.
     *
     * 3. Right-Right (RR) Rotation:
     *    - Condition: Insert into the right subtree of the right child.
     *    - Action: Perform a left rotation.
     *
     * 4. Right-Left (RL) Rotation:
     *    - Condition: Insert into the left subtree of the right child.
     *    - Action: Perform a right rotation on the right child, then a left rotation on the node.
     */

    //get height
    public int getHeight(BinaryNode node){
        if(node==null){
            return 0;
        }
        return node.height;
    }

    // rotate right
    private BinaryNode rotateRight(BinaryNode unbalancedNode){//TOTAL: O(1) time and space
        BinaryNode newnode= unbalancedNode.left;
        unbalancedNode.left=unbalancedNode.left.right;
        newnode.right=unbalancedNode;
        unbalancedNode.height=1+Math.max(getHeight(unbalancedNode.left),getHeight(unbalancedNode.right));
        newnode.height=1+Math.max(getHeight(newnode.left),getHeight(newnode.right));
        return newnode;
    }
    //rotate left
    private BinaryNode rotateLeft(BinaryNode unbalancedNode){//TOTAL: O(1) time and space
        BinaryNode newnode = unbalancedNode.right;
        unbalancedNode.right=unbalancedNode.right.left;
        newnode.left=unbalancedNode;
        unbalancedNode.height=1+Math.max(getHeight(unbalancedNode.left),getHeight(unbalancedNode.right));
        newnode.height=1+Math.max(getHeight(newnode.left),getHeight(newnode.right));
        return newnode;
    }
    
    //getBalance
    public int getBalance(BinaryNode node){
        if(node==null){
            return 0;
        }
        return getHeight(node.left)-getHeight(node.right);
    }
    
    //InsertNode method 
    private BinaryNode insert(BinaryNode node,int val){//-----> O(Log N) time and space
        if(node==null){//-----> O(1)
            BinaryNode newnode = new BinaryNode();
            newnode.value=val;
            newnode.height=1;
            return newnode;
        } else if (val<node.value) {
            node.left=insert(node.left,val);//-----> O(Log N)
            
        }else if(val>node.value){
            node.right=insert(node.right,val);//-----> O(Log N)
        }
        node.height=1+ Math.max(getHeight(node.left),getHeight(node.right));//-----> O(1)
        int balance = getBalance(node);//-----> O(1)

        //left left condition
        if(balance>1 && val<node.left.value){
            return rotateRight(node);//-----> O(1)
        }

        //Left-right condition
        if(balance>1 && val>node.left.right.value){
            node.left=rotateLeft(node.left);
            return rotateRight(node);//-----> O(1)
        }

        //right right condition
        if(balance<-1 && val>node.right.value){//-----> O(1)
            return rotateLeft(node);//-----> O(1)
        }

        //right left condition
        if(balance<-1 && val<node.right.left.value){//-----> O(1)
            node.right=rotateRight(node.right);//-----> O(1)
            return rotateLeft(node);//-----> O(1)
        }
            return node;//-----> O(1)
    }


    public void insert(int value){
        root = insert(root,value);
    }

    // helper minimum node for condition with two children

    public static BinaryNode mininumNode(BinaryNode root){
        if(root==null){
            return root;
        }
        return mininumNode(root.left);
    }

    //Delete Node
    public BinaryNode deleteNode(BinaryNode node , int val){//TOTAL: O(Log N) time and space
        if(node==null){
            System.out.println("Value not found in AVL ");
            return node;
        } else if (val<node.value) {
            node.left= deleteNode(node.left,val);
        } else if (val>node.value) {
            node.right= deleteNode(node.right,val);
        }else {
            //if node has two children
            if(node.left!=null && node.right!=null){
                BinaryNode temp = node;
                BinaryNode minimum = mininumNode(temp.right);
                node.value=minimum.value;
                node.right=deleteNode(node.right,minimum.value);
            } /*for node with one childelse */
            else if (node.left!=null) {
                node= node.left;
            } else if (node.right!=null){
                node=node.right;
            }//for leaf node
            else{
                node=null;
            }
        }
        int balance = getBalance(node);
        //left left condition
        if(balance>1 && getBalance(node.left)>=0 ){
            return rotateRight(node);
        }
        //left right
        if(balance>1 && getBalance(node.left)<0 ){
            node.left=rotateLeft(node.left);
            return rotateRight(node);
        }
        //right right
        if(balance<-1 && getBalance(node.right)<=0){
            return rotateLeft(node);
        }
        //right left condition
        if(balance<-1 && getBalance(node.right)>0 ){
            node.right= rotateRight(node.right);
            return rotateLeft(node);
        }
        return node;

    }

    public void delete(int val){
        root=deleteNode(root,val);
    }

    public void deleteAVL(){
        root=null;
        System.out.println("AVL is successfully deleted!!");
    }



}
