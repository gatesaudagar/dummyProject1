package cog;

public class string3 {

	public static void main(String[] args) {

		String str = "Saudagar";

		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			for (int j = 0; j < str.length(); j++) {

				char c = str.charAt(j);

				if (ch == c) {
					count++;

				}

			}

			

		}
			
	}

}
