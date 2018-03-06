package TySS;

public class primeString {

	public static void main(String[] args) {
		
		   int arr[]={1,2,3,4,5,6,7};
		   String s1[]={"","one","two","three","four","five","six","seven"};
			for(int i=0;i<arr.length;i++)
			{
				boolean isPrime=true;
				for(int j=2;j<arr[i];j++)
				{
		           if(arr[i]%j==0)
		               {
		        	   isPrime=false;
		        	   break;

		                }
		            else
		            {
		            	isPrime=true;

		            }

		       }
				if(isPrime&&arr[i]!=1){
					System.out.println(s1[arr[i]]);
					
				}
				else{
					System.out.println(arr[i]);
				}
			}
			}
		  

	

   }
