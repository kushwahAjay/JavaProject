package Arrays;

public class Pattern1 {

	public static void main(String[] args) {
		int n=7;
		int sp=3;
		int st=1;
		
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=sp;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=st;j++)
			{
				
				System.out.print(j);
			}
			System.out.println();
				if(i<=n/2)
				{
					st+=2;
					sp--;
				}
				else
				{
					st-=2;
					sp++;
				}
				
			}
			
				
	
			}
			
		}

	


