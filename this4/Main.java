package this4;

public class Main {

	public static void main(String[] args) {
		AlaaThis name = new AlaaThis();

		/* calling Ali*/
		name.Ali();
		
		/* calling Hayder
		 * then Hayder calling Ali
		 */
		name.Hayder();
		
		/* calling Bedn
		 * then Bedn calling Hayder
		 * then Hayder calling Ali
		 */
		name.Bedn();


	}

}
