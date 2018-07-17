package Chapter1;

import java.util.HashMap;
import java.util.Map;

public class IsUnique {

	public static void main(String[] args) {

		String test = "anika";
		boolean result = isUnique(test);
		System.out.println(result);
	}
	
	private static boolean isUnique(String test) {

//		char[] inp = test.toCharArray();
//
//		Arrays.sort(inp);
//		
//		for (int i = 0; i < (inp.length - 1); i++) {
//			if (inp[i] == inp[i + 1]) {
//				return false;
//			}
//		}
//
//		return true;

		Map<Character, Integer> cmap = new HashMap<>();

		for (int i = 0; i < test.length(); i++) {

			if (!cmap.containsKey(test.charAt(i))) {
				cmap.put(test.charAt(i), 1);
			} else {
				return false;
			}
		}

		return true;
	}

}
