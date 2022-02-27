package Feb17;

public class lower
{
    int N = 4;
 
    // Function to check matrix is
    // in lower triangular form or not.
    boolean isLowerTriangularMatrix(int mat[][])
    {
        for (int i = 0; i < N; i++)
            for (int j = i + 1; j < N; j++)
                if (mat[i][j] != 0)
                    return false;
 
        return true;
    }
 
    // Driver function.
    public static void main(String args[])
    {
        lower ob = new lower();
        int mat[][] = { { 1, 0, 0, 0 },
                        { 1, 4, 0, 0 },
                        { 4, 6, 2, 0 },
                        { 0, 4, 7, 6 } };
                         
        // Function call
        if (ob.isLowerTriangularMatrix(mat))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
