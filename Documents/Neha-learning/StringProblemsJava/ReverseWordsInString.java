public class ReverseWordsInString {

	public static String reverse(String sentence) {

		String[] words = sentence.split(" ");

		StringBuilder rev = new StringBuilder();

		for (int i = 0; i < words.length; i++) {
			StringBuilder sb = new StringBuilder(words[i]);
			sb.reverse();
			rev.append(sb + " ");
		}

		return rev.toString();
	}

}
