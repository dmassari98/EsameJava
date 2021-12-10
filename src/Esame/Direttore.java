package Esame;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Direttore {
	
	private String nome, cognome;
	
	private ArrayList<Impiegato> ListaImpiegati;
	
	public Direttore(String nome, String cognome) {
		this.nome=nome;
		this.cognome=cognome;
		ListaImpiegati = new ArrayList<Impiegato>();
	}
	
	public void addImpiegati(ArrayList<Impiegato> Lista) {
		ListaImpiegati.addAll(Lista);
	}
	
	protected void ordinaImpiegati() {	
		for(int i=0; i<ListaImpiegati.size(); i++)
			for(int j=i+1; j<ListaImpiegati.size(); j++) {
				if(ListaImpiegati.get(i).getPerformance() < ListaImpiegati.get(j).getPerformance())
				Collections.swap(ListaImpiegati, i, j);
			}
	}
	
	public void stampaImpiegati() {
		ordinaImpiegati();
		File fileImp = new File("impiegati-"+cognome+".txt");
		BufferedWriter scrivi;
		try {
			scrivi = new BufferedWriter(new FileWriter(fileImp, true));
			for(int i=0; i<ListaImpiegati.size(); i++) {
				System.out.println(ListaImpiegati.get(i).getInfo());
				scrivi.write(ListaImpiegati.get(i).getInfo());
			}
			scrivi.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
