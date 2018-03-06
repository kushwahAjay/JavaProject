package pttern;

public class pattern7 {

	public static void main(String[] args) {
		int n=5;
		int sp=4;
		int st=1;
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=sp;k++)
			{
				System.out.print(" ");
			}
			int val=i;
			for(int j=1;j<=st;j++)
				
			{
				System.out.print(val);
			if(val>1)
			{
				val--;
			}
			else
			{
				val++;
			}
			}
			st+=2;
			sp--;
			System.out.println();
		}

	}

}
