package Arrays;

public class Fmax {

	public static void main(String[] args) {
		int arr[]= {9,3,1,11,18,5};
		int  max=arr[0];
		int Smax=arr[0];
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]>max)
			{

                Smax = max;
                max = arr[i];
			}
			  else if (arr[i] > Smax && arr[i] != max)
	                Smax = arr[i];
				
		}
		System.out.println(max);
		System.out.println(Smax);

	}

}
