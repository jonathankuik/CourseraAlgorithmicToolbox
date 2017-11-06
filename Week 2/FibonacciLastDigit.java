import java.util.*;

public class FibonacciLastDigit {
    private static int getFibonacciLastDigitNaive(int n) {
        if (n <= 1)
            return n;

        int previous = 0;
        int current  = 1;

        for (int i = 0; i < n - 1; ++i) {
            int tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
        }

        return current % 10;
    }


    private static int last_fib_fast(int n) {
        if (n <= 1){
            return n;
        }

        int previous = 0;
        int current  = 1;

        for (int i = 0; i < n - 1; ++i) {
            int tmp_previous = previous % 10;
            previous = current % 10;
            current = (tmp_previous + current) % 10;
        }

        return current;
        
    }
    
    public static void main(String[] args) {
      /*
        Random rand = new Random();
        int fib_last_slow;
        int fib_last_fast;
        int n;


        while(true){
          n = rand.nextInt(30);
          System.out.println(n);
          fib_last_slow = getFibonacciLastDigitNaive(n);
          fib_last_fast = last_fib_fast(n);

          if (fib_last_slow == fib_last_fast){
            System.out.println("Ok");
          } else {
            System.out.println("Slow algorithm = "+ fib_last_slow + " and fast = " + fib_last_fast);
            return;
          }

    }   
    */


        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(last_fib_fast(n));
        
    }
}

