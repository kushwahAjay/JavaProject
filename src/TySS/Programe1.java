package TySS;

public class Programe1 {

	public static void main(String[] args) {
		String s="aab       bcaaacd";
		char [] ch=s.toCharArray();
		String s1=" ";
		int count=1;
		for(int i=0;i<ch.length;i++)
		{   
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					s1=s1+ch[j];
					System.out.print(s1);
					break;
				}
				System.out.print(count);
			}
		}

	}

}
