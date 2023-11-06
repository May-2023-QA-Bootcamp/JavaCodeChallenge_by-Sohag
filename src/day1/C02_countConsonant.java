package day1;

public class C02_countConsonant {

	// method to count Consonent

	public static void countConsonent(String str) {
		int vowels = 0;
		int consonent = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {

				vowels++;

			} else {

				consonent++;
			}

		}

		System.out.println(vowels);
		System.out.println(consonent);

	}

	public static void main(String[] args) {

		String str = "mamun";
		countConsonent(str);

	}

}
