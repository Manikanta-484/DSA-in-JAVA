public class Main {
    public static void main(String[] args) {
       TwoDArray tda =new TwoDArray(3,3);
       tda.insert(0,0,10);
       tda.insert(2,2,90);
//       tda.accessing(0,0);
//       tda.traverse();
       tda.searchValue(90);
    }
}