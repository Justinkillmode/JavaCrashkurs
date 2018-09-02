
public class Var {

	public static void main(String[] args) {
		int zahl = 42; // +/- etwa 2 Milliarden
		long grossezahl = 1337L; // wirklich lang
		short kleineZahl = 7; // -32.768 ... 32.767
		byte sehrkleineZahl = -7; // -128 ... 127
		
		float kommaZahl = 3.14f; //weniger Nachkommastellen
		double genauereKommaZahl = 3.14159d; // mehr Nachkommastellen
		
		char zeichen = 'F'; //ein Zeichen also Buchstaben/Zahl/Sonderzeichen
		System.out.println(zeichen);
		
		boolean wahrOderFalsch = true; //true/false
		
		char zeichen2;
		zeichen2 = 'U';
		System.out.println(zeichen2);
		zeichen2 = 'N';
		System.out.println(zeichen2);
		System.out.println(zahl);

	}

}
