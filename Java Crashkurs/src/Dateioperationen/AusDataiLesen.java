package Dateioperationen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AusDataiLesen {

	public static void main(String[] args) throws FileNotFoundException {
		File daten = new File("daten.txt");
		
		Scanner sca = new Scanner(daten);
		while(sca.hasNextLine()) {
			System.out.println(sca.nextLine());
		}

	}

}
