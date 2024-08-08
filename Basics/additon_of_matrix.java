import java.util.Scanner;

public class additon_of_matrix {
    public static void main(String[] args) {

        int j;
        int c[][] = new int[4][4];
        int b[][] = new int[4][4];
        int a[][] = new int[4][4];
        Scanner T = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) 
        {
            for (j = 1; j <= 3; j++) 
            {
        System.out.println("enter your first matrix element:"+ i+j);

                a[i][j] = T.nextInt();
            }
        }
           Scanner Y = new Scanner(System.in);
            for (int i = 1; i <= 3; i++)
             {

                for (j = 1; j <= 3; j++)
                {
            System.out.println("enter your second matrix element:"+ i+j);

                    b[i][j] = Y.nextInt();
                }
             }
        for (int i = 1; i <= 3; i++) 
        {
            for (j = 1; j <= 3; j++)
            {
                c[i][j] = a[i][j]+b[i][j];
            }
        }
       System.out.println("addition of matrix is shown below:");

        for (int i = 1; i <= 3; i++) 
        {   {
            for (j = 1; j <= 3; j++) 
                System.out.print("  " + c[i][j]);
            }
            System.out.println("\t");
        }
    }
}