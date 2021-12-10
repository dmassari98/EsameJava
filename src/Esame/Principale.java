package Esame;

import java.util.ArrayList;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Direttore D = new Direttore("Daniele", "Massari");
		
		Impiegato I1, I2;
		I1 = new Impiegato(1, "Francesco", "Buono");
		I2 = new Impiegato(2, "Antonio", "Lozitiello");
		
		ArrayList<Impiegato> Lista = new ArrayList<Impiegato>();
		Lista.add(I1);
		Lista.add(I2);
		D.addImpiegati(Lista);
		
		
		I1.caricaFile("Impiegato1.txt");
		I2.caricaFile("Impiegato2.txt");
		
		System.out.println("Scatole impiegato 1");
		I1.printScatole();
		System.out.println("lettere impiegato 1");
		I1.printLettere();
		
		System.out.println("\n");
		System.out.println("Scatole impiegato 2");
		I2.printScatole();
		System.out.println("lettere impiegato 2");
		I2.printLettere();
		
		I1.inviaLettera();
		I1.inviaLettera();
		I1.inviaLettera();
		I1.inviaScatola();
		I1.inviaScatola();
		I1.inviaScatola();
		
		I2.inviaLettera();
		I2.inviaLettera();
		I2.inviaLettera();
		I2.inviaScatola();
		I2.inviaScatola();
		I2.inviaScatola();
		
		D.stampaImpiegati();
	}

}
