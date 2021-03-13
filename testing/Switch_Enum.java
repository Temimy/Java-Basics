package testing;


public class Switch_Enum {
	
	public static void main(String[] args) {
		
		Names name = Names.Bedn;
		
		switch (name) {
		case Alaa: { 
			System.out.println(" This is Alaa");
			break;
		} 

		case Temimy: {
			System.out.println(" This is Temimy");
			break;
		}

		case Bedn: {
			System.out.println(" This is Bedn");
			break;
		}

		default:
			System.out.println("This is non of library");
			break;
		}

	}

	}


