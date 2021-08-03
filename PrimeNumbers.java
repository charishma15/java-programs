public class PrimeNumbers{
    public static void main(String[]args)
    {
        int num=13;
        int last=100;
        do
        {
            if(IsPrime(num))
            {
                System.out.println(num + " is a prime number");

            }
            else
            {
                System.out.println(num+ " is NOT a prime number");

            }
            num++;
        }
        while(num <==last);
    }
}