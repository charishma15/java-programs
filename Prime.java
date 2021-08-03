public class Prime {

  public static void main(String[] args) {

    int n = 29;
    boolean flag = false;
    for (int i = 2; i <= n / 2; ++i) {
   
      if (n % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}
