package pttern;

public class pattern3 {

	public static void main(String[] args) {
	int n=5;
	int sp=4;
	int st=1;
	for(int i=1;i<=n;i++)
	{
		int p=1;
		for(int k=1;k<=sp;k++)
		{
			System.out.print(p);
			p++;
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
/*12341
  12312
  12123
  11234
  12345*/
