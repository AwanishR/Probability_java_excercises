import java.util.Scanner;
public class ProbabilityDistribution {
public static void main (String args [])
{
	float sum,sumall;
	float var [][] = new float [3][3];
	Scanner inputs = new Scanner (System.in);
	System.out.println("Enter values");
	sumall =0.0F;
	for (int i = 0;i<3;i++)
	{
		for (int j =0;j<3;j++)
		{
			var[i][j]=inputs.nextFloat();
			sumall +=var[i][j];
		}
		//System.out.println("sum is "+sum);
	}
	System.out.print("P(X,Y)");
	for (int j =0;j<3;j++)
	{
		System.out.print("\t"+j );
	}
	System.out.print("\th(y=yi)");
	for (int i = 0;i<3;i++)
	{
		sum = 0.0F;
		System.out.print("\n"+i+"\t");
		for (int j =0;j<3;j++)
		{
			System.out.print(var[i][j] + "\t");
			sum +=var[i][j];
		}
		System.out.print(sum);
	}
	System.out.print("\ng(X=xi)");
	for (int j = 0;j<3;j++)
	{
		sum = 0.0F;
		//System.out.print("\n"+j+"\t");
		for (int i =0;i<3;i++)
		{
			//System.out.print(var[i][j] + "\t");
			sum +=var[i][j];
		}
		System.out.print("\t"+sum);
	}
	System.out.println("\t"+sumall);
}
}
