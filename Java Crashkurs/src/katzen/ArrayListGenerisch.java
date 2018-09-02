package katzen;

import java.util.ArrayList;

public class ArrayListGenerisch {

	public static void main(String[] args) {
		ArrayList<String> liste = new ArrayList<String>();
		
		liste.add("eins");
		liste.add("zwei");
		liste.add("drei");
		liste.add("vier");
		liste.add("fünf");
		
		for(String element : liste) {
			System.out.println(element);
		}
		
		ArrayList<Integer> listeint = new ArrayList<Integer>();
		
		listeint.add(1);
		listeint.add(2);
		listeint.add(3);
		listeint.add(4);
		listeint.add(5);
		
		for(Integer element : listeint) {
			System.out.println(element);
		}

	}

}
