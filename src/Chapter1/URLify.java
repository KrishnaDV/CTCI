package Chapter1;

public class URLify {
	public static void main(String[] args) {
		String inp = "Mr John Smith    ";
		char[] result = urlify(inp.toCharArray(), 13);
		for (char out : result) {
			System.out.print(out);
		}
	}

	private static char[] urlify(char[] charArray, int length) {

		int spaces = countSpaces(charArray, length);

		int end = (2 * spaces) + (length - 1);

		for (int i = length - 1; i >= 0; i--) {
			if (charArray[i] == ' ') {
				charArray[end] = '0';
				charArray[end-1] = '2';
				charArray[end-2] = '%';
				end = end - 3;
			} else {
				charArray[end] = charArray[i];
				end--;
			}
		}

		return charArray;
	}

	private static int countSpaces(char[] charArray, int length) {

		int count = 0;

		for (int i = 0; i <length; i++) {
			if (charArray[i] == ' ')
				count++;
		}
		return count;
	}
}
