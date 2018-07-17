package Chapter1;

public class Compression {
public static void main(String[] args) {
	
	String input = "aaabccccccbdg";
	
	//aab,abcd,aabccccaabdg,aabcccccaaa
	
	String output = compress(input);
	
	String res = (input.length()>output.length())?output:input;
	
	System.out.println(res);
}

private static String compress(String input) {
	
	StringBuilder sb = new StringBuilder();
	
	int count = 1;
	
	for(int i=0;i<input.length()-1;i++) {
		
		if(input.charAt(i)!=input.charAt(i+1)) {
			char a = input.charAt(i);
			sb.append(a);
			sb.append(count);
			count=1;
		}
		else {
			count++;
		}
	}
	//Append the last character
	if(count!=1) {
		sb.append(input.charAt(input.length()-1));
		sb.append(count);	
	}
	else {
		sb.append(input.charAt(input.length()-1));
		sb.append(count);
	}
	
	return sb.toString();
}
}
