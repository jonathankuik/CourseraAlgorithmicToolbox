import java.util.*;

public class GCD {
  private static int gcd_naive(int a, int b) {
    int current_gcd = 1;
    for(int d = 2; d <= a && d <= b; ++d) {
      if (a % d == 0 && b % d == 0) {
        if (d > current_gcd) {
          current_gcd = d;
        }
      }
    }

    return current_gcd;
  }

  private static int gcd_euclidean(int a, int b) {

    if (b == 0){
      return a;
    }else{
      return gcd_euclidean(b, a%b);
    }
  }

  public static void main(String args[]) {
    /*

    Random rand = new Random();
    int gcd_naive;
    int gcd_euclidean;
    int a;
    int b;


    while(true){
      a = rand.nextInt(1000) + 1;
      b = rand.nextInt(1000) + 1;
      System.out.println("a=" + a + " b=" + b);
      gcd_naive = gcd_naive(a, b);
      gcd_euclidean = gcd_euclidean(a, b);

      if (gcd_naive == gcd_euclidean){
        System.out.println("Ok");
      } else {
        System.out.println("Slow algorithm = "+ gcd_naive + " and fast = " + gcd_euclidean);
        return;
      }

    }
    */
    
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
  
    //System.out.println(gcd_naive(a, b));
    System.out.println(gcd_euclidean(a, b));

  }
}
