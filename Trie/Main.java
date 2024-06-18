public class Main {
    public static void main(String[] args) {

        Trie newTrie = new Trie();
        newTrie.insert("API");
        newTrie.insert("APIS");
        newTrie.search("BADASS");
        newTrie.delete("APIS");
        newTrie.search("APIS");
        newTrie.search("API");

    }
}