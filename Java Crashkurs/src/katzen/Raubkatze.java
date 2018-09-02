package katzen;

public class Raubkatze extends Katze{
	String Beute;
	
	Raubkatze(String rasse, int gewicht, String dieBeute){
		super(rasse, gewicht);
		this.Beute = dieBeute;
	}

}
