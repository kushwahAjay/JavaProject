package pttern;

public class pattern_num {
	public static void main(String[] args) {
	 
		int n=5,diff=1;int sp=n-1;
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=sp;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(n);
				n++;
			}
			sp--;
			diff++;
			n=n-diff;
			System.out.println();
			
		}
		
	}

}
