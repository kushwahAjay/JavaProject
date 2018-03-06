package TySS;

public class DupliacteWords {

	public static void main(String[] args) {
		String s = "hi hi hi hello bye bye";
		String ch[] = s.split(" ");

		for (int i = 0; i < ch.length; i++) {
			int count = 1;

			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i].equals(ch[j]) && ch[i] != " ") {
					count++;
					ch[j] = " ";

				}

			}

			if (count > 1 && ch[i] != " ") {
				System.out.println(ch[i] + " has occurred " + count);
			}

		}

	}

}





