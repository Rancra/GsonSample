package dad.maven.gson;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduzca el nombre.");
		String scannernomb = scanner.nextLine();
		System.out.println("Introduzca los apellidos.");
		String scannerapel = scanner.nextLine();
		System.out.println("Introduzca la edad.");
		int scanneredad = scanner.nextInt();
		
		Persona persona = new Persona(scannernomb,scannerapel,scanneredad);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(persona);
		System.out.println(json);

		
		scanner.close();
	}

}
