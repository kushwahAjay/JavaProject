package Arrays;

import java.util.Arrays;

public class TwoDimensional {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3,4},{4,5,6}};
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr.length-1;j++)
			{
		System.out.print(arr[i][j] + " ");
		
			}
			System.out.println();
		}
		
		System.out.println("********");
		
		System.out.println(Arrays.deepToString(arr));
		
		for(int a[]:arr)
		{
			for(int i:a)
			{
				System.out.print(i +" ");
			}
			System.out.println();
		}
		System.out.println(Arrays.deepToString(arr));
		
		System.out.println("******");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}


}
}