package _01_StringBuilder;

public class _03_StringBuilder {

	static StringBuilder builder;

	public static String append(String str, char[] characters) {
		builder = new StringBuilder(str);
		for (int i = 0; i < characters.length; i++) {
			builder.append(characters[i]);
		}
		return builder.toString();
	}

	public static String reverse(String str) {
		builder = new StringBuilder(str);
		return builder.reverse().toString();
	}

	public static String insert(String str, int index, char newChar) {
		builder = new StringBuilder(str);
		return builder.insert(index, newChar).toString();
	}

	public static String delete(String str, int startIndex, int endIndex) {
		builder = new StringBuilder(str);
		return builder.delete(startIndex, endIndex).toString();
	}
}