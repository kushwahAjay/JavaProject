package TySS;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringReverse {

	public static void main(String[] args) {
		 /*String s1="I   Love   Java";
		 String [] s2=s1.split(" ");
		 String s3="";
		 for(int i=0; i<=s2.length-1;i++)
		 {
			 if(s2[i].length()>0)
			 {
				 s3=s3+s2[i];
			 }
			
		 }
		 System.out.println(s3);*/ //Remove Spaces
		// To Remove duplicates elements in string array
		 /*String [] str= {"abc","Google","facebook","facebook","abc","Google"};
		 Set set=new HashSet();
		 for(String s:str)
		 {
			 set.add(s);
		 }
		 System.out.println(set);
		 
		Set hs2=new HashSet(Arrays.asList(str));
		System.out.println(hs2);*/
		String str1="Today is Bright sunny day";
		String words[]=str1.split(" ");
		System.out.println(Arrays.toString(words));
		String temp=" ";
		boolean flag=true;
		while(flag)
		{
			flag=false;
		for(int i=0;i<words.length-1;i++)
		{
			//                                                                                                                                                                                                                                                                                      if(words[i].length()>(words[i+1].length()))
			if(words[i].compareTo(words[i+1])>0)
			{
				temp=words[i];
				words[i]=words[i+1];
				words[i+1]=temp;
				flag=true;
			}
		}
	
		}
		System.out.println(Arrays.toString(words));
	}

	
		
	}


