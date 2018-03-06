package pttern;

public class HollowTriange {

	public static void main(String[] args)
	{
		int n = 4, sp = n - 1, st = 1;
		for (int i = 1; i <= n; i++) 
		{
			for (int k = 1; k <= sp; k++) 
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= st; j++) 
			{

				if (j == 1 || j == st || i == n)
				{
					System.out.print("*");
				} else 
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
			sp--;
			st += 2;
		}
	}

}
