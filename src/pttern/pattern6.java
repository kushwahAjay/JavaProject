package pttern;

public class pattern6 {

	public static void main(String[] args) {
		 int n=5; int sp=0; int st=5;
		 for(int i=1;i<=n;i++)
		 {
			 for(int k=1;k<=sp;k++)
			 {
				 System.out.print(" ");
			 }
			 for(int j=i; j<=n;j++)
			 {
				 System.out.print(j+" ");
			 }
			 sp++;
			 st--;
			 System.out.println();
		 }

	}

}
/*1 2 3 4 5 
   2 3 4 5 
    3 4 5 
     4 5 
       5 */
