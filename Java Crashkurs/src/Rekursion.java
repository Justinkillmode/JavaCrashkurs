
public class Rekursion {

	public static void main(String[] args) {
		loop(42);
	}
	
	static void loop(int anzahlDurchl�ufe) {
		if(anzahlDurchl�ufe > 0) 
		{
			System.out.println("Noch " + anzahlDurchl�ufe + " Durchl�ufe");
			loop(anzahlDurchl�ufe - 1);
		}
	}

}
