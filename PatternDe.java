import java.util.*;
public class PatternDe
{
     public static void main(String []args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int lines=sc.nextInt(); 
        int i=lines;
        do
        {
           int j=0;
           do
           {
               System.out.print("*");
           }
           while(++j<i);
           System.out.println();
        } 
        while(--i>0) ;  
    }
}