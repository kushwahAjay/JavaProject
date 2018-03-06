package Arrays;

public class Pattern {

	public static void main(String[] args) {
		char ch='A';
		int rw=3,st=5;
		for(int i=1;i<=rw;i++) {
			for(int j=1;j<=st;j++) {
				System.out.print(ch);
				if(i%2!=0) {
					ch++;
				}
				else
					ch--;
			}
			
			
		
		if(i%2!=0) {
			ch=(char) (ch+4);
		}
		else {
			ch=(char) (ch+6);
		}
		System.out.println();

		}
		
	}

}

