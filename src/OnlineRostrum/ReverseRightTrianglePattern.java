package OnlineRostrum;

public class ReverseRightTrianglePattern {
	
	public static void main(String args[]) {
		int x = 5;
		for (int i = x; i > 0; i--) {
			for (int k = x; k > i; k--) {
				System.out.print(" ");
			}
			for (int j = i; j > 0; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
