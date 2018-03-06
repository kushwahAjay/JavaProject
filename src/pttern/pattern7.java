package pttern;

public class pattern7 {

	public static void main(String[] args) {
		int n=5;
		int sp=4;
		int st=1;
		int st2=1;
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=sp;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=st;j>=1;j--)
				
			{
				
				System.out.print(j+" ");

		     }  
		
			for(int p=2;p<=st2;p++)
			{
				System.out.print(p+" ");
			}
			
			st++;
			st2++;
			sp--;
			System.out.println();
		}

	} /*1 
	   2 1 2 
	   3 2 1 2 3 
	  4 3 2 1 2 3 4 
	 5 4 3 2 1 2 3 4 5*/ 

}


