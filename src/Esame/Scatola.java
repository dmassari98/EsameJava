package Esame;

public class Scatola extends Pacco{
	
	private String destinazione;
	private float peso;

	public Scatola(String mittente, String dest, float costo, String destinazione, float peso) {
		super(mittente, dest, costo);
		this.destinazione=destinazione;
		this.peso=peso;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return mittente + " " + dest + " " + costo + " " + destinazione + " " + peso;
	}
	
	public float getPeso() {
		return peso;
	}

}
