import java.util.*;

public class StringsMethods {

	
	public static void capitalize(String Word){
		String Str = "pineaple goes on pizza!";
		String cap = Str.substring(0, 1).toUpperCase() + Str.substring(1, 23);
		System.out.println(cap);
		
	}
	
	public static void wheresWaldo(String phrase) {
		String str = "Striped Waldo!";
		System.out.println(str.indexOf("Waldo"));
		
	}
	
	public static void firstThingsFirst(String a, String b) {
		String str1 = "cat";
		
		String str2 = "dog";
		
		int comp = str1.compareTo(str2);
		
		if (comp < 0 ) {
			System.out.println(str1);
		} else if (comp == 0) {
			System.out.println(str1 + str2);
		} else if (comp > 0) {
			System.out.println(str1);
		}
		
		
	}
	
	public static void reverse(String s) {
		String Str = "happy";
		
		StringBuffer sbr = new StringBuffer(Str);
		
		sbr.reverse();
		
		System.out.println(sbr);
	}
	
	public static void soLong(String a, String b) {
		String str1 = "Buy Ripple";
		
		String str2 = "Buy Stellar";
		
		if (str1.length() >= str2.length()) {
			System.out.println(str1);
		} else if (str1.length() <= str2.length()) {
			System.out.println(str2);
		}
			
	}
	
	public static void afterMath(String phrase) {
		String str1 = "She aced the mathematics test!";
		
		String str2 = "My floor mat is so keen!";
		
		if(str1.contains("math")) {
			System.out.println(str1.substring(str1.indexOf("math")));
		} else if (str2.contains("math")) {
			System.out.println(str2.substring(str2.indexOf("math")));
		} else {
			System.out.println("dud");
		}
				
	}
	
	public static void leterize(String word) {
		String str1 = "Java";
		
		for (int i = 0; i <  str1.length(); i++) {
			System.out.println(str1.charAt(i) + " ");
		}
			
		
	}
	
	public static void main(String[] args) {
		capitalize("");
		wheresWaldo("");
		firstThingsFirst("", "");
		reverse("");
		soLong("", "");
		afterMath("");
		leterize("");
	}

}





