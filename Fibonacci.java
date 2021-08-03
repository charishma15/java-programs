class Fibonacci {
  public static void main(String[] args) {

    int n = 1000, f1 = 0, f2 = 1;
        
    System.out.println("Fibonacci Series Upto n i.e; n= " + n + ": ");
    
    while (f1 <= n) {
      System.out.print(f1 + ", ");

      int new = f1 + f2;
      f1 = f2;
      f2 = new;

    }
  }
}