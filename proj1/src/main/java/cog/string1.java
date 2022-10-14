package cog;

public class string1 {

	public static void main(String[] ars) {

		String name = "       Suadagar      ";

		int totalLenght = name.length();

		String reverse = "";
		for (int i = totalLenght - 1; i >= 0; i--) {

			reverse = reverse + name.charAt(i);

		}
		System.out.println(reverse.trim());
		System.out.println(name.trim());
		

	}

}
