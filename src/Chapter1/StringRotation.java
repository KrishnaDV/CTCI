package Chapter1;

public class StringRotation {
public static void main(String[] args) {
	String a = "waterbottle";
	String b = "erbottlewat";
	boolean result = isRotation(a,b);
	System.out.println(result);
}

private static boolean isRotation(String a, String b) {
	
	if(a.length()!=b.length() || a.isEmpty()) {
		return false;
	}
	else {
		
		String mix = a+a;
		return mix.contains(b);		
	}
}
}
