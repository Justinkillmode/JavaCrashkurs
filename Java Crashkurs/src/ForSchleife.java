
public class ForSchleife {

	public static void main(String[] args) {
		int[] spieler = new int[4];
		
		for (int zaehler = 0; zaehler < spieler.length; zaehler++) 
		{
			spieler[zaehler] = zaehler +1;
		}
		
		for(int eintrag : spieler) 
		{
			System.out.println("Spieler " + eintrag + " ist im Spiel.");
		}

	}

}
