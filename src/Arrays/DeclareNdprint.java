package Arrays;

import java.util.Arrays;

public class DeclareNdprint {

	public static void main(String[] args) {
		int []arr= {5,6,9,8,2,10};
		System.out.println(Arrays.toString(arr));
   int val=10;
   for(int i=0; i<=arr.length-1;i++)
   {  arr[i]=val;
   val++;
	   System.out.println(arr[i]);
   }
   for(int i=0; i<=arr.length-1;i++)
   {  arr[i]=val;
   val++;
	   System.out.println(arr[i]);
   }
   for(int i=arr.length-1;i>=0;i--)
   {
	   System.out.println(arr[i]);
   }
   System.out.println(Arrays.toString(arr));
   Arrays.sort(arr);
   
	}

}
 