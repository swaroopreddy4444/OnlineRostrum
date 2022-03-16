package OnlineRostrum;

public class CodeName {

	public static void main(String[] args) {
		String s = "super";
		int sum=0;
		s=s.toUpperCase();
		for(int i=0;i<s.length();i++) {
			sum+=s.charAt(i);
		}
		System.out.println(sum-s.length()*64);
	}
}
