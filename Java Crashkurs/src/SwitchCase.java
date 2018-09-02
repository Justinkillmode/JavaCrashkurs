
public class SwitchCase {

	public static void main(String[] args) {
		String zahl = "01";
		
		switch (zahl) 
		{
		case "1"  :
		case "01" : System.out.println("01");
					break;
		case "02" : System.out.println("02");
					break;
		case "03" : System.out.println("03");
					break;
		default   : System.out.println("Kann nur bis 3 Zählen");
		}

	}

}
