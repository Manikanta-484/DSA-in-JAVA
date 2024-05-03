public class Main {
    public static void main(String[] args) {
        Main recurssion =new Main();
//        var fib=recurssion.fibonacci(3);
        int N=3;
        for (int i = 0; i < N; i++) {
            System.out.print(recurssion.fibonacci(i) + " ");
        }
    }

    public  int  fibonacci(int N){
        if(N<=1){
            return N;
        }
        return fibonacci(N-1)+fibonacci(N-2);
    }
}