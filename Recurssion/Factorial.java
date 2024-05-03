public class Main {
    public static void main(String[] args) {
        Main recurssion = new Main();
        var fac=recurssion.factorial(3);
        System.out.println(fac);
    }
    public  int factorial(int N){
        if(N<1){
	    return -1;
	}
        if(N==0 || N==1){
            return 1;
        }
        return N*factorial(N-1);
    }
}