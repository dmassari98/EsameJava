package Esame;

public class Lettera extends Pacco{
	
	private String destinazione;

	public Lettera(String mittente, String dest, float costo, String destinazione) {
		super(mittente, dest, costo);
		this.destinazione=destinazione;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return mittente + " " + dest + " " + costo + " " + destinazione;
	}

}
