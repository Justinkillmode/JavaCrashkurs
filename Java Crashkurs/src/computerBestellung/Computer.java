package computerBestellung;

public class Computer {
	String prozessor;
	String grafikkarte;
	String arbeitsspeicher;
	String preis;
	
	Computer(String derProzessor, String dieGrafikkarte, String derArbeitsspeicher, String derPreis){
	prozessor = derProzessor;
	grafikkarte = dieGrafikkarte;
	arbeitsspeicher = derArbeitsspeicher;
	preis = derPreis;
	}
	
	void Datenblatt() {
		System.out.println("Prozessor: " + prozessor);
		System.out.println("Grafikkarte: " + grafikkarte);
		System.out.println("Arbeitsspeicher: " + arbeitsspeicher);
		System.out.println("Preis: " + preis);
	}
}
