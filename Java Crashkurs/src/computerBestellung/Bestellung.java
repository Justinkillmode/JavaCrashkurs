package computerBestellung;

public class Bestellung {

	public static void main(String[] args) {
		
		Computer gamingPC = new Computer("3.7GHz", "GTX 1080", "16GB DDR4", "1500€");
		Computer Notebook = new Computer("2,4GHz", "GTX 950n", "8GB DDR4", "900€");
		
		gamingPC.Datenblatt();
		Notebook.Datenblatt();
		
		gamingPC.arbeitsspeicher = "32GB DDR4";
		gamingPC.Datenblatt();

	}

}
