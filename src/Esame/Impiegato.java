package Esame;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Impiegato {
	
	private String nome, cognome;
	private ArrayList<Lettera> PilaLettere;
	private ArrayList<Scatola> CodaScatole;
	private int id, head, size, tail, Pilasize, pointer;
	private float performance;
	
	public Impiegato(int id, String nome, String cognome) {
		this.id=id;
		this.nome=nome;
		this.cognome=cognome;
		PilaLettere = new ArrayList<Lettera>();
		CodaScatole = new ArrayList<Scatola>();
		head=0;
		size=0;
		tail=0;
		Pilasize=0;
		pointer=-1;
		performance=0;
	}
	
	public void printLettere() {
		for(int i=0; i<PilaLettere.size(); i++) 
			System.out.println(PilaLettere.get(i).getInfo());
	}
	
	public void printScatole() {
		for(int i=0; i<CodaScatole.size(); i++) 
			System.out.println(CodaScatole.get(i).getInfo());
	}
	
	public String getInfo() {
		return id + " " + nome + " " +cognome + " " + performance;
	}
	
	public void caricaFile(String nomefile) {
		File f = new File(nomefile);
		Scanner readFile;
		try {
			readFile = new Scanner(f);
			while(readFile.hasNextLine()) {
				String[] datiFile = readFile.nextLine().split(" ");
				float costo = Float.parseFloat(datiFile[2]);
				if(datiFile.length==5) {
					float peso = Float.parseFloat(datiFile[4]);
					CodaScatole.add(new Scatola(datiFile[0], datiFile[1], costo, datiFile[3], peso));
					tail = (tail + 1) % CodaScatole.size();
					size++;
				}else {
					PilaLettere.add(new Lettera(datiFile[0], datiFile[1], costo, datiFile[3]));
					Pilasize++;
					pointer++;
				}				
				System.out.println("File caricato");
			}
			readFile.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public void inviaScatola() { //a ogni chiamata invia una sola scatola 
		File file1 = new File(id+"-Scatole.txt");
		if(size==0) {
			System.out.println("Coda Scatole vuota");
		}else {		
			BufferedWriter scrivi;
			try {
				scrivi = new BufferedWriter(new FileWriter(file1, true));
				scrivi.write(CodaScatole.get(head).getInfo() +"\n");
				performance = performance + CodaScatole.get(head).getPeso();
				head = (head + 1)% CodaScatole.size();
				size--;	
				scrivi.close();
				System.out.println("Scatola inviata");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}
	
	public void inviaLettera() { //a ogni chiamata invia una sola lettera
		File file2 = new File(id+"-Lettere.txt");
		if(pointer<0) {
			System.out.println("Pila lettere vuota");
		}else {		
			BufferedWriter scrivi;
			try {
				scrivi = new BufferedWriter(new FileWriter(file2, true));
				scrivi.write(PilaLettere.get(pointer).getInfo() +"\n");
				performance++;
				pointer--;
				scrivi.close();
				System.out.println("Lettera inviata");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}
	
	public float getPerformance() {
		return performance;
	}

}
