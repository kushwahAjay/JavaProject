package pttern;

public class Pattern4 {
	public static void main(String[] args) {
		int n=5;
		int sp=4;
		int st=1;
		for(int i=1;i<=n;i++)
		{
			int p=5;
			for(int k=1;k<=sp;k++)
			{
				System.out.print(p);
				p--;
			}
			for(int j=1;j<=st;j++)
			{
				System.out.print(j);
			}
			System.out.println();
			st++;
			sp--;
		}

		}

	}
