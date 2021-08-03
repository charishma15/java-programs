class Palindrome
{
	public static void main(String arg[])	
	{
	    int num,temp,sum,rem;
             	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter any number ");
                   num=sc.nextInt();
	    temp=num;
	    for(sum=0;num>0;num/=10)
	    {
	    rem=num%10;
	    sum=(sum*10)+rem;
	    }
	   if(sum==temp)
		System.out.println(t+" is a palindrome number ");
                  else
		System.out.println(t+" is not a palindrome number ");
                  
	}
}