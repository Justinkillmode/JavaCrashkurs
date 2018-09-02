
public class ForSchleife {

	public static void main(String[] args) {
		int[] spieler = new int[4];
		
		for (int zähler = 0; zähler < spieler.length; zähler++) 
		{
			spieler[zähler] = zähler +1;
		}
		
		for(int eintrag : spieler) 
		{
			System.out.println("Spieler " + eintrag + " ist im Spiel.");
		}

	}

}
