package pttern;

public class pattern5 {

	public static void main(String[] args) {
		int n=4;
		
		for(int i=0;i<n;i++)
		{
			int k=i+1;
			for(int j=0;j<=i;j++)
			{
				
					System.out.print(k);
					k=k+n-j;
				
				
			}
			System.out.println();
		}

	}

}
/*1
  26
  3710
  481113
*/