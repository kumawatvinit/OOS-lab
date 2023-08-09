import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter two numbers m and n: ");
        int m = scan.nextInt();
        int n = scan.nextInt();

        int[][] arr = new int[m][n];

        System.out.println("Enter the elements of the array: ");

        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println("Enter two numbers p and q: ");
        int p = scan.nextInt();
        int q = scan.nextInt();

        if(n != p)
        {
            System.out.println("Multiplication not possible, n != p");
            scan.close();
            return;
        }

        int[][] arr2 = new int[p][q];

        System.out.println("Enter the elements of the array: ");

        for(int i=0; i<p; i++)
        {
            for(int j=0; j<q; j++)
            {
                arr2[i][j] = scan.nextInt();
            }
        }

        int[][] ans = new int[m][q];
        // ans will arr*arr2

        for(int i=0; i<m; i++)
        {
            for(int j=0; j<q; j++)
            {
                for(int k=0; k<n; k++)
                {
                    ans[i][j]+= arr[i][k]*arr2[k][j];
                }
            }
        }

        System.out.println("The resultant matrix is: ");

        for(int i=0; i<m; i++)
        {
            for(int j=0; j<q; j++)
            {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

        scan.close();
    }
}
