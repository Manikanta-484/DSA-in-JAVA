import java.util.HashMap;
import java.util.Map;

public class TrieNode {
      Map<Character,TrieNode> children;
      boolean endofstring;
      public TrieNode(){
          children=new HashMap<>();
          endofstring=false;
      }


}
