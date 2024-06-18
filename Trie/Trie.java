import java.time.temporal.ChronoUnit;

public class Trie {
    private TrieNode root;
    public Trie(){//---->O(1) time and space
        root=new TrieNode();//---->O(1)
        System.out.println("The Trie has been created");//---->O(1)
    }

    //Insertion on the word
    public void insert(String word){//--->O(M) time and space
        TrieNode current = root;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            TrieNode node= current.children.get(ch);
            if(node==null){
                node=new TrieNode();
                current.children.put(ch,node);
            }
            current= node;
        }
        current.endofstring=true;
        System.out.println("the "+word+ " successfully inserted!");
    }

    //search for a word in trie
    public boolean search(String word){//---> O(M) time and O(1) space
        TrieNode currentNode = root;
        for (int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            TrieNode node = currentNode.children.get(ch);
            if(node==null){
                System.out.println("word "+word+" doesn't exist in the Trie");
                return false;
            }
            currentNode = node;
        }
        if(currentNode.endofstring==true){
            System.out.println("word "+ word+" exists in Trie");
            return true;
        }else {
            System.out.println("word"+ word+" does not exist in Trie but it is a prefix of another string ");
            return currentNode.endofstring;
        }

    }

    // Delete a String from trie(HELPER METHOD)
    private boolean delete(TrieNode parentnode,String word,int index){

        char ch= word.charAt(index);
        TrieNode currntnode=parentnode.children.get(ch);
        boolean canThisBeDeleted;
        //case 1: prefix is same as other word
        if(currntnode.children.size()>1){
            delete(currntnode,word,index+1);
            return false;
        }
        //case 2: we are at the last word,but it is prefix of another word
        if(index==word.length()-1){
            if(currntnode.children.size()>=1){
                currntnode.endofstring=false;
                return false;
            }else{
                parentnode.children.remove(ch);
                return true;
            }
        }
        //case 3: some other word is a prefix of this word
        if(currntnode.endofstring==true){
            delete(currntnode,word,index+1);
            return false;
        }
        canThisBeDeleted=delete(currntnode,word,index+1);
        if(canThisBeDeleted==true){
            parentnode.children.remove(ch);
            return true;
        }else{
            return false;
        }
    }

    public void delete(String word){
        if(search(word)==true){
            delete(root,word,0);
        }
    }


}
