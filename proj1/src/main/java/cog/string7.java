package cog;

public class string7 {

	
	

	public static void main(String[] args) {

		String str = "This is my name";

		String a[] = str.split(" ");

		for (int i = a.length - 1; i >= 0; i--) {

			System.out.print(a[i] + " ");
		}

	}


}
