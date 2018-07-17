package Chapter1;

import java.util.HashMap;
import java.util.Map;

public class CheckPermutation {

	public static void main(String[] args) {

		String a = "aa";
		String b = "aab";

		boolean result = isPerm(a, b);

		System.out.println(result);

	}

	private static boolean isPerm(String a, String b) {
		
		if(a.length()!=b.length())
			return false;

		Map<Character, Integer> source = new HashMap<>();

		Map<Character, Integer> dest = new HashMap<>();

		for (int i = 0; i < a.length(); i++) {
			if (!source.containsKey(a.charAt(i))) {
				source.put(a.charAt(i), 1);
			} else {
				source.put(a.charAt(i), source.get(a.charAt(i)) + 1);
			}
		}

		for (int i = 0; i < b.length(); i++) {
			if (!dest.containsKey(b.charAt(i))) {
				dest.put(b.charAt(i), 1);
			} else {
				dest.put(b.charAt(i), dest.get(b.charAt(i)) + 1);
			}
		}

		for (int i = 0; i < a.length(); i++) {
			if (!dest.containsKey(a.charAt(i)))
				return false;
			else if (source.get(a.charAt(i)) != dest.get(a.charAt(i))) {
				return false;
			}
		}

		return true;
	}
}
