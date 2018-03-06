package String_programes;

public class NextCharInString {

	public static void main(String[] args) {
		String str = "seleiumWebdriver";
		char[] ch = str.toCharArray();
		for (int i = 0; i<=ch.length - 1; i++) {
			System.out.print(ch[i] + "\t");
			System.out.println((char) (ch[i] + 1));
		}

	}

}
