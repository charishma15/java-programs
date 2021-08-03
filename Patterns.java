import java.util.Scanner;

public class Patterns
{
    public static void main(String[] args)
    {
        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of lines needed to print the "*" pattern ");

        int lines = scanner.nextInt();
      
        
        for (int i=1; i<=lines; i++) 
        { 
            // Print star in decreasing order 
            for (int k=lines; k>=i; k--)
            {
                System.out.print("*");
            }
            // Print space in increasing order
            for (int j=1; j<i; j++)
            {
                System.out.print(" ");
            }
            
            System.out.println();
        }
        scanner.close();
    }
}