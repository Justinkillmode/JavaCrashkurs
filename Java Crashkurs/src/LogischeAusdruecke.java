
public class LogischeAusdruecke {

	public static void main(String[] args) {
		String modus = "Singelplayer";
		
		if(modus == "Singelplayer") 
		{
			System.out.println("Spiel wird geladen");
		}else if(modus == "Multiplayer") 
		{
			System.out.println("Spiel wird geladen");
		}
		
		if(modus == "Singelplayer" || modus == "Multiplayer") 
		{
			System.out.println("Spiel wird geladen");
		}
		
		boolean spielgekauft = false;
		int alter = 17;
		
		if (spielgekauft && alter >= 16) 
		{
			System.out.println("Spiel wird geladen");
		}
		
		if ((spielgekauft && alter >= 16) && (modus == "Singelplayer" || modus == "Multiplayer"))
		{
			System.out.println("Spiel wird geladen");
		}

	}

}
