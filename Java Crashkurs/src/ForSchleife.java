
public class ForSchleife {

	public static void main(String[] args) {
		int[] spieler = new int[4];
		
		for (int z�hler = 0; z�hler < spieler.length; z�hler++) 
		{
			spieler[z�hler] = z�hler +1;
		}
		
		for(int eintrag : spieler) 
		{
			System.out.println("Spieler " + eintrag + " ist im Spiel.");
		}

	}

}
