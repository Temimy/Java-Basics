package daily;

public class InpStrng {

	public static void main(String[] args) {

		System.out.println(" Input your name :");

		String fstName, ftherName;
		fstName = fstName();
		// System.out.println(outName);
		System.out.println(" Input your father name :");

		ftherName = fatherName();

		StringBuilder totName = new StringBuilder();
		totName.append(fstName + "  " + ftherName);
		System.out.println(totName);

	}

	public static String fstName() {

		return ExtInput.ExtractedInput();

	}

	public static String fatherName() {
		return ExtInput.ExtractedInput();

	}

}
