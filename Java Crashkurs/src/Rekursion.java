
public class Rekursion {

	public static void main(String[] args) {
		loop(42);
	}
	
	static void loop(int anzahlDurchläufe) {
		if(anzahlDurchläufe > 0) 
		{
			System.out.println("Noch " + anzahlDurchläufe + " Durchläufe");
			loop(anzahlDurchläufe - 1);
		}
	}

}
