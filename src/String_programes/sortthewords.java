package String_programes;

import java.util.Arrays;

public class sortthewords {
      
	static void wordSort(String[] arr)
	{
		String temp="";
		boolean flag=true;
		while(flag)
		{
			flag=false;
			for(int i=0;i<arr.length-1;i++)
			{
				if(arr[i].length()>arr[i+1].length())
				{
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					flag=true;
				}
			}
		}
	}
	public static void main(String[] args) {
		String str="tommorow is not  holiday and you have mock";
		String words[]=str.split(" ");
		wordSort(words);
		System.out.println(Arrays.toString(words));
	}

}
