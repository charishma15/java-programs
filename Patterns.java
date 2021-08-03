import java.util.Scanner;

public class Patterns
{
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the number of lines needed to print the "*" pattern ");

        int lines = scanner.nextInt();
      
        
        for (int i=1; i<=lines; i++) 
        { 
             
            for (int k=lines; k>=i; k--)
            {
                System.out.print("*");
            }
        
            for (int j=1; j<i; j++)
            {
                System.out.print(" ");
            }
            
            System.out.println();
        }
        scanner.close();
    }
}
