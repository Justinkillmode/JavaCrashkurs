
public class Rekursion {

	public static void main(String[] args) {
		loop(42);
	}
	
	static void loop(int anzahlDurchlaeufe) {
		if(anzahlDurchlaeufe > 0) 
		{
			System.out.println("Noch " + anzahlDurchlaeufe + " Durchl�ufe");
			loop(anzahlDurchlaeufe - 1);
		}
	}

}
