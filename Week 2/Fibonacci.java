import java.util.Scanner;
import java.util.Random;

public class Fibonacci {
  private static long calc_fib(int n) {
    if (n <= 1)
      return n;

    return calc_fib(n - 1) + calc_fib(n - 2);
  }

  private static long calc_fib_fast(int n) {
    long[] fibArray;

    fibArray = new long[n+1];

    if (n == 0){
      
      fibArray[0] = 0;
    } else {
      
      fibArray[0] = 0;
      fibArray[1] = 1;
    }

    for(int i = 2; i<=n; i++){
      fibArray[i] = fibArray[i-1] + fibArray[i-2];
    } 

    return fibArray[n];
  }


  public static void main(String args[]) {
    /*
    Random rand = new Random();
    long calc_fib_fast;
    long calc_fib_slow;
    int fib_index;


    while(true){
      fib_index = rand.nextInt(20);
      System.out.println(fib_index);
      calc_fib_slow = calc_fib(fib_index);
      calc_fib_fast = calc_fib_fast(fib_index);

      if (calc_fib_slow == calc_fib_fast){
        System.out.println("Ok");
      } else {
        System.out.println("Slow algorithm = "+ calc_fib_slow + " and fast = " + calc_fib_fast);
        return;
      }

    }
    */

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    System.out.println(calc_fib_fast(n));
    
  }
}
