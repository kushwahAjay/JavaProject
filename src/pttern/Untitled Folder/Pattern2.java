package pttern;

public class Pattern2 {

	public static void main(String[] args) {
		int n=5;
		int sp=2;
		int st=1;
		int st2=1;
		//int p;
		for(int i=1;i<=n;i++)
		{
			
			for(int k=1;k<=sp;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=st;j++)
			{
				 st2=st-1;
				System.out.print(j);
				
			}
			for(int p=st2;p>=1;p--)
			{
				System.out.print(p);
			}
			System.out.println();
				if(i<=n/2)
				{
					st+=1;
					sp--;
				}
				else
				{
					st-=1;
					sp++;
				}
				
			}
			
				
	
			}

	}



















































