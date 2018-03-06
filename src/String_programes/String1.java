package String_programes;

public class String1 {

	public static void main(String[] args) {
		String s1="i love java";
		String s2="";
		for(int i=0;i<=s1.length()-1;i++)
		{
			//s2=s1.charAt(i)+s2;
			s2=s2+s1.charAt(i);
			//System.out.println(s2);
		}
		System.out.println(s2);
	}

}
