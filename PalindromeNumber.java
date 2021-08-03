
import java.util.*;
public class PalindromeNumber
{  
   public static void main(String[] args) 
   {  
    
       Scanner sc = new Scanner(System.in);  
       System.out.println("Give the number: ");  
       int num=sc.nextInt();
       int rem,sum=0;
       int temp=num;    
       while(num>0)
       {    
       rem=num%10;    
       sum=(sum*10)+rem;    
       num=num/10;    
       }    
        if(temp==sum)    
        System.out.println(" "+temp+" is a palindrome number ");    
        else    
        System.out.println(" "+temp+" is not a palindrome");    
  }  
} 