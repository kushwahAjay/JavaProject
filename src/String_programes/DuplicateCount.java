package String_programes;

public class DuplicateCount {

	public static void main(String[] args) {
		String s = "aabb                     bcccd";
		char ch[] = s.toCharArray();

		for (int i = 0; i < s.length(); i++) {
			int count = 1;

			for (int j = i + 1; j < s.length(); j++) {
				if (ch[i] == ch[j] && ch[i] != ' ') {
					count++;
					ch[j] = ' ';

				}

			}

			if ( ch[i] != ' ') {
				System.out.println(s.charAt(i) + " has occurred " + count);
			}

		}

	}

}
