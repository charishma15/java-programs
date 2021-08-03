class FibonacciSeries {
  public static void main(String[] args) {

int a=0;
    int b=0;
    int temp=1;
    do {    
        a=b;
        b=temp;
        temp=a+b;
        System.out.println(temp);
    }while(temp<100);
  }
}