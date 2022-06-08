package OnlineRostrum;

public class CodeName {

	public static void main(String[] args) {
		String s = "Super";
		int sum = 0;
		s = s.toUpperCase();
		for (int i = 0; i < s.length(); i++) {
			sum += s.charAt(i);
		}
		System.out.println(sum - s.length() * 64);
		
		String s1="Super";  
		System.out.println(s1.endsWith("r"));  
		System.out.println(s1.endsWith("per"));  

	}

}
