package Chapter1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PalindromicPermutation {
	public static void main(String[] args) {
		String input ="aab";
		
		boolean res = palPerm(input);
		
		System.out.println(res);
	}

	private static boolean palPerm(String input) {
		
		int count = 0;
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<input.length();i++) {
			if(!map.containsKey(input.charAt(i))) {
				map.put(input.charAt(i),1);
			}
			else {
				map.put(input.charAt(i), map.get(input.charAt(i))+1);
			}
		}
		Set<Character> keys = map.keySet();
		
		for(char key : keys) {
			if((map.get(key)%2)!=0 && key!=' ') {
				count++;
			}
		}
		
		return (count>1)?false:true;
	}
}
