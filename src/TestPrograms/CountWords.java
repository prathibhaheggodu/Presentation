package TestPrograms;

public class CountWords {
	public static void main(String[] args) {
		String str = "SQL MANUAL JAVA SELENIUM";
		int count = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
				count++;
		}
		System.out.println("No of words in a given string is " + count);
	}
}
