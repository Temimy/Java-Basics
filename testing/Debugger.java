package testing;

import java.net.MalformedURLException;
import java.net.URL;

public class Debugger {

	public static void main(String[] args) {
		// URL library for Internet address
		try {
			URL url = new URL("https://www.oracle.com");
		} catch (MalformedURLException e) {

			// get the error message exactly 
			System.out.println(e.getMessage());
		}

		System.out.println("Alaa Temimy");

	}

}
