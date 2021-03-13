package testing;

public class StringClass3 {

	public static void main(String[] args) {
		String s1 = "Alaa Bedn Temimy";
		// to get string length including spaces
		int m = s1.length();
		System.out.println(" length :" + m);

		// to get position of specific char or word
		int pos1 = s1.indexOf("Bedn");
		System.out.println(" Bedn position is :" + pos1);

		// to cut from specific location
		String pos2 = s1.substring(pos1);
		System.out.println(pos2);

		// to cut spaces
		String n = "      eng        ";
		int in = n.length();
		System.out.println(n + "" + in);
		String b = n.trim();
		System.out.println(b + " " + b.length());

	}

}
