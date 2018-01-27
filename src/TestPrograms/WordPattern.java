package TestPrograms;

public class WordPattern {
	public static void main(String[] args) {
		String txt = "JAVA";
		for (int i = 1; i <= txt.length(); i++) {
			for (int j = 1, s = 0; j <= i; j++) {
				System.out.print(txt.subSequence(s, s + 1));
				s++;
			}

			System.out.println();
		}
  
	}
}
 