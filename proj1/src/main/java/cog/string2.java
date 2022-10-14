package cog;

public class string2 {

	// Reverse the word from give string
	public static void main(String[] args) {

		String name = "This is the real process + what i told you";

		String a[] = name.split(" ");

		for (int i = a.length - 1; i >= 0; i--) {

			System.out.print(a[i] + " ");
		}

	}

}