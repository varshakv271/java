import java.util.Scanner;
class MatrixAddition
{
	public static void main(String args[])
	{
		int i,j,m,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("************Addition of matrix***********");
		System.out.print("Enter the number of rows and columns of the matrix:-");
		m=sc.nextInt();
		n=sc.nextInt();
		int first[][]=new int[m][n];
		int second[][]=new int[m][n];
		int sum[][]=new int[m][n];
		System.out.println("Enter the first matrix: ");
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				first[i][j]=sc.nextInt();
		System.out.println("Enter the second matrix: ");
                for(i=0;i<m;i++)
                        for(j=0;j<n;j++)
                                second[i][j]=sc.nextInt();
		//System.out.println("Enter the first matrix: ");
                for(i=0;i<m;i++)
                        for(j=0;j<n;j++)
                                sum[i][j]=first[i][j]+second[i][j];
		System.out.println("The sum of matrix is: ");
                for(i=0;i<m;i++)
                        for(j=0;j<n;j++)
                                System.out.print(sum[i][j]+"\t");
		System.out.println();



				
	}
}
